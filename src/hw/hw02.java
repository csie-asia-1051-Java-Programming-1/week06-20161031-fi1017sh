package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	public static void fun(){
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入 1(男生) 或    2(女生) :");
		int n = scn.nextInt();
		System.out.println("請輸入您的身高(cm):");
		int m = scn.nextInt();
		if(n==1){
			System.out.println( ((m-170)*0.6)+62 );
		}else{
			if(n==2){
			System.out.println( ((m-158)*0.5)+52 );	
			}
		}
	}
}
