package com.educandoweb.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.maxvendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
