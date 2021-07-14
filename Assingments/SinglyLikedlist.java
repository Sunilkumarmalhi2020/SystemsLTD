package Assingments;

public class SinglyLikedlist {

	Node head,tail=null;
	int nodeCount=0;

	public void insert(int data){
		nodeCount+=1;
		Node node=new Node(data);
		if(head==null){
			//if list is empty both head and tail point to new node
			head=node;
			tail=node;
		}
		else
		{
			//new node will be added after tail such that tail's next will point to newNode
			tail.next=node;
			// new node will become new tail of the list
			tail=node;
		}
	}
	// end of insert method....

	public void reverse(Node current){
		// chech if list is empty or not
		if(head==null){
			System.out.println("list is empty");
			return;
		}

		else
			{
				// if reference is null in node then prints it.
				if(current.next==null)
				{
				System.out.println(current.data+" ");
				return;
				}
				// recursively calls reverse method
				reverse(current.next);
				System.out.println(current.data+" ");
			}
	}
	// end of reverse method...

	public void display(){
		Node current=head;
		if(head==null){
			System.out.println("list is empry");
			return;
		}
		while(current!=null){
			System.out.println(current.data+" ");
			current=current.next;
		}
	}
	// end of display method
}
