package LinkList;

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        if(head==null){
            return head;
        }
        ListNode temp = head;

        ListNode front = head;
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
