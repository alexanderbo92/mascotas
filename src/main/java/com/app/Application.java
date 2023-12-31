package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Fatih Totrakanlı
 *
 */

@SpringBootApplication
public class Application {
/*
extends SpringBootServletInitializer {

	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }  
*/

    public static void main(String[] args) {  
    	System.out.println("Inicia App");
        SpringApplication.run(Application.class, args);
    }
    
 
}
