package com.party.hulchul.service;

import java.util.List;

import com.party.hulchul.model.CustomerDetails;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Customer Details.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/

interface CustomerDetailsService {
	
	CustomerDetails create(CustomerDetails customerDetails);
	 
	CustomerDetails delete(String id);
 
    List<CustomerDetails> findAll();
 
    CustomerDetails findById(String id);
 
    CustomerDetails update(CustomerDetails customerDetails);
}
