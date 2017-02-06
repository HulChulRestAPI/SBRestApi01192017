package com.party.hulchul.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.party.hulchul.model.Customer;
import com.party.hulchul.request.CustomerDetails;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Customer Details.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/
@org.springframework.stereotype.Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
     * @param deleted
     */
   // boolean delete(String id);
    
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @return
     */
    List<Customer> findAll();
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param id
     * @return
     */
   // Optional<CustomerDetails> findOne(String id);
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param saved
     * @return
     */
    Customer save(Customer saved);
    
    //@Query("")
    //Iterable<CustomerDetails> searchByName(String searchName);
    
}
