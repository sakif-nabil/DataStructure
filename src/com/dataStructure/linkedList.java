package com.dataStructure;

public class linkedList {
	Node head;

	public linkedList(Node head) {
		this.head=head;
		
	}
	public void add(Node newNode) {
		newNode.next=head;
		head=newNode;
	}
	public void Delete() {
		head=head.next;
	}
	public void Display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}

}
