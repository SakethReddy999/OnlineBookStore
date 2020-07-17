
package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.exceptions.IdNotFoundException;
import com.example.demo.service.ServiceClass;


@RestController
@RequestMapping("/Order")
@CrossOrigin("http://localhost:4200")
public class ControllerClass {
	@Autowired
	ServiceClass serviceobj;

	// making order
	@PostMapping("/ordergeneration")
	public ResponseEntity<String> Ordergeneration(@RequestBody Order bs) {
		Order order = serviceobj.Ordergeneration(bs);
		if (order == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>("Order generated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	// Get Particular Order Data
	@GetMapping("/GetOrder/{id}")
	private ResponseEntity<Order> getOrder(@PathVariable("id") int id) {
		Order order = serviceobj.getOrderById(id);
		if (order == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Order>(order, new HttpHeaders(), HttpStatus.OK);
		}
	}

	// Get All Order Data
	@GetMapping("/GetAllOrder")
	private ResponseEntity<List<Order>> getAllOrder() {
		List<Order> bslist = serviceobj.getAllOrder();
		return new ResponseEntity<List<Order>>(bslist, new HttpHeaders(), HttpStatus.OK);

	}}