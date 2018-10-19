package learn.sample.queue;

public class Queues {
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
		
	}

	
  Node head;
  Node tail;
  
  
  public void addItem(int data) {
	  
	 Node node=new Node(data);
	 if(tail!=null) {
		 tail.next=node;
	 }
	 if(head==null) {
		 head=node;
	 }
	 tail=node;
	
  }
	
  public int removeItem() {
	  
	  if(head==null) {
		  tail=null;
		  return -1;
	  }
	  
	  int data=head.data;
	  
	  head=head.next;
	 
	  return data;
	  
  }
  
  public int peek() {
	  return head.data;
  }
  
  public void printAllItems() {
		
		if(head==null) {
			System.out.println("No items found");
		}
		Node current=head;	
		System.out.println(current.data);
		while(current.next!=null) {
			current=current.next;
			System.out.println(current.data);
		}
		
	}

}
