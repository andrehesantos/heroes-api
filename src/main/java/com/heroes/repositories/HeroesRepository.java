package com.heroes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.heroes.models.Heroes;

public interface HeroesRepository extends CrudRepository<Heroes, Long>{

}
