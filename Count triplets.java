class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        //code here.
        List<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.data);
            head=head.next;
        }
        int count=0;
        for(int i=0;i<a.size();i++){
            int l=i+1,r=a.size()-1;
            while(l<r){
                int sum=a.get(i)+a.get(l)+a.get(r);
                if(sum==x){
                    count++;
                    l++;r--;
                }
                else if(sum<x) r--;
                else l++;
            }
        }
        return count;
    } 
}