/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cliveevertse.assignment_1.services;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Clive
 */
public interface CreditCardApprovalService {
    public String processPayment(String number, BigDecimal amount,Date expiryDate);
    
}
