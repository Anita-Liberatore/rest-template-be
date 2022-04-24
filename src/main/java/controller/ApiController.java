package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Link;
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
	
	@GetMapping("/ping")
	@CrossOrigin
	public ResponseEntity<String>  getPing() {
		String ping = "true";
		return ResponseEntity.ok(ping);
	}
	
	@GetMapping("/shorten/{link}")
	@CrossOrigin
	public ResponseEntity<Link>  getShortenLink(@PathVariable String link) {
		return ResponseEntity.ok(rest.getShortLinkApi(link));
	}
}


