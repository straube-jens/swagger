package nl.straube.spring.restService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.zoo.dto.RsvXO;

@RestController
public class RestService {

	@PostMapping(value = "/vehicleDecision")
	public RsvXO createRiskDecission(RsvXO rsvXO) {
		return new RsvXO();
	}
}
