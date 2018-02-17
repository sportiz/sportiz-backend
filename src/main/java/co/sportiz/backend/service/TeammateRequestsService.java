package co.sportiz.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		if(sport == null)
			sport = contextMenuRepo.findAll().iterator().next().getValue();
		return teammateRequestsRepo.findBySport(sport);
	}

}
