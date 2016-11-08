package wong;
import java.*;
import java.util.Scanner;
public class SequentialSearch {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			TimeSearch();
		}
	}
	
	static void TimeSearch(){
		Scanner scr = new Scanner(System.in);
		int n, b;
		n = scr.nextInt();
		b = scr.nextInt();
		int [] a = new int [n];
		
		for(int i=0;i<n;i++){
			a[i]=i+1;
		}
		
		long start = System.currentTimeMillis();
		SequentialSearch.Search(a, b, n);
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/(double)1000);
		
	}
	
	static int Search(int a[], int b, int n){
		for(int   i=0;i<n;i++){
			if(a[i]==b)
				return a[i];
		}	
		return -1;
		}
	}
