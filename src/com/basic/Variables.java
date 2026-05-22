package com.basic;
/*
 * Variables
 */
public class Variables {
public static void main(String[] args) {
	int i1=2147483647;// 4 bytes 
	long l1=565646654464654l;//8 bytes
	float f1=55.2255f;// 4 bytes
	double d1=545.5556;// 8 bytes
	byte bb=127;//1 byte 120
	boolean b1=true;// 1 bit
	char ch='A';// 2 bytes
	
	System.out.println("int val is "+i1);
	System.out.println("size of int is "+Integer.BYTES);
	System.out.println("long val is "+l1);
	System.out.println("float val is "+f1);
	System.out.println("double val is "+d1);
	System.out.println("byte val is "+bb);
	System.out.println("bool val is "+b1);
	System.out.println("char val is "+ch);
	
}
}
