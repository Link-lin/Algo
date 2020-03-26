public class IntersectionLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // boundary check
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        // if a & b have different len, then we will stop the loop after second
        // iteration
        while (a != b) {
            // for the end of first iteration, we just reset the pointer to the head of
            // another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public int length(ListNode a){
        int length = 1;
        while (a.next !=null){
            a = a.next;
            length++;
        }
        return length;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        // Set both list to the same position
        int lenA = length(headA);
        int lenB = length(headB);

        while (lenA < lenB) {
            lenB--;
            headB = headB.next;
        }
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {

    }
}