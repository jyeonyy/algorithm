package wong;
import java.*;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Timesort();
		}
	}
	 static void Timesort(){
	    	Scanner scr = new Scanner(System.in);
	    	int n = scr.nextInt();
	    	int [] x = new int[n];
	    	for(int i=0;i<n/2;i++){
	    		x[i] = i;
	    	}
	    	for(int i=0;i<n/2;i++){
	    		x[i] = i;
	    	}
	    	int low = 0, high=x.length -1;
	        
	        long start = System.currentTimeMillis();
			QuickSort.quickSort(x, low, high);
	        long end = System.currentTimeMillis();
	    	
			System.out.println((end-start)/(double)1000);
	    }
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		 if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}