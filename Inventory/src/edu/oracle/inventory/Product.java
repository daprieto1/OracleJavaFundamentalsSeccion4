package edu.oracle.inventory;

public class Product {

	/**
	 * Properties
	 */
	private String sku;
	private String name;
	private long numberUnits;
	private Double unitPrice;
	private boolean active;

	/**
	 * Constructor without fields
	 */
	public Product() {
		this.sku = "no sku";
		this.name = "no name";
		this.numberUnits = 0;
		this.unitPrice = 0.0;
		this.active = false;
	}

	/**
	 * Constructor with fields
	 * 
	 * @param sku
	 * @param name
	 * @param numberUnits
	 * @param unitPrice
	 */
	public Product(String sku, String name, Long numberUnits, Double unitPrice) {
		super();
		this.sku = sku;
		this.name = name;
		this.numberUnits = numberUnits;
		this.unitPrice = unitPrice;
		this.active = true;
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

	public Long getNumberUnits() {
		return numberUnits;
	}

	public void setNumberUnits(Long numberUnits) {
		this.numberUnits = numberUnits;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		String result = "";

		result += "\nItem number: " + this.sku;
		result += "\nName: " + this.name;
		result += "\nQuantity in Stock: " + this.numberUnits;
		result += "\nPrice: " + this.unitPrice;
		result += "\nStock Value: $" + this.getStockValue();
		result += "\nProduct Status: " + (this.active ? "Active" : "In-Active");		

		return result;
	}
	
	public double getStockValue() {
		return this.unitPrice * this.numberUnits;
	}

}
