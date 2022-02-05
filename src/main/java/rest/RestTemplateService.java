package rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import response.CategoriesResponse;

@Component
public class RestTemplateService {

	public static final String URL_COUNTRIES = "https://restcountries.com/v2/all";
	public static final String URL_CATEGORIES = "https://api.yelp.com/v3/categories";

	/*get all countries from url with Rest Template e mapping all data with List<Map<String, Object>>> */
	public List<Map<String, Object>> getCountries() {

		RestTemplate restTemplate = new RestTemplate();	
		String jsonResponseFromUrl = restTemplate.getForObject(URL_COUNTRIES, String.class);
		List<Map<String, Object>> response = new ArrayList<Map<String, Object>>();
		ObjectMapper mapper = new ObjectMapper(); 


		try {
			response = mapper.readValue(jsonResponseFromUrl, new TypeReference<List<Map<String, Object>>>(){});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	/*get all categories from url of YELP API */
	public CategoriesResponse getCategories() {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + "Your API KEY ;)");

		RestTemplate restTemplate = new RestTemplate();	
		ResponseEntity<CategoriesResponse> jsonResponseFromUrl = restTemplate.exchange(URL_CATEGORIES, HttpMethod.GET,
	            new HttpEntity<>("parameters", headers),
	            CategoriesResponse.class);

		CategoriesResponse response = jsonResponseFromUrl.getBody();			
		return response;
	}


}