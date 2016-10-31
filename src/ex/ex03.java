package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021009 陳俞儒
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String m = scn.next();
		System.out.print( decomp(m) );
	}
	public static String decomp( String m ) {
		String[]name=m.split("");
		String x = " ";
		for(int i=1;i<=m.length()+1;i++){
			x=x+name[i];
			x=x+" ";
		}
		m=x;
		return m;
	}
}
