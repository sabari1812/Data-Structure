package LinkList;

public class RotateList {
    public static void main(String[] args) {

    }
    static rotateRight(Node head,int k){
        k = k%10;
        Node temp = head;
        Node lastNode = head;
        int count = 0;
        while(lastNode.next!=null){
            count++;
            lastNode = lastNode.next;
        }

    }
}
