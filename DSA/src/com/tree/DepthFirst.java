package com.tree;
import  static java.lang.Math.max;

public class DepthFirst {
	
	  static void  inorder(Node root){
		if(root!=null) {
		inorder(root.left);
		System.out.println((root.data));
		inorder(root.right);
	}
	}
       
	  static void preorder(Node root) {
		  if(root!=null) {
			  System.out.println((root.data));
			  inorder(root.left);
				inorder(root.right);
		  }
	  }
	  
	  static void postorder(Node root) {
		  if(root!=null) {
			  inorder(root.left);
				inorder(root.right);
				System.out.println((root.data));
				
		  }
	  }
	  public static int height(Node root) {
		  int l=0,r=0;
		  if(root==null) {
			  return 0;
		  }
		  else {
			 l=height(root.left);
			 r=height(root.right);	 
			 return max(l,r)+1;
	  }
	  }
	  
	  public static void dist(Node root,int k) {
		  if(root!=null) {
		  if(k==0) {
			  System.out.println(root.data);
		  }
		  else {
			  dist(root.left,k-1);
			  dist(root.right,k-1);
		  }}
	  }
	  
	  public static int maxi(Node root) {
		  int l=0,r=0;
		
		  if(root==null) {
			  return 0;
		  }
		  else {
			  l=(maxi(root.left));
			  r=(maxi(root.right));
			  return max(r,root.data);
		  }
	  }
}
