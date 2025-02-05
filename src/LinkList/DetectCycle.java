package LinkList;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;

        if(head==null){
            return head;
        }
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
