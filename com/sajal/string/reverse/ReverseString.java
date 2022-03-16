package com.sajal.string.reverse;
import java.util.Scanner;
/* Class Name:ReverseString
 * Objective : To Reverse the String
 * Author Name: SajalJain
 * Date: 17-03-2022
 */

public class ReverseString {
	/* Method Name:reverseString
	 * Return type:String 
	 * Objective:To Reverse the String via reverse loop and Concatenation
	 */

	public String reverseString(String str){
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.nextLine();
		ReverseString reverseString=new ReverseString();
        System.out.println("Reverse of the String is "+reverseString.reverseString(str));
	}

}
