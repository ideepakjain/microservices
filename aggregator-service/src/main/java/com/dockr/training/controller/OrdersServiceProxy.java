package com.dockr.training.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dockr.training.model.Orders;

@FeignClient(name = "orders-service", url = "${ORDERS_SERVICE_URI:http://localhost:8082}")
public interface OrdersServiceProxy {

	@GetMapping("/orders/{id}")
	public Orders getOrders(@PathVariable("id") Integer id) ;
	
}
