package learn.sample.stack;

public class Stack {
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
		
	}

 Node top;
 
 public void push(int data) {
	 Node node=new Node(data);
	 node.next=top;
	 top=node;
	 
 }
 
 public int pop() {
	 if(!isEmpty()) {
		 top=top.next;
		 return top.data; 
	 }
	 
	 return -1;
 }
 
 public boolean isEmpty() {
	 if(top==null)
	 return true;
	 
	 return false;
 }
 
public int peek() {
	return top.data;
	
}
}
