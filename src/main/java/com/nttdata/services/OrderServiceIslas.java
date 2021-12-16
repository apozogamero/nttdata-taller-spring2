package com.nttdata.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.persistence.Order;
import com.nttdata.persistence.Product;

@Service
@Qualifier("islas")
public class OrderServiceIslas extends OrderAbstract {

	@Override
	public void addOrder(Order order, Product... product) {
		List<Product> productList = Arrays.asList(product);
		
        productList.forEach(productz -> productz.setPricePVP(productz.getPrice() * (1 + 0.04)));
        
        order.setProducts(productList);
        
        orderDaoImpl.insert(order);
	}
}
