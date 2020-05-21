package com.javaex.ex02;

public class Shape {
	
	protected String fillColor; //private으로 두면 showinfo를 실행할때 get으로가져올수있지않나요..
	protected String lineColor;
	
	
	public Shape () {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void showInfo() {
		System.out.println("#면 컬러: " +fillColor + "\t#선 컬러:" + lineColor);
	
	}
	
	
}


