
package com.example.demo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Order;
@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Order Ordergeneration(Order bs) {
		// TODO Auto-generated method stub
		Order order=em.merge(bs);
		return order;
	}
	
	@Override
	public Order getOrderById(int id) {
		
		return em.find(Order.class,id);
	}
	
	@Override
	public List<Order> getAllOrder() {
		Query q=em.createQuery("select m from Employee m");
		List<Order> bslist=q.getResultList();
		return bslist;
	}}