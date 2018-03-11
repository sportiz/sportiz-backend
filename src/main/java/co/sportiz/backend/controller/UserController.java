package co.sportiz.backend.controller;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.SportizResponse;
import co.sportiz.backend.model.UserDetails;
import co.sportiz.backend.model.SportizResponse.ResponseStatus;
import co.sportiz.backend.service.UserDetailsServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
   
    @CrossOrigin
    @PostMapping(path = "/signup")
    public @ResponseBody SportizResponse signUp(@RequestBody UserDetails user) {
        try{
        	userDetailsService.storeUserDetails(user);
        	return new SportizResponse(ResponseStatus.SUCCESS, "Account is created successfully.");
        } catch (InvalidParameterException e) {
        	return new SportizResponse(ResponseStatus.FAILED, "Username already exists");
		} catch (Exception e) {
			return new SportizResponse(ResponseStatus.FAILED, e.getMessage());
		}
    }
}
