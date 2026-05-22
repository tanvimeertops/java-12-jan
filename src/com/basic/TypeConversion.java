package com.basic;
/*
 * convert one primitive data type to another
 * long-->int
 * implicit conversion
 * 	small to big
 * 	int(4) --> long (8)
 * 
 * Explicit conversion
 * long -- > int
 */
public class TypeConversion {
public static void main(String[] args) {
	int i1=2323;
	long l1=i1;
	System.out.println("Implicit conversion :"+l1);
	int i2=(int)l1;
	System.out.println("Explicit Conversion :"+i2);
	
	float f1=122.52f;
	int i3=(int)f1;
	System.out.println("Conversion :"+i3);
	
	int i4=129;//4 bytes
	byte b1=(byte)i4; //1 byte 
	
	
	//-128 -127 -126 to 127
	System.out.println("int to byte :"+b1);
}
}
