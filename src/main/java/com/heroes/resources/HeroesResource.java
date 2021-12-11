package com.heroes.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.models.Heroes;
import com.heroes.repositories.HeroesRepository;

@RestController
@RequestMapping("/heroes")
public class HeroesResource {

	@Autowired
	private HeroesRepository hr;
	
	@GetMapping
	public List<Heroes> find(){
		return (List<Heroes>) hr.findAll();
	}
}
