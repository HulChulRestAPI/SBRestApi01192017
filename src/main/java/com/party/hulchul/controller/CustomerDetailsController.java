/**
 * 
 */
package com.party.hulchul.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.model.Vendor;

/**
 * @author RKottak
 *
 */
@RequestMapping("/v1/customer")
@RestController
public class CustomerDetailsController {
    
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
}
