package com.assignment.jforce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan
public class WebMVCConfig implements WebMvcConfigurer{
	

	 @Override
	    public void configureViewResolvers(ViewResolverRegistry registry) {
	        registry.jsp("/WEB-INF/html/", ".jsp");
	    }


	    @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        //this will map uri to jsp view directly without a controller
	        registry.addViewController("/login")
	                .setViewName("login");
	        
	        registry.addViewController("/register")
            .setViewName("register");
	        
	        
	    }
	    
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
	    	registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
	    }
	    
	    @Override
	    public void configureDefaultServletHandling(
	            DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }

}
