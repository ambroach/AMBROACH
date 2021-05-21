public class Stack {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) { this.data = data; }
	}

	public boolean isEmpty()
	{
		if (root == null) {
			return true;
		}
		else
			return false;
	}

	public void push(int data)
	{
		StackNode newNode = new StackNode(data);

		if (root == null) {
			root = newNode;
		}
		else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " Added to the stack");
	}

	public int pop()
	{
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println(" No values in the stack");
		}
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public int peek()
	{
		if (root == null) {
			System.out.println(" No values in the stack");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	public static void main(String[] args)
	{

		Stack sll = new Stack();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop()
						+ " Elemet Poped");

		System.out.println("Top element is " + sll.peek());
	}
}
