package ex;

import java.util.Scanner;

/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。
                  例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021009 陳俞儒
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square( );
}
	public static int square( ) {
	Scanner scn = new Scanner(System.in);
	String A = scn.next();
	char data[]=A.toCharArray();
	for(int i=0;i<data.length;i++){
		arr[i]=arr[i]*arr[i];
		System.out.print(data[i]+"\t");
	}
	System.out.println();
	}
}