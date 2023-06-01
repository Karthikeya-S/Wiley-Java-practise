package DSA;

public class LinkedListClass {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	void sortedLinkedList(Node head) {
		Node current = head;
		Node index = null;
		int temp;
		if(head==null) {
			return;
		}
//		else {
//			while(current!=null) {
//				index = current.next;
//				
//				while(index!=null) {
//					if(current.value >index.value) {
//						current.value = index.value;
//						temp = current.value;
//						index.value = temp;
//					}
//					index = index.next;
//				}
//				current = current.next;
//			}
//		}
	}
	//Insert at the end
	//Insert at the beginning
	//Insert in the middle
	//Delete at the end
	//Delete at the beginning
	//Delete in the middle
	//Print LinkedList
	//Search node by key (head, key)
	//sort the LinkedList
	public static void main(String[] args) {
		LinkedListClass llc = new LinkedListClass();
		llc.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
	}
}
