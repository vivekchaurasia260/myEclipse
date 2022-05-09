package StackProblem;

public class Node {
	private Node next;
	private char data;
	
	Node(char data) {
		this.data=data;
	}
	
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data=data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next=next;
	}

}
