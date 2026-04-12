package com.interview.preparation;

class ReverseLinkedList {

	static class ListNode{
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val = val;
			this.next=null;
			
		}
	}
	
	public static  ListNode reverse(ListNode head) {
		
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr != null) {
			
			ListNode next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
        
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
			
		}
		System.out.println("null");
	}

      
    public static void main(String[] args) {

    	
    	ListNode head = new ListNode(1);
    	head.next=new ListNode(2);
    	head.next.next = new ListNode(3);
    	head.next.next.next = new ListNode(4);
    	
    	System.out.println("befor reversing: ");
    	printList(head);
    	
    	System.out.println("after reversing: ");
    	
    	head = reverse(head);
    	
    	printList(head);
    	
        
    }
}