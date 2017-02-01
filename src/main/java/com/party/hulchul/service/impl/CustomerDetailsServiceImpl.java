package com.party.hulchul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.party.hulchul.dao.CustomerDetailsRepository;
import com.party.hulchul.dao.CustomerSearchRepository;
import com.party.hulchul.model.Customer;
import com.party.hulchul.model.CustomerDetails;
import com.party.hulchul.service.CustomerDetailsService;

/**
* <h1>This class is the implementation class of the service interface.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/

@Component
public class CustomerDetailsServiceImpl implements CustomerDetailsService  {

	@Autowired
	private CustomerDetailsRepository repo;
	
	
	@Autowired
	private CustomerSearchRepository searchRepo;
	
	
	/**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
	 * This method is responsible for creating the Customer Details
	 * 
	 * @param customerDetails
	 * @return
	 */
	@Override
	public CustomerDetails create(CustomerDetails customerDetails) {
		repo.save(customerDetails);
		return null;
	}

	/**
	 * @author  Soumya
	 * @since   2017-01-22
	 *  
	 * This method is responsible for deleting the Customer Details
	 * @param id
	 * @return
	 */
	@Override
	public boolean delete(String id) {
		repo.delete(id);
		
		return true;
	}

    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
	 * This method is responsible for find all Customer Details
     * @return
     */
	@Override
	public List<CustomerDetails> findAll() {
		// TODO needs to be implement
		return null;
	}

    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
	 * This method is responsible for find specific Customer Details
     * @param id
     * @return
     */
	@Override
	public CustomerDetails findById(String id) {
		repo.findOne(id);
		return null;
	}

    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 *
	 * This method is responsible for update the Customer Details
     * @param customerDetails
     * @return
     */
	@Override
	public CustomerDetails update(CustomerDetails customerDetails) {
		repo.save(customerDetails);
		return null;
	}

	
	@Override
	public List<Customer> searchCustomerByCustomString(String searchString) {
		return searchRepo.searchCustomerByCustomString(searchString);
	}

	
	
}
