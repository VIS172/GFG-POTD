class Solution {

    public static int countPairs
    (LinkedList<Integer> head1, LinkedList<Integer> head2,int x) 
    {
        int count=0;
        int h1s=head1.size();
        int h2s=head2.size();
        HashMap<Integer,Integer> map=new  HashMap<>();
        if(h1s>h2s)
        {
            for(int i=0;i<h2s;i++)
            {
                map.put(head2.remove(),0);
            }
            for(int i=0;i<h1s;i++)
            {
                int y=x-head1.remove();
                if(map.containsKey(y))
                {
                    count++;
                }
            }
            
        }
        else
        {
            for(int i=0;i<h1s;i++)
            {
                map.put(head1.remove(),0);
            }
            for(int i=0;i<h2s;i++)
            {
                int y=x-head2.remove();
                if(map.containsKey(y))
                {
                    count++;
                }
            }
            
        }
        
        return count;
    }
}