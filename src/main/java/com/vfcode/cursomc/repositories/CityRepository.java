package com.vfcode.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfcode.cursomc.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
