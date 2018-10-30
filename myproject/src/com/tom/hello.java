package com.tom;

import java.util.Random;
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		while(a > 0){
			System.out.println("123");
			a = a-1;
		}
		
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println(number);
		
		
		/*Scanner scanner =new Scanner(System.in);
		System .out.println("Your name:");
		String name = scanner.nextLine();
		System.out.println(name);*/
		
//		Person p =new Person(65.5f, 1.7f);
//		p.weight = 65.5f;
//		p.height = 1.7f;
//		System.out.println(p.bmi());
//		p.hello();
//		Person hank = new Person();
//		Person jack = null;
//		jack.hello();
//		Systwm.out.println(Hank 70 90  80 )
//		String name ="Hank";
//		int english =70;
//		int math=90;
//		System.out.println(name+ "\t" +english+ "\t" +math+"\t"+(english+math)/2);
		
		Student stu =new Student();
		stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;
		stu.print();
		
		System .out.println(3 <= 5);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		
		String s3="abc";
		String s4="abc";
		System.out.println(s3==s4);
		
	    // int age=20;
		//age=87;
		//Short day=12;
		//age=day;
		//float weight=35.45f;
		//float num=(float)65.8;
		//System.out.println("age");
	}

}
