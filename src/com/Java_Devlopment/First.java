package com.Java_Devlopment;

import com.Java2.Hello;

public class First {
	
	public void funcion() {
		System.out.println("This is first function");
	}
	public void function2() {
		System.out.println("test This is second function");
	}
	public static void main(String[] args){
		System.out.println("This is main function in first class");
		First obj = new First();
		obj.funcion();
		obj.function2();
		
		 Second obj2 = new Second();
		 obj2.function();
		 Hello objhi = new Hello();
		 objhi.heee();
	}

}
