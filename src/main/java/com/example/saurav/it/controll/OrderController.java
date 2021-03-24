 package com.example.saurav.it.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.saurav.it.entity.Order;
import com.example.saurav.it.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;

	@PostMapping("/bookorder")
	public Order bookOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}

}
