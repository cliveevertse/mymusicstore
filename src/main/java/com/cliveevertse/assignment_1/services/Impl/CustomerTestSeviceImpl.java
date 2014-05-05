/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.services.Impl;


import com.cliveevertse.assignment_1.model.Customer;
import com.cliveevertse.assignment_1.services.CustomerTestService;
import com.cliveevertse.assignment_1.services.crud.CustomerCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Clive
 */
@Service("customerTestService")
public class CustomerTestSeviceImpl implements CustomerTestService {

   @Autowired
   private CustomerCrudService customerCrudService;

   @Override
   public String retriveCustomerAddress(String customerNumber, String type) {
      Customer customer = customerCrudService.getByPropertyName("customerNumber", customerNumber);
      if (customer != null) {
         if (type.equalsIgnoreCase("Postal")) {
            return customer.getCustomerAddress().getPostalAddress();
         } else {
            if (type.equalsIgnoreCase("Street")) {
               return customer.getCustomerAddress().getStreetAddress();
            } else {
               throw new UnsupportedStreetTypeException("Address type " + type + " not support");
            }
         }
      } else {
         throw new UnknownCustomerException("Customer " + customerNumber + " was not found");
      }
   }

   @Override
   public String retriveCustomerCellNumber(String customerNumber) {
      Customer customer = customerCrudService.getByPropertyName("customerNumber", customerNumber);
      if (customer != null) {
         String cno = customer.getContact().getCellNumber();
         if (cno != null) {
            return cno;
         }
         throw new UnknownCustomerCellnoException("Customer does not have a cell number");
      } else {
         throw new UnknownCustomerException("Customer " + customerNumber + " was not found");
      }
   }
}
