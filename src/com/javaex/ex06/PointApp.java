package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);	//	false
		System.out.println(p2 == p3);	//	false
		System.out.println(p3 == p4);	//	false
		System.out.println(p4 == p1);	//	true
		System.out.println(p1.equals(p2));	//	true -> false
		System.out.println(p4.equals(p1));	//	true
		
		//	기본 java.util.Object에 equals 메소드가 있기 때문
		//	오버라이드 하지 않는 이상, 
		//	기본 equals 메소드는 참조 주소만 비교,
		//	논리적 동등성을 비교하기 위해서는 오버라이드가 필요하기에 5번도 false가 나옴 
	}

}


