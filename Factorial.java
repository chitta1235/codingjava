package javasession2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		int fact=1;
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorial of "+n+"="+fact);

	}

}
