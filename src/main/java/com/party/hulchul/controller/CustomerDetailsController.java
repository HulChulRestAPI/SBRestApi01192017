/**
 * 
 */
package com.party.hulchul.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.model.CustomerDetails;
import com.party.hulchul.model.Vendor;
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
    
    
	@RequestMapping(value = "/vendorDtls", method = RequestMethod.GET, headers = {"Content-type=application/json"}, params = {"customerId"})
    public List<Vendor> getCustomerDetails(@RequestParam(value="customerId") String customerID) 
    {
		List<Vendor> vendorList = new ArrayList<Vendor>();
		System.out.println("customerID:"+ customerID);
		if(customerID != null && customerID.equals("10")){
	        vendorList.add(new Vendor(100,"Vendor FN","Vendor LN","vendorFN.LN@gmail.com"));
		}
		vendorList.add(new Vendor(101,"Vendor FN","Vendor LN","vendorFN.LN@gmail.com"));
        return vendorList;
    }
	
	@RequestMapping(value="/updateCustDtls", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public void updateCustomerDtls(@RequestBody String payload) throws Exception {
        System.out.println(payload);
    }
	
	
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param todoEntry
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @Consumes("application/json")
    CustomerDetails createCustomerDetails(@RequestBody @Valid CustomerDetails todoEntry) {
        return service.create(todoEntry);
    }
}
