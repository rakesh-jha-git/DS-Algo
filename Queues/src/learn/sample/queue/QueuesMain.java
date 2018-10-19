package learn.sample.queue;

import java.util.Scanner;

public class QueuesMain {
	
	public static void main(String [] args) {
		Scanner  in =new Scanner(System.in);
		System.out.println("Enter the number items to  add in linkedList");
		int n=in.nextInt();
		
		Queues queueSample=new Queues();
		System.out.println("Enter the values of an array");
		
		for(int i=0;i<n;i++) {
			int num=in.nextInt();
			queueSample.addItem(num);
		}
		
		System.out.println("All linkedList items are:");
		queueSample.printAllItems();
		
		
		System.out.println("removing item to delete from Queue");

		queueSample.removeItem();
		
		
		System.out.println("Peeking item to delete from Queue is:"+queueSample.peek());

		
		
		
		
		
		
	}

}
