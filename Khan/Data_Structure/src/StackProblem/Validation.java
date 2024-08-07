package StackProblem;

import java.util.Scanner;

public class Validation {
	
	Node head;
	
	Validation() {
		head=null;
	}
	
	
	public void pushInStack(char brace) {
		if(head==null) {
			head=new Node(brace);
		}
		else {
			Node temp=new Node(brace);
			temp.setNext(head);
			head=temp;
		}
	}
	
	public boolean popFromStack(char bracket) {
		if((bracket=='}' && head.getData()=='{') || (bracket==']' && head.getData()=='[') || (bracket==')' && head.getData()=='(')) {
			head=head.getNext();
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int i;
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		Validation check = new Validation();
		
		for(i=0; i<input.length(); i++) {
			if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='<' ) {
				check.pushInStack(input.charAt(i));
			}
			else {
				 flag=check.popFromStack(input.charAt(i));
				if(flag==false) {
					break;
				}
			}
		}
		
		if(flag==true) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
	}
}
