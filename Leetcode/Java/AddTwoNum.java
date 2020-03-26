class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

class AddTwoNum{
    public static ListNode add(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(0);
        ListNode q = l1, p = l2, head = re;
        int carry = 0;

        while((q != null) || (p != null) || (carry !=0)){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int carrybefore =  carry;
            carry = (x+y+carrybefore)>9 ? 1 : 0;
            head.next = new ListNode(0);
            head.next.val = (carry == 1) ? (x+y-10+carrybefore):(x+y+carrybefore);
            head = head.next;
            if(p!=null) p= p.next;
            if(q!=null) q= q.next;
        }
        return re.next;
    }


    public static void main (String[] args){
        ListNode l1 = new ListNode (2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode (5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);
        ListNode a = add(l1,l2);
        while(a.next!=null){
            System.out.print(a.val);
            a = a.next;
        }
    }
}