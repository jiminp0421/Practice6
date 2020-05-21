package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
	
	
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	//getter setter 
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getFillColor() {
		return fillColor;
	}
	
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public String getlineColor() {
		return lineColor;
	}
	
	//showInfo
	public void showInfo() {
		System.out.println();
	}
	
	
}

