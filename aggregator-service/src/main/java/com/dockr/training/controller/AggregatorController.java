package com.dockr.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dockr.training.model.Orderdetails;
import com.dockr.training.model.Orders;
import com.dockr.training.model.User;

@RestController
public class AggregatorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorController.class);

	@Autowired
	private UserServiceProxy userServiceProxy;
	
	@Autowired
	private OrdersServiceProxy ordersServiceProxy;

	@GetMapping("/orderdetails/{id}")
	public Orderdetails getOrderdetails(@PathVariable int id) {

		LOGGER.info("Received Request for user id {}. ", id);

		User user = userServiceProxy.retrieveUser(id);
		Orders orders = ordersServiceProxy.getOrders(id);

		Orderdetails orderDetails = new Orderdetails();
		orderDetails.setUserDetails(user);
		orderDetails.setOrders(orders);
		return orderDetails;

	}

}
