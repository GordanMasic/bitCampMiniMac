public class BinarySearchTree<T extends Comparable<T>> {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void add(T value) {
		if (root == null) {
			root = new Node(value);
			return;
		} else {
			add(root, value);
		}
	}

	private void add(Node subRoot, T value) {
		if (value.compareTo(subRoot.value) <= 0) {
			if(subRoot.left == null){
				subRoot.left = new Node(value);
				return;
			}
			add(subRoot.left, value);
		} else {
			if(subRoot.right == null){
				subRoot.right = new Node(value);
				return;
			}
			add(subRoot.right, value);
		}
	}

	public void printTree(){
		printTree(root);
	}
	
	private void printTree(Node subRoot){
		if(subRoot == null){
			return;
		}
		printTree(subRoot.left);
		System.out.println(subRoot.value);
		printTree(subRoot.right);
	}
	
//	public String toString(){
//		return toString(root);
//	}
	
//	public String toString(Node subRoot){
//		if(subRoot == null){
//			return "";
//		}
//		
//	}
	
	private class Node {
		T value;
		Node left;
		Node right;

		public Node(T value) {
			this.value = value;
		}

		
	}
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(5);
		tree.add(8);
		tree.add(2);
		tree.add(7);
		tree.add(2);
		tree.printTree();
	}
}
