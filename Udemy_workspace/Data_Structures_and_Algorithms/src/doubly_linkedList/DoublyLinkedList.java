package doubly_linkedList;

public class DoublyLinkedList {
	
Node head;
	
	public DoublyLinkedList() {
		head = null;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			head.setPrev(null);
			head.setNext(null);
		}
		else {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();				
			}
			
			temp.setNext(newNode);
			newNode.setPrev(temp);
			
		}

	}
	
	public void insertAtBegin(int data) {
		
		if(head==null) {
			head=new Node(data);
			return;
		}
			
		Node newNode = new Node(data);
		
		newNode.setNext(head);
		head.setPrev(newNode);
		head=newNode;
		
	}
	
	public void insertAtSpecifiedPos(int data, int pos) {
		Node tempData = new Node(data);
		
		if(head==null)
			head=new Node(data);
		else {
			Node temp = head;
			for(int i=0; i<pos; i++) {
				temp=temp.getNext();
			}
			tempData.setPrev(temp);
			tempData.setNext(temp.getNext());
			temp.getNext().setPrev(tempData);
			temp.setNext(tempData);
			
		}
		
	}
	
	public void deleteFromEnd() {
		
		if(head==null)
			System.out.println("No Element");
		else if(head.getNext()==null)
			head=null;
		else {
			Node temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp=temp.getPrev();
			temp.setNext(null);
		}
		
	}
	
	public void deleteFromBegin() {
		
		if(head==null)
			System.out.println("No Element");
		else {
			head=head.getNext();
		}
		
	}
	
	public void deleteFromSpecifiedPos(int pos) {
		
		if(head==null)
			System.out.println("No Element");
		else {
			Node temp=head;
			for(int i=1; i<pos; i++) {
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			temp.getNext().getNext().setPrev(temp);
		}
		
		
	}
	
	public void print() {
		Node temp = head;
		if(head==null)
			System.out.println("List is Empty");
		else {
			
			while(temp.getNext()!=null) {
				System.out.print(temp.getData()+"->");
				temp=temp.getNext();
			}
			System.out.println(temp.getData());
			
		}
		
	}

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertAtEnd(10);
		dll.insertAtEnd(20);
		dll.insertAtEnd(30);
		dll.insertAtEnd(40);
		dll.insertAtEnd(50);
		dll.insertAtEnd(60);
		
		dll.print();
		
//		dll.insertAtBegin(50);
//		dll.insertAtBegin(70);
//		dll.insertAtBegin(90);
//		dll.insertAtBegin(110);
//		dll.insertAtBegin(130);
//		
//		
//		dll.print();
		
//		dll.deleteFromEnd();
//		dll.deleteFromEnd();
//		dll.deleteFromEnd();
//		dll.deleteFromEnd();
//		dll.deleteFromEnd();
//		dll.print();
		
//		dll.deleteFromBegin();
//		dll.deleteFromBegin();
//		dll.deleteFromBegin();
//		dll.deleteFromBegin();
//		dll.deleteFromBegin();
//		
//		dll.print();
		
//		dll.insertAtSpecifiedPos(60, 3);
//		dll.print();
//		
//		dll.deleteFromSpecifiedPos(4);
//		dll.print();
//		
//		dll.deleteFromSpecifiedPos(6);
//		dll.print();
		
		
}
	
}
