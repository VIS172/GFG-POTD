class GfG{
    public void push(int a,Stack<Integer> s)
    {
       s.push(a);
    }
    public int pop(Stack<Integer> s)
    {      if(s.isEmpty())return -1;
            return s.pop();
    }
    public int min(Stack<Integer> s)
    {     
          if(s.isEmpty())return Integer.MAX_VALUE;
          int num=s.pop();
          int ans= min(s);
          return Math.min(ans,num);
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
          return s.size()==n; 
    }
    public boolean isEmpty(Stack<Integer>s)
    {
           return s.isEmpty();
    }
}