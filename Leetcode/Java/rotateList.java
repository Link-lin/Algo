public class rotateList{

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode tempHead = head;
        int length = 1;
        while(head.next!= null){
            length ++;
            head = head.next;            
        }
        k = k%length; 
        head = tempHead;
        if(k == 0) return head;

        // Old start of the original List
        ListNode start = head;
        for (int i = 1; i < length-k; i++) {
            head = head.next;
        }

        // New Start of the list
        tempHead = head.next;
        if(tempHead == null){
            return head;
        }
        ListNode end = tempHead;
        while(end.next !=null){
            end = end.next;
        }
        end.next = start;
        head.next = null;
        return tempHead;
    }

    public static void main(String[] args){

    }
}