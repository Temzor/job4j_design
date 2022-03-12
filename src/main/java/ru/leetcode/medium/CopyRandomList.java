package ru.leetcode.medium;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node cursor = head;
        while (cursor != null) {
            Node next = cursor.next;
            cursor.next = new Node(cursor.val, next, null);
            cursor = next;
        }

        cursor = head;
        Node copyHead = head.next;
        while (cursor != null) {
            Node next = cursor.next.next;
            Node copy = cursor.next;
            cursor.next = next.next;
            if (next != null) {
                copy.next = next.next;
            }
            cursor = next;
        }
        return copyHead;
    }
}
