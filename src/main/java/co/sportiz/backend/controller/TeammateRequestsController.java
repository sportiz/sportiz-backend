package co.sportiz.backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.SportizResponse;
import co.sportiz.backend.model.TeammateRequests;
import co.sportiz.backend.model.SportizResponse.ResponseStatus;
import co.sportiz.backend.service.TeammateRequestsService;

@Controller
@RequestMapping("/requests")
public class TeammateRequestsController {

	@Autowired
	private TeammateRequestsService teammateRequestService;
	
	@CrossOrigin
	@RequestMapping(path="/{sport}", method=RequestMethod.GET)
	public @ResponseBody List<TeammateRequests> readRequestForSport(@PathVariable String sport) {
		return teammateRequestService.fetchRequestsForSports(sport);
	}
	
	@CrossOrigin
	@RequestMapping(path="/", method=RequestMethod.GET)
	public @ResponseBody List<TeammateRequests> readRequestForFirstSport() {
		return teammateRequestService.fetchRequestsForSports(null);
	}
	
	@CrossOrigin
	@RequestMapping(path="/", method=RequestMethod.POST)
	public  @ResponseBody SportizResponse storeRequestForGivenUser(@Valid TeammateRequests teammateRequests) {
		try {
			teammateRequestService.storeTeammateRequest(teammateRequests);
			return new SportizResponse(ResponseStatus.SUCCESS, "Teammate request added successfully.");
		}catch (Exception e) {
			e.printStackTrace();
			return new SportizResponse(ResponseStatus.FAILED, e.getMessage());
		}
	}
}
