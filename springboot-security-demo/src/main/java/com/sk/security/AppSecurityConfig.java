package com.sk.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

		provider.setUserDetailsService(userDetailsService);
//		// -----Using passwords without any encryption----->
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

//		// -----Using passwords with BCrypt Encryption----->
		provider.setPasswordEncoder(new BCryptPasswordEncoder());

		return provider;
	}

// *TO CREATE NEW USER DEFINED USERNAME & PASSWORD (Fetch from Database)----Recommended---->

// *TO CREATE NEW USER DEFINED USERNAME & PASSWORD (at Runtime)----NOT recommended---->
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//
//		List<UserDetails> users = new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder().username("sk_user").password("123456").roles("USER").build());
//		return new InMemoryUserDetailsManager(users);
//	}

}
