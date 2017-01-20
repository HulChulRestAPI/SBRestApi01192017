/**
 * 
 */
package com.party.hulchul.controller;

import java.util.ArrayList;
import java.util.List;

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


	@RequestMapping(value = "/vendorDtls", method = RequestMethod.GET, params = {"customerId"})
    public List<Vendor> getCustomerDetails(@RequestParam(value="customerId") String customerID) 
    {
		List<Vendor> vendorList = new ArrayList<Vendor>();
		if(customerID != null && customerID.equals(10)){
	        vendorList.add(new Vendor(100,"Vendor FN","Vendor LN","vendorFN.LN@gmail.com"));
		}
        return vendorList;
    }
}
