package co.sportiz.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.sportiz.backend.model.TeammateRequests;

@Repository
public interface TeammateRequestsRepo extends CrudRepository<TeammateRequests, Long>
{

	public List<TeammateRequests> findBySport(String sport);
	
}
