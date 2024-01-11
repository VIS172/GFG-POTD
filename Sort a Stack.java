class GfG{
    
    public void  sortedInsert(Stack <Integer> st,int num ){
        //if stack is empty or 
        // stack is not empty
        //but num element is greater than stack top element  so push into stack 
        if(st.isEmpty()|| !st.empty() && st.peek()<num){
            st.push(num);
            return; 
        }
        
        int n = st.peek();
        st.pop();
        
        
        sortedInsert(st,num);
        st.push(n);
         
        }
 
      public Stack<Integer> sort(Stack<Integer> st)
    {
 
        if( st.size()>0){
            int x =st.pop();
            sort(st);
            
            sortedInsert(st, x);
        }
        return st;
}
 
}