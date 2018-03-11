package co.sportiz.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.sportiz.backend.model.UserDetails;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
    
	UserDetails findByUsername(String username);
	
}
