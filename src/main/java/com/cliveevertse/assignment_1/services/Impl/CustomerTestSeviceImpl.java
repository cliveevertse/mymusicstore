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

   
}
