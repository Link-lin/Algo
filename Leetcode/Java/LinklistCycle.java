public class LinklistCycle{

    public boolean hasCycle(ListNode head) {
        ListNode runner = head;
        ListNode walker = head;
        
        while(walker.next != null && runner.next.next!=null){
            runner = runner.next.next;
            walker = walker.next;
            if(walker == runner) return true;
        }
        return false;
    }

    public static void main(String[] args){

    }
}