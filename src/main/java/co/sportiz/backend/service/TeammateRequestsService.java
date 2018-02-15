package co.sportiz.backend.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Iterables;

import co.sportiz.backend.model.TeammateRequests;
import co.sportiz.backend.repository.TeammateRequestsRepo;

@Service
public class TeammateRequestsService {

	@Autowired
	private TeammateRequestsRepo teammateRequestsRepo;
	
	public List<TeammateRequests> fetchRequestsForSports(String sport) {
		return Arrays.asList(Iterables.toArray(teammateRequestsRepo.findAll(), TeammateRequests.class));
	}

}
