
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x;
    }
}
class MergeLinkedList{

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode q =l1, p = l2,  head = dummy;

        while(q!=null || p != null){
            // If q is not available any more
            if(q == null){
                head.next = new ListNode(0);
                head.next.val = p.val;
                head = head.next;
                p = p.next;
                continue;
            }
            // If p is not available any more
            if(p == null){
                head.next = new ListNode(0);
                head.next.val = q.val;
                head = head.next;
                q = q.next; 
                continue;
            }

            // If both are valid
            if(q!=null && p!=null){
                int x = q.val;
                int y = p.val;
                if (x > y){
                    head.next = new ListNode(0);
                    head.next.val = p.val;
                    head = head.next;
                    p = p.next;
                    continue;
                }
                else{
                    head.next = new ListNode(0);
                    head.next.val = q.val;
                    head = head.next;
                    q = q.next;
                    continue;
                }
            }
        }
        return dummy.next;
    }


    public static void main(String[] args){

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
 
        System.out.print("1");
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result =  mergeTwoLists(l1, l2);

        while(result.next !=null){
            System.out.println(result.val);
            result = result.next;
        }

        
    }
}