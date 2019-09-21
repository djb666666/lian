package com.cy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
@ComponentScan("com.cy.controller")
@EnableWebMvc //<mvc:annotation-driven/>
public class SpringWebConfig implements WebMvcConfigurer{
	//<mvc:default-servlet-handler/>
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		WebMvcConfigurer.super.configurePathMatch(configurer);
	}
	@Override
	public void configureViewResolvers(
		ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/pages/",".html");
	}
}
