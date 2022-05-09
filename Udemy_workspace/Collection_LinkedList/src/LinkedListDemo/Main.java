package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit=new LinkedList<String>();
//		placesToVisit.add("Ajmer");
//		placesToVisit.add("Lunknow");
//		placesToVisit.add("Varanasi");
//		placesToVisit.add("Tirumala");
//		placesToVisit.add("Kochi");
//		placesToVisit.add("Rajasthan");
//		placesToVisit.add("Sikkim");
		
		
		
	//	System.out.println("Places to visit "+placesToVisit);
		
		addInOrder(placesToVisit, "Ajmer");
		addInOrder(placesToVisit, "Lunknow");
		addInOrder(placesToVisit, "Varanasi");
		addInOrder(placesToVisit, "Tirumala");
		addInOrder(placesToVisit, "Kochi");
		addInOrder(placesToVisit, "Sikkim");
		addInOrder(placesToVisit, "Rajasthan");
		printList(placesToVisit);		
		
		addInOrder(placesToVisit, "Allahabad");
		addInOrder(placesToVisit, "Kochi");
		addInOrder(placesToVisit, "Kanpur");
		printList(placesToVisit);
		
		visit(placesToVisit);
	}
	
	private static void printList(LinkedList<String> linkedlist) {
		Iterator<String> itr=linkedlist.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Now visiting " + itr.next());
		}
		
		System.out.println("===========================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedlist, String newCity) {
		ListIterator<String> stringListIterator=linkedlist.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison=stringListIterator.next().compareTo(newCity);
			
			if(comparison==0) {
				System.out.println(newCity +" is already included as a destination");
				return false;
			}
			else if(comparison>0) {
				stringListIterator.previous();
				stringListIterator.add(newCity);
				
				return true;
			}
			else if(comparison<0) {
				// move to next city.
			}
		}
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList<String> cities) {
		Scanner scan=new Scanner(System.in);
		boolean quit=false;
		boolean goingForward=true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
			return;
		}
		else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action=scan.nextInt();
			scan.nextLine();
			
			switch(action) {	
				case 0 :
					System.out.println("Holiday (Vacation) is over");
					quit=true;
					break;
				case 1 :
					if(listIterator.hasNext()) {
						System.out.println("Now visiting " +listIterator.next());
					}
					else {
						System.out.println("Reached the end of the list");
					}
					break;
				case 2 :
					if(listIterator.hasPrevious()) {
						System.out.println("Now visiting " +listIterator.previous());
					}
					else {
						System.out.println("We are at the start of the list");
					}
					break;
				case 3 :
					printMenu();
					break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n"	+ 
						   "1 - go to next city\n" + 
						   "2 - go to previous city\n" + 
						   "3 - print menu options");
		
	}
	
}
