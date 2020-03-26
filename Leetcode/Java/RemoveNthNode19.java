import java.util.*;

public class RemoveNthNode19{
    // 1ms, memory beats 100%
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> arr = new ArrayList<>();
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        while(temp.next != null){
            arr.add(temp.next);
            temp = temp.next;
        }
        int length = arr.size();
        if(n == length){
            return head.next;
        }
        else{
            arr.get(length-n-1).next = (n == 1) ? null : arr.get(length - n +1);
        }
        return head;
    }

    public static void main(String[] args){

    }
}