
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode list = new ListNode(1);
        list.next = head;
        ListNode temp = list;

        while (temp.next != null){
            if (temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return list.next;
    }
}