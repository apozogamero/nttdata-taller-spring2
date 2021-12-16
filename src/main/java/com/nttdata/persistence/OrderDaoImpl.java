package com.nttdata.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDaoI {
	
	private List<Order> orders;
	
	public OrderDaoImpl() {
		orders = new ArrayList<Order>();
	}
	
	@Override
	public void insert(Order order) {
		orders.add(order);
	}
	
	public List<Order> getOrders() {
		return orders;
	}

}
