public class RemoveLinkedList{
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode re = temp;

        while(temp.next != null){
            while(temp.next.val == val){
                temp.next = temp.next.next;
                if(temp.next == null) break;
            }
            temp = temp.next;
            if(temp == null) break;
        }
        return re.next;
    }

    public static void main(String[] args){

    }
}