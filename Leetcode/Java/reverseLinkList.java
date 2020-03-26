public class reverseLinkList{

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            //makes it easier to deal with the last node.
            return head;
        }
       return reverse_rec(head);
    }
    
    private ListNode reverse_rec(ListNode head) {
        if (head.next == null) {
            //Found the end.
            return head;
        }
        //Recurse all the way to the end of the list.
        ListNode temp = reverse_rec(head.next);
				//The last node is always head.next since it will  be at the end of the  returned list.
        head.next.next = head;
				//Set a null to the end of the current node.
        head.next = null;
        return temp;
    }
    

    public static void main(String[] args){

    }
}