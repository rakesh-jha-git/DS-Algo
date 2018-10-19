package learn.sample.binarysearh;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String [] args) {
		Scanner  in =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=in.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the values of an array");
		
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println("Enter values to be searched");
		int num=in.nextInt();
		
		int keyPosition=binSearch(arr,num,0,arr.length-1);
		
		if(keyPosition==-1) {
			System.out.println("number not found");
		}else {
			System.out.println("number found at position:"+keyPosition);
		}
	}

	private static int binSearch(int[] arr,int key,int low,int high) {		
		if(low==high)
			return -1;
		
		int mid=(low+high)/2;
		
		if(key==arr[mid]) {
			return mid;
		}else if(key<arr[mid]) {
			return binSearch(arr,key,low,mid-1);
		}else if(key>arr[mid]) {
			return binSearch(arr,key,mid+1,high);
		}
		return -1;
		
	}
}
