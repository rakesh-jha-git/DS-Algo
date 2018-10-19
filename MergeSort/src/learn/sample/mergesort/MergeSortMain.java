package learn.sample.mergesort;

import java.util.Scanner;

public class MergeSortMain {
	
	public static void main(String [] args) {
		Scanner  in =new Scanner(System.in);
		System.out.println("Enter the number items to  add in linkedList");
		int n=in.nextInt();
		
		MergeSort mergeSort=new MergeSort();
		System.out.println("Enter the values of an array");
		
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=in.nextInt();
		}
		
		System.out.println("All linkedList items are:");
		int[] result=mergeSort.mergeSort(array);
		mergeSort.printAllItems(result);
		
	}

}
