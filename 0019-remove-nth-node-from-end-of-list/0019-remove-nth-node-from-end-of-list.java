class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }    
        int idx = size - n -1 ;
        ListNode prev = head;
        int i = 0;
        while (i < idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}