/**
 * 
 */
package com.party.hulchul.controller;

import javax.validation.Valid;
import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.model.CustomerDetails;
import com.party.hulchul.service.CustomerDetailsService;

/**
 * @author RKottak
 *
 */
@RequestMapping("/v1/customer")
@RestController
public class CustomerDetailsController {
    @Autowired
    CustomerDetailsService service;
    
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET, params = {"customerId"})
	@Consumes("application/json")
	public CustomerDetails getCustomerDetails(@RequestParam(value="customerId") String customerID){
        return service.findById(customerID);
    }
	
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param todoEntry
     * @return
     */
    @RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
    @Consumes("application/json")
    CustomerDetails createCustomerDetails(@RequestBody @Valid CustomerDetails todoEntry) {
        return service.create(todoEntry);
    }
}
