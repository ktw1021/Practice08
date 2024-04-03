package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);	//	1.false	p1(2, 3) - p2(2, 3) -> 같은 값, 참조 주소가 다름F
		System.out.println(p2 == p3);	//	2.false	p2(2, 3) - p3(5, 3) -> 다른 값, 참조 주소도 다름F
		System.out.println(p3 == p4);	//	3.false	p3(5, 3) - p4(2, 3)=p1  -> 다른 값, 참조 주소도 다름F 
		System.out.println(p4 == p1);	//	4.true	p4(2, 3) = p1(2, 3) -> p4가 p1을 참조, 주소 같음, 값도 같음.T
		System.out.println(p1.equals(p2));	//	5.true -> false	p1(2, 3) - p2(2, 3) -> 참조 주소가 다름(오버라이드 없음)
		System.out.println(p4.equals(p1));	//	6.true			p4(2, 3) = p1(2, 3) -> 참조했기 때문에 값도, 주소도 같음. 
		
		//	기본 java.util.Object에 equals 메소드가 있기 때문
		//	오버라이드 하지 않는 이상, 
		//	기본 equals 메소드는 참조 주소만 비교,
		//	논리적 동등성을 비교하기 위해서는 오버라이드가 필요하기에 5번도 false가 나옴 
	}

}


