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
        String res="";
        while(head!=null)
        {
            res+=head.val;
            head=head.next;
        }

         String temp = new StringBuilder(res).reverse().toString();


         if(res.equals(temp))
         {
            return true;
         }

         return false;

    }
}