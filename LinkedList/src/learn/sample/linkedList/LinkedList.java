package learn.sample.linkedList;

public class LinkedList {
	
	Node head;

	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}

	}
	
	public void appendNode(int data) {
		
		if(head==null) {
			Node node=new Node(data);
			head=node;
		}
		
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		
		current.next=new Node(data);
	}
	
	public void prepend(int data) {
		if(head==null) {
			Node node=new Node(data);
			head=node;
		}
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	
	public void deleteWithValue(int data){
		if(head==null)
			return;
		if(head.data==data) {
			head=head.next;
		}
		
		Node current=head;
		
		while(current.next!=null) {
			if(current.next.data==data) {
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
		
	}
	
	public void printAllItems() {
	
		if(head==null) {
			System.out.println("No items found");
		}
		Node current=head;		
		while(current.next!=null) {
			current=current.next;
			System.out.println(current.data);
		}
		
		
	}
	
}
