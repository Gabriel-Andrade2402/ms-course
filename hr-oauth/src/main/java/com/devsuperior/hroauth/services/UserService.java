package com.devsuperior.hroauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.hroauth.entities.User;
import com.devsuperior.hroauth.feignclients.UserFeignClients;

@Service
public class UserService implements UserDetailsService{
	@Autowired
	private UserFeignClients userFeignClients;
	
	/* Código antigo com feign comum sem implementação
	 * public User findByEmail(String email) {
		User user=userFeignClients.findByEmail(email).getBody();
		if(user==null) {
			throw new IllegalArgumentException();
		}
		return user;
	}*/

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userFeignClients.findByEmail(username).getBody();
		if (user == null) {
			throw new UsernameNotFoundException("Email not found");
		}
		return user;
	}
}
