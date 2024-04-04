package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ex) a + b");
    	
    	for (   ;   ;   ) {
    		int sum = 0;
        	
    	System.out.print(">> ");
    	String ask = sc.nextLine();
    	
    	if (ask.equals("/q")) {
    		System.out.println("종료합니다.");
    		break;
    	}
    	
    	try {
    	String[] calc = ask.split(" ");
    	
    	int a = Integer.parseInt(calc[0]);
    	int b = Integer.parseInt(calc[2]);
    	char s = calc[1].charAt(0);
    	
    	
    	if (s=='+') {
    		Add add = new Add();
			sum = add.calculate(a,b);
    	}
    	else if (s=='-') {
    		Sub sub = new Sub();
    		sum = sub.calculate(a,b);
    	}
    	else if (s=='*') {
    		Mul mul = new Mul();
    		sum = mul.calculate(a,b);
    	}
    	else if (s=='/') {
    		Div div = new Div();
    		sum = div.calculate(a,b);
    	}
    	else {
    	System.err.println("알 수 없는 연산입니다.");		// 잘못된 기호를 입력한 경우
    	}
    	System.out.print(">> ");
    	
    	System.out.println(sum);
    	
    	} catch (NumberFormatException e) {
    		System.err.println("알 수 없는 연산입니다.");		//	잘못된 숫자를 입력한 경우
    	} catch (ArithmeticException e) {
    		System.err.println("0으로 나눌 수 없습니다.");	//	b가 0인 경우
    	} catch (Exception e) {		//	그 외 예외
    		e.printStackTrace();
    	}
    } 	// if에서 탈출
    	
    	sc.close();
    }
}
