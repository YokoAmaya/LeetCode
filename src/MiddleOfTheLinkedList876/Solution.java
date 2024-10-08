package MiddleOfTheLinkedList876;

import java.util.ArrayList;

class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();
        while (head != null) {
            array.add(head);
            head = head.next;
        }
        return array.get(array.size()/2);
    }
}