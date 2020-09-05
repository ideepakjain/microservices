package com.dockr.training.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dockr.training.model.Order;
import com.dockr.training.model.Orders;

@RestController
public class OrdersController {

	@GetMapping("/orders/{id}")
	public Orders getOrders(@PathVariable("id") Integer id) {
		Orders orders = new Orders();
		List<Order> asList = Arrays.asList(new Order(1, 250, "14-Apr-2020"), new Order(2, 450, "14-Apr-2020"));
		orders.setOrders(asList);
		return orders;
	}

}
