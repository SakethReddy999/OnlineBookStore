package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Order;

public interface DaoInterface {

	List<Order> getAllOrder();

	Order getOrderById(int id);

	Order Ordergeneration(Order bs);

	
	
}
