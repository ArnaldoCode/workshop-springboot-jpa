package com.educandoweb.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.maxvendas.entities.OrderItem;
import com.educandoweb.maxvendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
