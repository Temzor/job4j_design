package ru.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        if (head == null) {
            return null;
        }
        Node temp = new Node(head.val);
        map.put(head, temp);
        temp.next = copyRandomList(head.next);
        temp.random = map.get(head.random);
        return temp;
    }
}
