package com.party.hulchul.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.party.hulchul.model.CustomerDetails;

/**
* <h1>The responsibility of this interface is to provide a common 
* facade for all the CRUD operations related to Customer Details.</h1>
*
* @author  Soumya
* @version 1.0
* @since   2017-01-21
*/

public interface CustomerDetailsRepository extends Repository<CustomerDetails, String> {
	
    /**
	 * @author  Soumya
	 * @since   2017-01-22
	 * 
     * @param deleted
     */
    void delete(CustomerDetails deleted);
    
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @return
     */
    List<CustomerDetails> findAll();
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param id
     * @return
     */
    Optional<CustomerDetails> findOne(String id);
 
    /**
	 * @author  Soumya
	 * @since   2017-01-22
     * 
     * @param saved
     * @return
     */
    CustomerDetails save(CustomerDetails saved);
}
