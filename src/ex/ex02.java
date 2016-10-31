package ex;

import java.util.Scanner;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021009 陳俞儒
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(	func(n1,m)	);
	}
	public static int func(int n1,int m){
		
		int sum1=1;  // n!
		int sum2=1;  // m!
		int sum3=1;  // (n-m)!
		int sum4=1;  // C(n)取(m) 
		for(int i=n1;i>0;i--){
			sum1 =sum1*i;
		}
		for(int i=m;i>0;i--){
			sum2 =sum2*i;
		}
		for(int i=n1-m;i>0;i--){
			sum3 =sum3*i;
		}
		
		return sum4=sum1/(sum2*sum3);
	}
	
	
}
