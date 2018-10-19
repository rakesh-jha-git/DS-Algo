package learn.sample.quicksort;

import java.util.Scanner;

public class QuicksortMain {
	public static void main(String [] args) {
		Scanner  in =new Scanner(System.in);
		System.out.println("Enter the number items to  add in array");
		int n=in.nextInt();
		
		Quicksort quickSort=new Quicksort();
		System.out.println("Enter the values of an array");
		
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=in.nextInt();
		}
		
		System.out.println("Sorted items of array:");
		int[] result=quickSort.quickSort(array);
		quickSort.printAllItems(result);
		
		
		
	}

}
