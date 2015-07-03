package com.rushi.trees.traversals.recursive;

import com.rushi.trees.vo.BinaryTree;

public class InPreOrderTraversal {

	public static void traversal(BinaryTree root) {

		if(root != null) {
			traversal(root.getLeft());
			System.out.print(root.getData() + "\t");
			traversal(root.getRight());
		}
		
	}
	
	public static void main(String[] args) {
		traversal(BinaryTree.getBinaryTree());
	}
}
