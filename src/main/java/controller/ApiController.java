package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import response.CategoriesResponse;
import rest.RestTemplateService;

@RestController
public class ApiController {

	@Autowired
	private RestTemplateService rest;

	/* get all countries from api https://restcountries.com/v2/all */
	@GetMapping("/countries")
	public ResponseEntity<List<Map<String, Object>>>  getCountries() {
		return ResponseEntity.ok(rest.getCountries());
	}
	
	/* /categories This endpoint returns all Yelp business categories across all locales by default. Include the "locale" parameter to */
	
	@GetMapping("/categories")
	public ResponseEntity<CategoriesResponse>  getCategories() {
		return ResponseEntity.ok(rest.getCategories());
	}
}


