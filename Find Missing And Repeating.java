class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
   
        ArrayList<Integer> a = new ArrayList(n+1);
        for(int x=0;x<n+1;x++)
        {
            a.add(x,0);
        }
        for(int x=0;x<n;x++)
        {
           a.set(arr[x],a.get(arr[x])+1) ;
        }
        int missing=0,repeated=0;
        for(int x=1;x<n+1;x++)
        {
            if(a.get(x)==0)
                missing=x;
            if(a.get(x)==2)
                repeated=x;
            
        }
        
        int ar[] = {repeated , missing};
        return ar;
    }
}    