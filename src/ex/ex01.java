package ex;

import java.util.Scanner;

/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021009 陳俞儒
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int m=fun(n);
	}
	public static int fun(int n){
		Scanner scn = new Scanner(System.in);
		int i,j;
		String c = scn.next();
		for(int i1=1;i1<=n;i1++){
			for(int j1=1;j1<=n;j1++){
			System.out.print(c);
		}	
		System.out.println();
		}
		return n;
	}
}
