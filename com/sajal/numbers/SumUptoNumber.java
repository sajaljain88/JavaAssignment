package com.sajal.numbers;
import java.util.Scanner;

/* Class Name:FactorialN
 * Objective : To find the Sum of N numbers
 * Author Name: SajalJain
 * Date: 17-03-2022
 */

public class SumUptoNumber {
	/* Method Name:sumUptoN
	 * Return type:Integer 
	 * Objective:To find the Fibonacci numbers up to N
	 */
	public int sumUptoNumber(int num){
		int sum=0;
		for(int i=0;i<=num;i++){
			sum+=i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		SumUptoNumber sum=new SumUptoNumber();
		System.out.println(sum.sumUptoNumber(number));

	}

}
