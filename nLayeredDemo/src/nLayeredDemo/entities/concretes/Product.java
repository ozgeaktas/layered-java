package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product  implements Entity{
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unętsInStock;
	
	
	public Product() {
		
	}
	


	public Product(int id, int categoryId, String name, double unitPrice, int unętsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.setUnitPrice(unitPrice);
		this.setUnętsInStock(unętsInStock);
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	public int getUnętsInStock() {
		return unętsInStock;
	}


	public void setUnętsInStock(int unętsInStock) {
		this.unętsInStock = unętsInStock;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	

}
