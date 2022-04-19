package com.zemoso.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add the users for in memory authentication

        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("Shanker").password("test123").roles("ADMIN"))
                .withUser(users.username("Vineet").password("test123").roles("MANAGER"))
                .withUser(users.username("Kalyan").password("test123").roles("EMPLOYEE"));




    }
}
