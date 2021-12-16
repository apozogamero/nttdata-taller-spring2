package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.persistence.Order;
import com.nttdata.persistence.OrderDaoImpl;
import com.nttdata.persistence.Product;

public abstract class OrderAbstract implements OrderServiceI {
	
	@Autowired
	public OrderDaoImpl orderDaoImpl;

	@Override
	public abstract void addOrder(Order order, Product... product);

	@Override
	public List<Order> searchAll() {
		return orderDaoImpl.getOrders();
	}
	
	
}
