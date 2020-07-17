
package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DaoClass;
import com.example.demo.entity.Order;




@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;

public Order Ordergeneration(Order bs) {
	return dao.Ordergeneration(bs);
}

public Order getOrderById(int id) 
{
return dao.getOrderById(id);
}

public List<Order> getAllOrder() 
{
return dao.getAllOrder();
}


}


