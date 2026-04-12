package com.interview.preparation;

public class DetectCycle_II {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
        public static ListNode detectCycle(ListNode head) {

            if (head == null || head.next == null) {
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    slow = head;

                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow; 
                }
            }

            return null;
        }
    

    public static void main(String[] args) {

       
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

       
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        
        fifth.next = third;

        
        ListNode cycleStart = detectCycle(head);

   
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}