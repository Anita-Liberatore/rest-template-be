package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rest.Rest;

@RestController
public class ApiController {

	@Autowired
	private Rest rest;

	/* get all countries from api https://restcountries.com/v2/all */
	@GetMapping("/countries")
	public ResponseEntity<List<Map<String, Object>>>  getCountries() {
		List<Map<String, Object>> response = rest.getCountries();
		return ResponseEntity.ok(response);
	}
}


