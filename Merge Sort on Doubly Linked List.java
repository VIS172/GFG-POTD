class Solution {
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null  && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = slow.next;
        slow.next = null;
        temp.prev = null;
        
        return temp;
    }
    
    public static Node merge(Node l1,Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        if(l1.data <= l2.data){
             l1.next = merge(l1.next, l2);
             if (l1.next != null)
                l1.next.prev = l1;
             l1.prev = null;
             return l1;
        }
        else{
            l2.next = merge(l1, l2.next);
            if (l2.next != null)
               l2.next.prev = l2;
            l2.prev = null;
            return l2;
        }
        
    }
    static Node sortDoubly(Node head) {
       if(head == null || head.next == null){
           return head;
       }
       
       Node mid = getMid(head);
       
       Node l1 = sortDoubly(head);
       Node l2 = sortDoubly(mid);
       
       return merge(l1,l2);
    }
}