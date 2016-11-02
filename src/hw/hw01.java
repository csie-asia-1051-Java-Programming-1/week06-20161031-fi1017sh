package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入  1(華氏->攝氏) 或   2(攝氏->華氏) :");
		float n = scn.nextInt();
		System.out.println("溫度為:");
		float m = scn.nextInt();
		fun(n , m );
		//System.out.println(m);
	}
	public static void fun(float n1 ,float m1){
		if(n1==1){
			System.out.println( ((m1-32)*5)/9 );
			//float m=((m1-32)*5)/9 ;
		}else{
			if(n1==2){
			System.out.println( ((m1*9)/5)+32 );
			//float m=((m1*9)/5)+32 ;
			}
		}
		//return m ;
	}
}