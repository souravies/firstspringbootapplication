package com.example.saurav.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.saurav.it.entity.Order;
import com.example.saurav.it.repository.OrdeRepository;

@Service
public class OrderService {

	@Autowired
	private OrdeRepository repository;

	public Order saveOrder(Order order) {
		return repository.save(order);
	}
}
