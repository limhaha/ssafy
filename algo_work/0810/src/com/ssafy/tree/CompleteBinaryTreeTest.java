package com.ssafy.tree;

import java.util.Iterator;

public class CompleteBinaryTreeTest {

	public static void main(String[] args) {
		
		int size = 9;
		CompleteBinaryTree tree = new CompleteBinaryTree(size);
		
		for (int i = 0; i < size; i++) {
			tree.add((char)(65+i));
		}
		
//		tree.bfs2();
		tree.dfsByPreorder();
		tree.dfsByInorder();
	}

}

