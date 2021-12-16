package com.nttdata.services;

import java.util.List;

import com.nttdata.persistence.Order;
import com.nttdata.persistence.Product;

public interface OrderServiceI {
	
	public void addOrder(Order order, Product... product);
	
	public List<Order> searchAll();
}
