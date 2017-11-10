package com.ltf.db;

import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入矩形的高");
		double leagth=input.nextDouble();
		System.out.println("请输入矩形的宽");
		double width=input.nextDouble();
		test t1 = new test(leagth,width);
		System.out.println("面积为:"+t1.getArea());
        System.out.println("周长为:"+t1.getPerimeter());
        //输出(使用对象调用类成员方法getArea)的返回值
        input.close();
	}
}
	
	class  test{
		   private double a;
		   private double b;
		   
		   public test(double leagth,double width){
			   this.a=leagth;
			   this.b=width;
		   }
		   public void setTest(double leagth) {
			   a=leagth;
		   }
		   public void setTea(double width) {
			 b=width;
		   }
		   private double getTest() {
			   return a;
		   }
		   private double getTea() {
			   return b;
		   }
	    double area,perimeter; 
	    
	     double getArea() {      
	       
	         area = a * b;
	         return area;
	     } 
	     double getPerimeter() {
	    	 perimeter=2*(a+b);
	    	 return perimeter;
	    	 }
	     }

