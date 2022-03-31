package sba3;

import java.util.Stack;

public class Sba3_03 {
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		// boolean result = stk.empty();
		// System.out.println("Is the stack empty? " + result);
		stk.push(70);
		stk.push(60);
		stk.push(30);
		stk.push(80);
		System.out.println("Elements in Stack: " + stk);
		// result = stk.empty();
		// System.out.println("Is the stack empty? " + result);

		stk.pop();
		System.out.println("Elements in Stack after pop: " + stk);

		System.out.println("Position of element 70 in stack :" + stk.search(70));

		System.out.println("Element at the top :" + stk.peek());

		System.out.println("Size of stack =" + stk.size());
	}
}
