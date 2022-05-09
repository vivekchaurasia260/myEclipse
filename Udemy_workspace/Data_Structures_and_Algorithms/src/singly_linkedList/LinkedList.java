package singly_linkedList;

public class LinkedList {
	
	 Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public Node insertAtEnd(int data) {
		
		if(head==null) {
			head = new Node(data);
		}
		else {
			Node temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(new Node(data));
		}
		
		return head;
	}
	
	public Node insertAtBegin(int data) {
		Node temp=new Node(data);
		temp.setNext(head);
		head=temp;		
		
		return head;
	}
	
	public Node insertAtSpecifiedPos(int data, int pos) {
		Node newNode = new Node(data);
		
		if(head==null)
			return null;
		
		Node temp = head;
		while(--pos >= 0) {
			temp=temp.getNext();
		}
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		
		return head;
	}
	
	public void deleteFromEnd() {
		
		if(head==null)
			System.out.println("No Element");
		else if(head.getNext()==null)
			head=null;
		else {
			Node temp = head;
			
			while(temp.getNext().getNext()!=null) {
				temp=temp.getNext();
			}
			
			temp.setNext(null);
		}
		
	}
	
	public void deleteFromBegin() {
		
		head = head.getNext();
	}
	
	
	public void deleteFromSpecifiedPosition(int pos) {
		Node temp = head;
		
		for(int i=0; i<pos; i++) {
			temp=temp.getNext();
		}
		
		temp.setNext(temp.getNext().getNext());
		
	}
	
	public int lastNodeInList() {
		
		Node temp=head;
		
		if(head==null)
			return 0;
		
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		
		return temp.getData();
	}
	
	public Node reverseLinkedList() {
		Node prev=null;
		Node current=head;
		
		while(current!=null) {
			Node currNext=current.getNext();
			current.setNext(prev);
			prev=current;
			current=currNext;	
		}
		
		return prev;
		
	}
	
	// finding the odd element by removing even...
	
	public Node removeEvenElement() {
		
		Node current=head;
		Node currNext=head.getNext();
		
		
		while(currNext!=null) {
			
			if(currNext.getData()%2==0) {
				currNext=currNext.getNext();
			}
			else {
				current.setNext(currNext);
				current=currNext;
				currNext=current.getNext();
			}
			
			
		}
		
		if(head.getData()%2==0) {
			head=head.getNext();
		}
		
		
		return head;
		
		
	}
	
	public void print() {
		Node temp = head;
		
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.print(temp.getData());
		System.out.println();
		
	}
	
	public void print(Node head) {
		
		Node temp=head;
		
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		
		System.out.print(temp.getData());
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(33);
		list.insertAtEnd(60);
		list.insertAtEnd(63);
		list.insertAtEnd(30);
		list.insertAtEnd(50);
		list.insertAtEnd(91);
		list.insertAtEnd(93);
		list.insertAtEnd(94);
		
		list.print();
		
		list.insertAtBegin(50);
		list.insertAtBegin(11);
		list.insertAtBegin(60);
		list.insertAtBegin(70);
		list.insertAtBegin(75);
		list.insertAtBegin(80);
		list.insertAtBegin(90);
		list.insertAtBegin(102);
//		
//		list.insertAtSpecifiedPos(111, 2);
//		
		list.print();
		
//		list.deleteFromEnd();
//		list.print();
//		
//		list.deleteFromEnd();
//		list.print();
//		
//		list.deleteFromBegin();
//		list.print();
//		
//		list.deleteFromBegin();
//		list.print();
//		
//		list.deleteFromSpecifiedPosition(3);
//		list.print();
		
		System.out.println("The Last node is " +list.lastNodeInList());
		
////		
////		Node rev = list.reverseLinkedList();
////		
////		list.print(rev);
//		
//		// finding the odd element in linked list.
		
		Node oddNode = list.removeEvenElement();
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------------------------------------------------------------------------");
		
		list.print(oddNode);
		
		
		
	}
	
}
