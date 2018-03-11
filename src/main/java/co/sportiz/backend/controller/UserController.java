package co.sportiz.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.sportiz.backend.model.UserDetails;
import co.sportiz.backend.service.UserDetailsServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
   
    @CrossOrigin
    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserDetails user) {
        userDetailsService.storeUserDetails(user);
    }
}
