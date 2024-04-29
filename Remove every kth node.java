class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(head == null || head.next== null ||k==0 )
        return head;
        
        if(k==1)
            return null;
	    
	    int nodeIndex = 1;
	    Node p = head;
	    int counter = 1;
	    while(p!=null && p.next!=null){
	        if(counter == k-1){
	       
	            p.next = p.next.next;
	            counter = 1;
	     
	        }
	        else{
	            counter++;
	        }
	        p=p.next;
	        
	    }
	    return head;
	    
    }
}