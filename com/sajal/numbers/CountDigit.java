package com.sajal.numbers;

import java.util.Scanner;

/* Class Name:CountDigitNo
 * Objective : To Count the No. of Digits in Number
 * Author Name: SajalJain
 * Date: 17-03-2022
 */

public class CountDigit {
	/* Method Name:countDigit
	 * Return type:Integer 
	 * Objective:To Count the No. of Digits in Number
	 */
	public int countDigit(int number){
		int count=0;
		while(number>0){
			count++;
			number=number/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		CountDigit countDigit=new CountDigit();
		System.out.println("Total no. of digits are "+countDigit.countDigit(number));
		scanner.close();

	}

}
