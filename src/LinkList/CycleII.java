package LinkList;

public class CycleII {
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
                slow = head;
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
