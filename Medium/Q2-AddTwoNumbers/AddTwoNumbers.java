/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode();
        ListNode current = solution;
        int carryvalue = 0;
        int value1;
        int value2;
    
        while ((l1 != null) || (l2 != null) || (carryvalue > 0)) {
            if (l1 != null) {
                value1 = l1.val;
            } else { value1 = 0;}

            if (l2 != null) {
                value2 = l2.val;
            } else { value2 = 0;}

            int totalvalue = value1 + value2 + carryvalue;
            carryvalue = totalvalue / 10;
            totalvalue = totalvalue % 10;
            current.next = new ListNode(totalvalue);
            current = current.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }
    return solution.next; }
}