package com.educandoweb.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.maxvendas.entities.Order;

public interface OrderRepository extends JpaRepository< Order, Long> {

}
