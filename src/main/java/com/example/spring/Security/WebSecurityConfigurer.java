package com.example.spring.Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    //TODO: Read more about this extension WebSecurityConfigurerAdapter

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // COMPLETE CODE HERE
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("Mphuluseni")
                        .password("1234")
                        .roles("USER")
                        .build();

        //return new InMemoryUserDetailsManager(user);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user")
                .authenticated()
                .antMatchers("/user")
                .permitAll()
                .and()
                .httpBasic();
    }
}
