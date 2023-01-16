package com.xworkz.mavenspringapp.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mavenspringapp.thing.Actor;
import com.xworkz.mavenspringapp.thing.Rocket;
import com.xworkz.mavenspringapp.thing.Season;

@Configuration
@ComponentScan("com.xworkz")
public class RocketSpringConfiguration {
	
	public RocketSpringConfiguration() {
		System.out.println("created rocket spring configuration");
	}
	
	@Bean
	
	public Rocket spaceRocket() {
		System.out.println("registering another rocket into spring");
		Rocket rocket = new Rocket();
		return rocket;
		
	}
	
@Bean
	
	public Actor actorFilm() {
		System.out.println("registering another actor into spring");
		Actor actor = new Actor();
		return actor;
		
	}

@Bean

public Season anotherSeason() {
	System.out.println("registering another season into spring");
	Season season = new Season();
	return season;
	
}


	
	

}
