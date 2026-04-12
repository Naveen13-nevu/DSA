package com.interview.preparation;

import java.util.Stack;

public  class MinStack{

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int n){
        stack.push(n);
        if(minStack.isEmpty() || n<= minStack.peek()){
            minStack.push(n);
        }
    }

    public void pop(){
        int top = stack.peek();
        if(!minStack.isEmpty() && top == minStack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(7);
        minStack.push(3);

        System.out.println("Min: "+minStack.getMin());
        System.out.println("Min: "+minStack.top());
        minStack.pop();
        System.out.println("Min: "+minStack.getMin());
    }
}