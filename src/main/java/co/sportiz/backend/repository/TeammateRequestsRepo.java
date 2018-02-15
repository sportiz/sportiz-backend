package co.sportiz.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.sportiz.backend.model.TeammateRequests;

@Repository
public interface TeammateRequestsRepo extends CrudRepository<TeammateRequests, Long>
{

}
