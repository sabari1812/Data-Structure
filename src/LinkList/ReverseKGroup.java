package LinkList;

public class ReverseKGroup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = LinkList.Convertor(arr);

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevNode =  null;
        ListNode temp = head;
        while(temp!=null){
            ListNode  kthNode = findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next = temp;
                }
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            ListNode reverseHead = reverse(temp);
            if(head==temp){
                head = reverseHead;
            }else{
                prevNode.next = reverseHead;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    public ListNode findKthNode(ListNode temp,int k){

        while(temp!=null && k>1){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            //temp.next = front;
            temp = front;
        }
        return prev;
    }
}
