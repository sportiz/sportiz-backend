package co.sportiz.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.TeammateRequests;
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
}
