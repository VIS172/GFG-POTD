
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        
        
          Stack<Integer> stack1 = new Stack<Integer>();
        int n = s.size()-1;
        
        while(s.size()>0){
            stack1.push(s.get(n));
            s.pop();
            n--;
        }
        
        s.addAll(stack1);
        
    }
}