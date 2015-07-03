package com.rushi.trees.vo;

public class BinaryTree {

	int data;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int data, BinaryTree left, BinaryTree right) {
		setData(data);
		setLeft(left);
		setRight(right);
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	
	public static BinaryTree getBinaryTree() {
		
		BinaryTree leftLeafNode1 = new BinaryTree(4, null, null);
		BinaryTree rightLeafNode1 = new BinaryTree(5, null, null);
		BinaryTree parent1 = new BinaryTree(2, leftLeafNode1, rightLeafNode1);
		
		BinaryTree leftLeafNode2 = new BinaryTree(6, null, null);
		BinaryTree rightLeafNode2 = new BinaryTree(7, null, null);
		BinaryTree parent2 = new BinaryTree(3, leftLeafNode2, rightLeafNode2);
		
		BinaryTree root = new BinaryTree(1, parent1, parent2);
		
		return root;
		
	}
	
}
