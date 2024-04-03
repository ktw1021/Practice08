package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    /**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	public void setValue(int a, int b) {
    	this.a=a;
    	this.b=b;
    }

    public int calculate(int a, int b) {
    	return a+b;
    }

}
