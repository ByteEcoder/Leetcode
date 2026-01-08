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
    public boolean isPalindrome(ListNode head) {
        String temp="";

        while(head!=null)
        {
            temp+=head.val;
            head=head.next;
        }

        StringBuilder s=new StringBuilder(temp);
        s.reverse();
        if(temp.equals(s.toString()))
            return true;
        
        return false;


        
    }
}