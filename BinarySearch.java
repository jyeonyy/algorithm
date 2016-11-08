package wong;
import java.*;
import java.util.Scanner;

public class BinarySearch {
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
		BinarySearch.Search(a, b, n);
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/(double)1000);
	}
	static int Search(int a[], int b, int n){
		int low, high, mid;
		low = 1; high = n;
		
		while(low<= high){
			
			mid = (low+high)/2;
			if(a[mid]==b) return a[mid];
			else if(b < a[mid]) high = mid -1;
			else if(b > a[mid]) low = mid + 1;
		}
		 return -1;}}
