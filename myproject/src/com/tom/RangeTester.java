package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args){
			Scanner sc =new Scanner(System.in);
			System.out.println("What is your number");
			int number = sc.nextInt();
			
			System.out.println("*"+number+"*");
			System.out.println(-3<=number && number<=5);
			
	}

}
