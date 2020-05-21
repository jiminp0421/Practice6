package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
			s1.showInfo();
		System.out.println("================");
		//생성자 shape 2 실행
		
		
		Triangle t1 = new Triangle();
			t1.showInfo();
		System.out.println("================");
		//생성자 Shape(0) 실행
		//생성자 triangle 0 실행
		//내용물이 없으니 showInfo에 들어간 값이 null값
		
		
		Triangle t2 = new Triangle(3, 4);
			t2.showInfo();
		System.out.println("================");
		//생성자 Triangle(2) 실행
		//생성자 Shape(2) 실행 , super에다가 미리 검정이라고 입력하니 같이 출력되었다.
		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
			t3.showInfo();
		System.out.println("================");
		//생성자 Shape(2) 실행
		//생성자 Triangle(4) 실행
		
		
		
		//의문증 t2는 shape의 생성자 Shape(2) 실행을 가져올것인가 안가져 올것인가
		//부모의 필드를 protected로 변경하지 않았는데 과연 실행이 될지 안될지 (가져왔다)
	}

}

