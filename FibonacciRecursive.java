package wong;

import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			TimeSearch();
		}
	}
	
	static void TimeSearch(){
		Scanner scr = new Scanner(System.in);
		int n;
		n = scr.nextInt();
		int [] a = new int [n];
		
		long start = System.currentTimeMillis();
		FibonacciRecursive.Fibonacci(n);
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/(double)1000);
	}
	static int Fibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
}