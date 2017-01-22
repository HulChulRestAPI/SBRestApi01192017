package com.party.hulchul.dao;

import java.util.List;
import java.util.Optional;

import com.party.hulchul.model.CustomerDetails;

interface CustomerDetailsRepository{
	
	/**
	* <h1>The responsibility of this interface is to provide a common 
	* facade for all the CRUD operations related to Customer Details.</h1>
	*
	* @author  Soumya
	* @version 1.0
	* @since   2017-01-21
	*/
	
    void delete(CustomerDetails deleted);
    
    List<CustomerDetails> findAll();
 
    Optional<CustomerDetails> findOne(String id);
 
    CustomerDetails save(CustomerDetails saved);
}
