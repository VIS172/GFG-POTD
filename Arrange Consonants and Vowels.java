 
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Set<Character> st = Set.of('a','e','i','o','u');
        
        Node curr = head;
        Node vhead = null,vtail = null,chead = null,ctail = null;
        while(curr != null){
            if(st.contains(curr.data)){
                if(vhead == null){
                    vhead = curr;
                    vtail = curr;
                }
                else{
                    vtail.next = curr;
                    vtail = curr;
                }
            }
            else{
                if(chead == null){
                    chead = curr;
                    ctail = curr;
                }
                else{
                    ctail.next = curr;
                    ctail = curr;
                }
            }
            curr = curr.next;
        }
        if(vhead == null){
            head = chead;
            return head;
        }
        vtail.next = chead;
        head = vhead;
        if(ctail != null){
            ctail.next = null;
        }
        return head;
    }
}