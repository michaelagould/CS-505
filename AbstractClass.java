/*
 *
 *  List.java
 *
 */

public interface List<E> extends Iterable<E> {
    void insert(E data);
    void remove(E key);
    E retrieve(int index);
    boolean search(E key);
}

/*
 *
 *  AbstractList.java
 *
 */

public abstract class AbstractList<E> implements List<E> {

    protected class Node<T> {

        protected Node(T data) {
            this.data = data;
        }

        protected T data;
        protected Node<T> next;
    }

    protected Node<E> head;
}

/*
 *
 *  SortedList.java
 *
 */

public class SortedList<E extends Comparable<? super E>> extends AbstractList<E> {
	
	Iterator<E> iterator(){
		returns new Iterator<E>(){
			
			public boolean hasNext(){
				return curr.next != null;
			}
			
			public E next(){
				E temp = curr.data;
				curr = curr.next;
				return temp;
			}
			
			public void remove() {
			throw new UnsupportedOperationException();
			}
			
			private Node curr = head;
		}
    public void insert(E data) {
        
		Node temp = new Node(data);
        head = insert(head, temp);
    }
    
	private Node<E> insert(Node<E> curr, Node<E> node) {
        ...
    }
    
	public void remove(E key) {
        head = remove(head, key);
    }
    
	private Node<E> remove(Node<E> curr, E key) {
        ...
    }
    
	public E retrieve(int index) {
        return retrieve(index, head);
    }
	
	private E retrieve(int index, Node curr) {
		if (curr == null) {
			return null;
		}
		else if (index == 0) {
			return curr.data;
		}
		return retrieve(index-1, curr.next);
}
    
	public boolean search(E key) {
        return search(head, key);
    }
    
	private Node<E> search(Node<E> curr, E key) {
        ...
    }
}


}