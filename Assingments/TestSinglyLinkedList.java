package Assingments;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLikedlist list=new SinglyLikedlist();
		list.insert(45);
		list.insert(90);
		list.insert(345);
		list.insert(23);
		list.display();
		System.out.println("total node created : "+list.nodeCount);
		System.out.println("reverse list");
		list.reverse(list.head);

	}

}
