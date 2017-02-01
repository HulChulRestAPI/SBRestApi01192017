/**
 * 
 */
package com.party.hulchul.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.party.hulchul.model.CustomerDetails;
import com.party.hulchul.service.CustomerDetailsService;
import com.party.hulchul.util.JsonParserUtil;

/**
 * @author RKottak
 *
 */
@RequestMapping("/v1/customer")
@RestController
public class CustomerDetailsController {
	@Autowired
	CustomerDetailsService service;

	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET, params = { "customerId" })
	@Consumes("application/json")
	public CustomerDetails getCustomerDetails(@RequestParam(value = "customerId") String customerId) {
		return service.findById(customerId);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET, params = { "customerId" })
	@Consumes("application/json")
	public boolean deleteCustomerDetails(@RequestParam(value = "customerId") String customerId) {
		return service.delete(customerId);
	}

	/**
	 * @author Soumya
	 * @since 2017-01-22
	 * 
	 * @param todoEntry
	 * @return
	 */
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	@Consumes("application/json")
	CustomerDetails createCustomerDetails(@RequestBody @Valid CustomerDetails todoEntry) {
		return service.create(todoEntry);
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody String searchCustomerDetails(@RequestParam(value = "search") String search, HttpServletRequest request) {

		return JsonParserUtil.toString(service.searchCustomerByCustomString(search));

	}

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	@Consumes("application/json")
	CustomerDetails updateCustomer(@RequestBody @Valid CustomerDetails todoEntry) {
		return service.update(todoEntry);
	}
}
