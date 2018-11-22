package com.primalgiant;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class SpringcloudOauth2SecureserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOauth2SecureserviceApplication.class, args);
	}
	
	@RequestMapping("/properties")
	public ArrayList<Property> getProperties(){
		Property prop1 = new Property("100", "123","First St." , "15905", "11/02/2018");
		Property prop2 = new Property("101", "312","Second St." , "44112", "03/17/2018");
		Property prop3 = new Property("102", "4567","Third Bvld." , "25414", "11/08/2017");
		Property prop4 = new Property("103", "7654","Fourth Cir." , "44113", "06/12/2012");
		
		ArrayList<Property> properties = new ArrayList<>();
		properties.add(prop1);
		properties.add(prop2);
		properties.add(prop3);
		properties.add(prop4);
		
		return properties;
	}
	
	public class Property{
		
		public String id;
		public String streetNum;
		public String street;
		public String zipCode;
		public String listingDate;
		
		public Property() {};
		
		public Property(String id, String streetNum, String street, String zipCode, String listingDate) {
			this.id = id;
			this.streetNum = streetNum;
			this.street = street;
			this.zipCode = zipCode;
			this.listingDate = listingDate;
		}
		
	}
}
