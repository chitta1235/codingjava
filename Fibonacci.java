package javasession2;

import java.util.Scanner;

class kuthar{
	int fibo(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fibonacii Term:");
		int n=sc.nextInt();
		System.out.println("fibonacci series is:\n");
		kuthar c=new kuthar();
		for(int i=0;i<n;i++){
			System.out.print(""+c.fibo(i));
		}

	}

}
