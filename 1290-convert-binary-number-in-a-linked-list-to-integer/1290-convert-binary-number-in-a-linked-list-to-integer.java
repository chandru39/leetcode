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
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode curr = head;
        while (curr != null) {
            result = result * 2 + curr.val;
            curr = curr.next;
        }
        return result;
    }
}
/*explanation:0*2+1=1
              1*2+0=2
              2*2+1=5*/