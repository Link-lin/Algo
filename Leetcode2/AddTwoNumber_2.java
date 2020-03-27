
public class AddTwoNumber_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode tmpHead = head;

        // Go throught the length which is shorter
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            if (val >= 10) {
                carry = 1;
                tmpHead.next = new ListNode(val % 10);
            } else {
                carry = 0;
                tmpHead.next = new ListNode(val);
            }
            tmpHead = tmpHead.next;
                l1 = l1.next;
                l2 = l2.next;
        }

        // Quick check if they are all done if so return
        if (l1 == null && l2 == null) {
            if (carry == 0)
                return head.next;
            else {
                tmpHead.next = new ListNode(carry);
                return head.next;
            }
        }

        // Get the rest of the list
        ListNode rest = l1 == null ? l2 : l1;
        if (carry == 0) {
            tmpHead.next = rest;
            return head.next;
        } else {
            while(rest!=null){
                int val = rest.val + carry;
                if (val >= 10) {
                    carry = 1;
                    tmpHead.next = new ListNode(val % 10);
                } else {
                    carry = 0;
                    tmpHead.next = new ListNode(val);
                }
                tmpHead = tmpHead.next;
                rest = rest.next;
            }
            if (carry == 0)
                return head.next;
            else {
                tmpHead.next = new ListNode(carry);
                return head.next;
            }
        }
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

    public static void main(String[] args) {

    }
}