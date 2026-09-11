class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;
        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        ListNode newnode = new ListNode(-1);
        ListNode temp = newnode;

        while(left != null && right != null){
            if(left.val > right.val){
                temp.next = right;
                right = right.next;
            }
            else{
                temp.next = left;
                left = left.next;
            }

            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return newnode.next;
    }
}