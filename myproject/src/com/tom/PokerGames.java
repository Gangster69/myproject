package com.tom;

import java.util.Random;

public class PokerGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0]= new Card(7);
		System.out.println(c[0].get());
		
		Poker poker =new Poker();
		poker.shuffle();
		poker.print();
		
		/*int[] flowers = {9827 ,9830 ,9829 ,9824};
		int[] pokers = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13};
		for(int i=0 ;i<pokers.length ;i++) {
			System.out.println(pokers);
		}*/
		
		/*int[] nums =new int[5];
		nums[0]=5;
		nums[3]=9;
		System.out.println(nums[3]);
		System.out.println(nums.length);
		for(int i=0 ; i<nums.length ;i++ ) {
			System.out.println(nums[i]);
		}
		
		int poker;
		int count = 1;
		for(count=1; count<=4; count++){
			Random random = new Random();
			poker = random.nextInt(13)+1;
			int flower = random.nextInt(4);
			System.out.print(poker);
			
			char c = 0;
			switch(flower){
			case 0:
				c = 'c';
				break;
			case 1:
				c = 'D';
				break;
			case 2:
				c = 'H';
				break;
			case 3:
				c = 'S';
				break;
			}
			System.out.println(c);
		}*/
	}

}
