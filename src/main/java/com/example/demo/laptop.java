package com.example.demo;

public class laptop {
	
	private int laptopId;
	private String laptopName;
	private String laptopCompany;
	private int laptopPrice;
	public laptop(int laptopId, String laptopName, String laptopCompany, int laptopPrice) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopCompany = laptopCompany;
		this.laptopPrice = laptopPrice;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopCompany() {
		return laptopCompany;
	}
	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}
	public int getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopCompany=" + laptopCompany
				+ ", laptopPrice=" + laptopPrice + "]";
	}
	
	

}
