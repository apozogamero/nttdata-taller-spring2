package com.nttdata.persistence;

public class Product {

	private int id;
	
	private String name;
	
	private double pricePVP;
	
	private double price;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pricePVP
	 */
	public double getPricePVP() {
		return pricePVP;
	}

	/**
	 * @param pricePVP the pricePVP to set
	 */
	public void setPricePVP(double pricePVP) {
		this.pricePVP = pricePVP;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
