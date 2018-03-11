package co.sportiz.backend.service;

import static java.util.Collections.emptyList;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import co.sportiz.backend.model.UserDetails;
import co.sportiz.backend.repository.UserDetailsRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void storeUserDetails(UserDetails details) {
		if(userDetailsRepo.findByUsername(details.getUsername()) != null) {
			throw new InvalidParameterException("Username already exists");
		}
		details.setPassword(bCryptPasswordEncoder.encode(details.getPassword()));
		userDetailsRepo.save(details);
	}
	
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = userDetailsRepo.findByUsername(username);
        if (userDetails == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(userDetails.getUsername(), userDetails.getPassword(), emptyList());
    }
}
