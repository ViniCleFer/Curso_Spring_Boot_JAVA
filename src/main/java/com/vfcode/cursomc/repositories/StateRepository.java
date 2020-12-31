package com.vfcode.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfcode.cursomc.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
	
}
