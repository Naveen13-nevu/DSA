package com.interview.preparation;

public class LinkedListCycle {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to detect cycle
    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {

        // Creating nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // 🔁 Create a cycle (important for testing)
        fourth.next = second; // cycle here

        // Test
        boolean result = hasCycle(head);

        if (result) {
            System.out.println("Cycle detected in the linked list");
        } else {
            System.out.println("No cycle in the linked list");
        }
    }
}