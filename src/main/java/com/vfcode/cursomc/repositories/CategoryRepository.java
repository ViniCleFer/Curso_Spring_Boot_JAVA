package com.vfcode.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfcode.cursomc.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
