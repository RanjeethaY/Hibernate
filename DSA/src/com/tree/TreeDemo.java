package com.tree;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Node r=null;
 r = new Node(10);
 r.left=new Node(20);
 r.right=new Node(30);
 r.left.left=new Node(40);
 r.right.right=new Node(50);
System.out.println(DepthFirst.maxi(r));
 
	}

}
