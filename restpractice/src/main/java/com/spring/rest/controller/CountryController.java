package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.bean.Country;
import com.spring.rest.exception.CountryNotFoundException;
import com.spring.rest.service.CountryService;

@RestController
@Validated
public class CountryController {

	@Autowired
	CountryService countryService;

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List getCountries() {
		List listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		
		Country country = countryService.getCountry(id);
		System.out.println("---------inside getCountryById method---------");
		try {
			if(country.getCountryName().equalsIgnoreCase("null")) {
				
			}
		}catch(Exception e) {
			System.out.println("----inside catch block------");
			throw new CountryNotFoundException("id not found");
		}
		
		return countryService.getCountry(id);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.POST, headers = "Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Country updateCountry(@RequestBody Country country) {
		return countryService.updateCountry(country);

	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		countryService.deleteCountry(id);

	}
}
