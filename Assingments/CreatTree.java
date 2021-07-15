package BinaryTree;

import java.util.Scanner;

public class CreatTree {

	static Scanner sc=null;
	public static Node createTree(){
		Node root=null;
		System.out.println("Enter data : ");
		int data=sc.nextInt();
		if(data==-1)return null;
		root=new Node(data);

		System.out.println("Enter left for : "+data);
		root.left=createTree();
		System.out.println("Enter right for: "+data);
		root.right=createTree();
		return root;
	}
	public static void main(String arg[]){
		sc=new Scanner(System.in);
		createTree();
	}
}
