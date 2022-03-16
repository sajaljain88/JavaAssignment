package com.sajal.numbers;
import java.util.*;

/* Class Name:FactorialN
 * Objective : To find the no. is prime or not
 * Author Name: SajalJain
 * Date: 17-03-2022
 */

public class PrimeNumbers {
	/* Method Name:isPrime
	 * Return type:Integer 
	 * Objective:To check the entered no. is prime or not
	 */
	public boolean isPrime(int num){
		for(int i=2;i<num/2;i++){
	    	if(num%i==0){
	    		return true;
	    	}
	    }
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		PrimeNumbers ip= new PrimeNumbers(); 
		 if(!ip.isPrime(number)){
			 System.out.println("The no. you entered is a Prime No.");
		 }else{
			 System.out.println("The no. you entered is not a Prime No.");
		 }
		

	}

}
