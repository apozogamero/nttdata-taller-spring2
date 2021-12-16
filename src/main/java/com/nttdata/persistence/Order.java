package com.nttdata.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private int id;
	
	private String customer;
	
	private String address;
	
	private boolean peninsula;
	
	private List<Product> products;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @return the peninsula
	 */
	public boolean isPeninsula() {
		return peninsula;
	}

	/**
	 * @param peninsula the peninsula to set
	 */
	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
