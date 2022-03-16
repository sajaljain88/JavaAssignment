package com.sajal.numbers;
import java.util.Scanner;
/* Class Name:FactorialN
 * Objective : To find the Factorial of given No.
 * Author Name: SajalJain
 * Date: 17-03-2022
 */
public class FactorialNumber {
	/* Method Name:factorial
	 * Return type:Integer 
	 * Objective:To find the Factorial of a Number
	 */
	public int factorial(int number){
		
		int fact=1;
		for(int i=1;i<number;i++){//small letter
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numbers=scanner.nextInt();//small letter
		
		FactorialNumber factorial=new FactorialNumber();//write full name
		System.out.println("Factorial of the no is "+ factorial.factorial(n));
	}

}