package com.shristi.training;

public class Typecasting {

	public static void main(String[] args) {
        float g=12.5f;
        byte b=100;
        int x=b*2; //Upcasting
        long y=x+2; //Upcasting
        float a=x+y+b;
        double num=a*2;
        System.out.println(num);
        
        //Doublecasting
        float num1=(float)(num/2);
        long num2=(long)(num1+10);
        int num3=(int)(num2/2);
        System.out.println(num3);
	}

}