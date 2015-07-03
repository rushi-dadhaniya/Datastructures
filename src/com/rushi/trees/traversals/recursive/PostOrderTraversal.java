package com.rushi.trees.traversals.recursive;

import com.rushi.trees.vo.BinaryTree;

public class PostOrderTraversal {

	public static void traversal(BinaryTree root) {

		if(root != null) {
			traversal(root.getLeft());
			traversal(root.getRight());
			System.out.print(root.getData() + "\t");
		}
		
	}
	
	public static void main(String[] args) {
		traversal(BinaryTree.getBinaryTree());
	}
}
