package question2;
class ListNode{
    public int val;
    public ListNode next;
    ListNode(int num){
        this.val = num;
    }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1val = (l1 == null)? 0 : l1.val;
        int l2val = (l2 == null)? 0 : l2.val;
        int num = l1val+l2val;
        int carry = 0;
        if(num>9){
            carry++;
            num%=10;
        }
        ListNode listNode = new ListNode(num);
        ListNode head = listNode;
        l1 = (l1 == null) ? l1 : l1.next;
        l2 = (l2 == null) ? l2 : l2.next;
        while(l1 != null || l2 !=null){
            l1val = (l1 == null)? 0 : l1.val;
            l2val = (l2 == null)? 0 : l2.val;
            num = l1val+l2val+carry;
            carry=0;
            if(num>9){
                carry=1;
                num%=10;
            }
            listNode.next=new ListNode(num);
            listNode=listNode.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        if(carry==1){
            listNode.next=new ListNode(1);
        }
        return head;
    }
}