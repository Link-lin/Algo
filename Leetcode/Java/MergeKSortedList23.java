import java.util.*;

public class MergeKSortedList23{

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.val,b.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (!queue.isEmpty()) {
            ListNode removed = queue.remove();
            ListNode node = new ListNode(removed.val);
            result.next = node;
            result = result.next;
            if (removed.next != null) {
                queue.offer(removed.next);
            }
        }
        return head.next;
    }
    public static void main(String[] args){

    }
}