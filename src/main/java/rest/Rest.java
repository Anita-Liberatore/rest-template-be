package rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Rest {

	public static final String URL = "https://restcountries.com/v2/all";
	
	/*get all countries from url with Rest Template e mapping all data with List<Map<String, Object>>> */
	public List<Map<String, Object>> getCountries() {
		
		RestTemplate restTemplate = new RestTemplate();	
		String jsonResponseFromUrl = restTemplate.getForObject(URL, String.class);
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

}