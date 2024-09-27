package AlgoDesign;


import static AlgoDesign.ListNode.LinkedListMiddle.middleNode;
import static AlgoDesign.ListNode.LinkedListMiddle.printLinkedList;

class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }


        public class LinkedListMiddle {
            public static ListNode middleNode(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;

                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;

                }

                return slow;
            }

            // Helper method to create a linked list from an array of values
            public static ListNode createLinkedList(int[] values) {
                if (values.length == 0) {
                    return null;
                }
                ListNode head = new ListNode(values[0]);
                ListNode current = head;
                for (int i = 1; i < values.length; i++) {
                    current.next = new ListNode(values[i]);
                    current = current.next;
                }
                return head;
            }

            // Helper method to print a linked list
            public static void printLinkedList(ListNode head) {
                ListNode current = head;
                while (current != null) {
                    System.out.print(current.val + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }


        }
        public static void main(String[] args) {
            int[] values = {1, 2, 3, 4, 5};
            ListNode head = LinkedListMiddle.createLinkedList(values);
            System.out.println("Original Linked List:");
            printLinkedList(head);

            ListNode middle = middleNode(head);
            System.out.println("Middle Node:");
            System.out.println(middle.val);
        }
    }


