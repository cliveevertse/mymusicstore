/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.services.Impl;


import com.cliveevertse.assignment_1.app.exceptions.CreditCardRejectionException;
import com.cliveevertse.assignment_1.model.CreditCard;
import com.cliveevertse.assignment_1.services.CreditCardApprovalService;
import com.cliveevertse.assignment_1.services.crud.CreditCardCrudService;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.ws.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Clive
 */

public class CreditCardApprovalserviceImpl implements CreditCardApprovalService {
    // Inject the CRUD Service 

    @Autowired
    private CreditCardCrudService creditCardCrudService;

    @Override
    public String processPayment(String number, BigDecimal amount, Date expiryDate) {
        //Search Credit card By creditNumber property on The Entity to Find if it is in the System
        CreditCard creditCard = creditCardCrudService.getByPropertyName("creditNumber", number);
        //Test if we have a credit card. 
        // If Not Jump to the Last ELSE and throw CC Rejection  Exception --Wrong Number 
        if (creditCard != null) {
            // If we have a Card Check For sufficient Funds
            //If Less Funds Throw Exception ELSE APPROVE
            if (amount.doubleValue() > creditCard.getBalance().doubleValue()) {
                throw new CreditCardRejectionException("Insufficient Funds In the Account");
            } else if (expiryDate.after(creditCard.getExpiryDate())) {
                //IF expiry Date is Before Credit card EXPIRY DATE Throw Exception
                throw new CreditCardRejectionException("Sorry Credit Date Expired");
            } else {
                return "APPROVED";
            }
        } else {
            throw new CreditCardRejectionException("Credit Number is Wrong");
        }
    }
}
