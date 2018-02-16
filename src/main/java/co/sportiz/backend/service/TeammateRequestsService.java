package co.sportiz.backend.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Iterables;

import co.sportiz.backend.model.TeammateRequests;
import co.sportiz.backend.repository.ContextMenuRepo;
import co.sportiz.backend.repository.TeammateRequestsRepo;

@Service
public class TeammateRequestsService {

	@Autowired
	private TeammateRequestsRepo teammateRequestsRepo;
	
	@Autowired
	private ContextMenuRepo contextMenuRepo;
	
	public List<TeammateRequests> fetchRequestsForSports(String sport) {
		if(sport != null) {
			return Arrays.asList(Iterables.toArray(teammateRequestsRepo.findAll(), TeammateRequests.class));
		} else {
			String sportName = contextMenuRepo.findTop().getValue();
			System.out.println(sportName);
			return Arrays.asList(Iterables.toArray(teammateRequestsRepo.findAll(), TeammateRequests.class));
		}
	}

}
