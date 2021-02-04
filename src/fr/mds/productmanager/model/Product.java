package fr.mds.productmanager.model;

public class Product {
	private Long id;
	private String name;
	private String description;
	private float price;
	
	public Product() {
		
	}	
	
	public Product(String name, String description, float price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}	
	
}
