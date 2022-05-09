package circular_linkedList;

public class CircularLinkedList {
	
	Node head;
	Node tail;

	public CircularLinkedList() {
		head=null;
		tail=null;
	}
	
	public void insertAtEnd(int data) {
		
		if(head==null && tail==null) {
			head = new Node(data);
			tail=head;
			tail.setNext(head);
		}
		else {
			Node temp = new Node(data);
			while(tail.getNext()!=head) {
				tail=tail.getNext();
			}
			
			tail.setNext(temp);
			tail=tail.getNext();
			tail.setNext(head);
		}
		
	}
	
	public void insertAtBegin(int data) {
		
		if(head==null && tail==null) {
			head=new Node(data);
			tail=head;
			tail.setNext(head);
		}
		else {
			Node temp=new Node(data);
			temp.setNext(head);
			head=temp;
			tail.setNext(head);
		}
		
		
	}
	
	public boolean isCircularList() {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.getNext()!=null) {
			
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			
			if(slow==fast) {
				return true;
			}
						
		}
		
		
		return false;
	}
	
	public void print() {
		
		Node temp=head;
		
		while(temp!=tail) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		
		System.out.print(temp.getData());
		
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.insertAtEnd(10);
		cll.insertAtEnd(20);
		cll.insertAtEnd(30);
		cll.insertAtEnd(40);
		cll.insertAtEnd(50);
		cll.insertAtEnd(60);
		
		cll.print();
		
//		cll.insertAtBegin(50);
//		cll.insertAtBegin(70);
//		cll.insertAtBegin(80);
//		cll.insertAtBegin(110);
//		cll.insertAtBegin(40);
//		cll.insertAtBegin(10);
//		
//		cll.print();
		
		
		System.out.println(cll.isCircularList() ? true : false);
		
		
				
	}

}
