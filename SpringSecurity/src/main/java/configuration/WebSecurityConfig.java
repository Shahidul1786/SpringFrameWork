package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("shahid")
				.password("shahid")
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user);
						
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		    .antMatchers("/","/home")
		    .permitAll()
		    .antMatchers("/hello")
		    .hasRole("ADMIN")
		    .and()
		    .formLogin()
		    .loginPage("/login")
		    .permitAll()
		    .and()
		    .logout()
		    .permitAll();
		
	}
	
	

}
