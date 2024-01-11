class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[]){
        Queue<Integer> q=new ArrayDeque<>();
        int l=petrol.length;
        int n=0,d=0,i=0;
        while(i<l){
            int a=petrol[i];
            int b=distance[i];
            int diff=a-b;
            d+=diff;
            if(d<0){
                if(i==l-1){
                    return -1;
                }
                n=i+1;
                d=0;
            }
            q.offer(b);
            i++;
        }
        int temp=0;
        while(temp<n){
            d+=petrol[temp]-q.poll();
            temp++;
            if(d<0){
                return -1;
            }
        }
        return n;
    }
}