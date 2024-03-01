package com.shivam;

public class Currency {
	private double value;
	
	private String symbol;
	
	public Currency(double value,String symbol) {
		this.value = value;
		
		this.symbol = symbol;
	}
	
	public String toString() {
		return "Value -> " + this.value +"Symbol -> " + this.symbol;
	}
}
