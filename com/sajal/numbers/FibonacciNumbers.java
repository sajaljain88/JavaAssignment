package com.sajal.numbers;
import java.util.Scanner;

/* Class Name:FactorialN
 * Objective : To find the Factorial of given No.
 * Author Name: Sajal Jain
 * Date: 17-03-2022
 */

public class FibonacciNumbers {
	/* Method Name:fibonacciN
	 * Return type:Integer 
	 * Objective:To find the Fibbonacci numbers up to N
	 */
	public void fibonacciN(int num){
		int fibonacci=0;
		for(int i=1;i<=num;i++){
			fibonacci=fibonacci+i;
			System.out.println(fibonacci);
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numbers=scanner.nextInt();
		FibonacciNumbers fibonacci=new FibonacciNumbers();
		fibonacci.fibonacciN(numbers);
	}

}
