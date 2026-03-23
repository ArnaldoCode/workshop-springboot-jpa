package com.educandoweb.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.maxvendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
