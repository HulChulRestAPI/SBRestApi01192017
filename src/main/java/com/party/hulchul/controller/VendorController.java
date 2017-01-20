/**
 * 
 */
package com.party.hulchul.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.model.Vendor;

/**
 * @author RKottak
 *
 */
@RequestMapping("/v1/vendor")
@RestController
public class VendorController {

	@RequestMapping("/vendorDtls")
    public List<Vendor> getVendors() 
    {
        List<Vendor> vendorList = new ArrayList<Vendor>();
        vendorList.add(new Vendor(100,"Vendor FN","Vendor LN","vendorFN.LN@gmail.com"));
        return vendorList;
    }
	
	@RequestMapping("/vendorContDtls")
    public List<Vendor> getVendorContDtls() 
    {
        List<Vendor> vendorList = new ArrayList<Vendor>();
        vendorList.add(new Vendor(100,"Vendor FN","Vendor LN","vendorFN.LN@gmail.com"));
        return vendorList;
    }
}
