/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliveevertse.assignment_1.app.factory;

import com.cliveevertse.assignment_1.model.Album;

import com.cliveevertse.assignment_1.model.CreditCard;
import com.cliveevertse.assignment_1.model.Customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Clive
 */
public class AppFactory {

   // Create a Credit card with Name, balance, expiry date and credit Number 
   public static CreditCard getCreditCard(Map<String, String> details, BigDecimal balance, Date expiryDate) {
      CreditCard creditCard = new CreditCard();
      creditCard.setCreditNumber(details.get("number"));
      creditCard.setNameOnCredit(details.get("name"));
      creditCard.setBalance(balance);
      creditCard.setExpiryDate(expiryDate);
      return creditCard;
   }

   

   public static Customer getCustomer(String name) {
      Customer customer = new Customer();
      customer.setName(name);
      return customer;
   }
   
   public static Album getAlbum(String albumTitle, BigDecimal unitPrice, int inventory, int sale) {
      Album album = new Album();
      album.setAlbumTitle(albumTitle);
      album.setUnitPrice(unitPrice);
      album.setInventory(inventory);
      album.setSales(sale);
      return album;
   }
   
   
   
}
