package DSA;

public class StackClass {
	private int arr[];
	private int top;
	private int cap;
	
	StackClass(int size){
		arr = new int[size];
		cap = size;
		top = -1;
	}
	
	public int size() {
		return top +1;
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack overflow, programming terminated");
			System.exit(1);
		}
		System.out.println("Inserting : "+x);
		arr[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, programming terminated");
			System.exit(1);
		}
		return arr[top--];
	}
	
	//check stack is full or not
	public boolean isFull() {
		return top == cap - 1; //  full - true , not full - false
	}
	
	//check stack is empty or not
	public boolean isEmpty() {
		return top == -1;	// //  empty - true , not empty - false
	}
	
	public void printStack() {
		for(int i=0;i<= top;i++) {
			System.out.println("element "+(i+1)+": "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		StackClass mystack = new StackClass(5);
		
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.pop();
		
		mystack.printStack();
	}
}
