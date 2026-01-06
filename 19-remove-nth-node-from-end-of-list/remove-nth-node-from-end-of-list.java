class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list = new ListNode(0);
        list.next = head;
        
        ListNode temp = list;
        ListNode temp1 = list;
        for(int i = 0; i <= n; i++){
            temp = temp.next;
        }
        while(temp != null){
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return list.next;
    }
}