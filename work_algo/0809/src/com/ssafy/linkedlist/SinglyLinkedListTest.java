package com.ssafy.linkedlist;

public class SinglyLinkedListTest {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addLastNode("이하림");
		System.out.println(list.getLastNode());
		list.printList();
		
		list.addLastNode("윤은정");
		list.printList();
		
		list.addFirstNode("이향영");
		list.printList();
		
		list.insertAfterNode(list.getNode("이향영"), "정하은");
		list.printList();
		
	}

}
