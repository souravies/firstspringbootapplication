package com.example.saurav.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saurav.it.entity.Order;

public interface OrdeRepository extends JpaRepository<Order, Integer> {

}
