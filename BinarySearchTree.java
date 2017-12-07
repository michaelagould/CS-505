import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {

	Iterator<E> iterator(){
		returns new Iterator<E>(){
			
			public boolean hasNext(){
				return curr.left != null && curr.right != null;
			}
			
			public E next(){
				return ;
			}
			
			public void remove() {
			throw new UnsupportedOperationException();
			}
			
			public int getSize(Node<E> curr) {
				int count = 0;
				if (curr != null) {
					count++;
					getSize(curr.left);
					getSize(curr.right);
				}
			return count;
		}
			
			private Node curr = root;
			private array[] data = new array[this.getSize(curr)];
		}
	}
	
	public void insert(E data) {
		Node<E> temp = new Node<E>(data);
		root = insert(root, temp);
	}
	
	private Node<E> insert(Node<E> curr, Node<E> node) {
		return Node<E>
	}
	
	public boolean empty() {
		return root == null;
	}
	
	
	
	public void populate(Node<E> curr,array[] data){
		for(int i = 0; i < data.getSize(); i++) {
			populate(curr.left);
			data[i] = curr.data;
			populate(curr.right);
		}
	
    public void remove(E key) {
        
    }
	
	private Node<E> remove(Node<E> curr, E key)

  	public boolean search(E key) {
    return search(root, key);
	}
	
	private boolean search(Node<E> curr,E key) {
    Node<E> curr = root;
    int cmp;
    if(curr == null)
		return false;
	if ((cmp = key.compareTo(curr.data)) == 0) 
        return true;
    else if (cmp < 0)
        search(curr.left, key);
    else {
        search(curr.right, key);
        }
    }
	
}
}