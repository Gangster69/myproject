package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Are you 18? (Y/N)");
			String line = sc.nextLine();
			
			System.out.println("*"+line+"*");
			boolean adult = line.toUpperCase().equals("Y");
			System.out.println(adult);
			
			if(adult){
				System.out.println("How old are you?");
				int age =sc.nextInt();
				sc.nextLine();
				System.out.println("What is your name?");
				String name =sc.nextLine();
				System.out.println("How is your nickname?");
				String nickname =sc.nextLine();
				System .out.println(age+"/"+name+"/"+nickname);
			}
			else{
				System.out.println("Thanks,Bye");
		
			}
	}

}
