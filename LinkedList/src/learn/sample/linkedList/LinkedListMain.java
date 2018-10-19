package learn.sample.linkedList;

import java.util.Scanner;

public class LinkedListMain {
	
	public static void main(String [] args) {
		Scanner  in =new Scanner(System.in);
		System.out.println("Enter the number items to  add in linkedList");
		int n=in.nextInt();
		
		LinkedList linkedList=new LinkedList();
		System.out.println("Enter the values of an array");
		
		for(int i=0;i<n;i++) {
			
			linkedList.appendNode(in.nextInt());
		}
		
		System.out.println("All linkedList items are:");
		linkedList.printAllItems();
		
		
		System.out.println("Enter item to delete from linked List");
		int num=in.nextInt();
		
		linkedList.deleteWithValue(num);
		linkedList.printAllItems();
		
	}

}
