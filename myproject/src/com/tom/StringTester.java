package com.tom;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "apple";
		//			01234
		String r ="";
		for(int i =a.length()-1 ; i>=0 ;i--){
			r=r+a.charAt(i);
		}
		System.out.println(r);
		
		for(int i = a.length()-1 ; i>=0 ;i--){
			System.out.print(a.charAt(i));
		}
		System.out.println();
		
		String s2 ="Jack Tom Jane";
		//			0123456789012
		System.out.println(s2.indexOf("Tom"));
		String name = "Tom";
		name =name.replace("Tom","Boss");
		System.out.println(s2.substring(0,4)+" "+name+" "+s2.substring(9,13));
		
		/*String name ="Tom";
		int index =s2.indexOf(name);
		name =name.replace("Tom", "Boss");
		System.out.println(s2.substring(0,index)+"Boss"+" "+s2.substring(index+name.length()));*/
		
		int n =Integer.parseInt("123");
		n++;
		float aa =Float.parseFloat("99.7");
		System.out.println(n+" "+aa);
	}

}
