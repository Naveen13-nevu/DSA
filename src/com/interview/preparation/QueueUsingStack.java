package com.interview.preparation;

import java.util.Stack;

public class QueueUsingStack {
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	
	public void push(int num) {
		stack1.push(num);
	}
	
	 public int pop() {
		 
		 if(stack2.isEmpty()) {
			 while(!stack1.isEmpty()) {
				 stack2.push(stack1.pop());
			 }
		 }
		 return stack2.pop();
	 }
	 
	 public int peek() {
		 if(stack2.isEmpty()) {
			 while(!stack1.isEmpty()) {
				 stack2.push(stack1.pop());
			 }
		 }
		 return stack2.peek();
	 }
	 
	 public boolean isEmpty() {
		 return stack1.isEmpty() && stack2.isEmpty();
	 }

	public static void main(String[] args) {
		
		QueueUsingStack q= new QueueUsingStack();
		q.push(10);
		q.push(20);
		q.push(30);
		
		System.out.println(q.peek()); 
		System.out.println(q.pop()); 
		System.out.println(q.peek()); 
		
	}

}
