package com.party.hulchul.service;

import java.util.List;

import com.party.hulchul.model.CustomerDetails;

interface CustomerDetailsService {
	
	CustomerDetails create(CustomerDetails customerDetails);
	 
	CustomerDetails delete(String id);
 
    List<CustomerDetails> findAll();
 
    CustomerDetails findById(String id);
 
    CustomerDetails update(CustomerDetails customerDetails);
}
