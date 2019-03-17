package javasession2;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		String reverse="";
		System.out.println("enter given string");
		Scanner sc= new Scanner(System.in);
		String original=sc.nextLine();
		for(int i=original.length()-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse)){
			System.out.println("given string is palidrome");
		}
		else{
			System.out.println("given string is not palidrome");
		}

	}

}
