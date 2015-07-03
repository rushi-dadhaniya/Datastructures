package com.rushi.trees.traversals.recursive;

import com.rushi.trees.vo.BinaryTree;

public class PreOrderTraversal {

	public static void traversal(BinaryTree root) {

		if(root != null) {
			System.out.print(root.getData() + "\t");
			traversal(root.getLeft());
			traversal(root.getRight());
		}
		
	}
	
	public static void main(String[] args) {
		traversal(BinaryTree.getBinaryTree());
	}
}
