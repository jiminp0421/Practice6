package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정"); //값을 미리 넣었더니 string fill,line을 넣어주지 않았음에도 불구하고 값이 출력되었다.
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	
	public void showInfo() {
		System.out.println("#면 컬러: " +super.fillColor + " #선 컬러:" + super.lineColor + " #가로:" + width + " #세로" + height);
	}
	
	

	
	
	
	
	
}


