/**
 * 
 */
package com.fidelitytechnologies.training.thymeleaf.model;

/**
 * @author cgaspar
 *
 */
public class Product {

	private Long id;
	private String sku;
	private String name;
	private String description;
	private String picture;
	
	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sku
	 * @param name
	 * @param description
	 * @param picture
	 */
	public Product(String sku, String name, String description, String picture) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.picture = picture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

}
