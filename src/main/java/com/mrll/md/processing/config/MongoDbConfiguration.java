package com.mrll.md.processing.config;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class MongoDbConfiguration {

	@Value("${mongHost}")
	private String mongoHost;
	
	@Value("${mongoPort}")
	private String mongoPort;
	
	@Value("${dbName}")
	private String dbName;

	@Bean
	public MongoTemplate mongoTemplate() {

		try {
			
			return new MongoTemplate(new MongoClient(mongoHost, Integer.parseInt(mongoPort)), dbName);
		
		} catch (NumberFormatException | UnknownHostException e) {
			return null;

		}
	}
}
