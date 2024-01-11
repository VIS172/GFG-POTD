class Solution{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0,j=0,k=0;
        
        while(i<n1 && j<n2 && k<n3){
            
            if(A[i]==B[j]&&B[j]==C[k]){
                if(list.isEmpty()==false && list.get(list.size()-1)!=A[i])list.add(A[i]);
                else if(list.isEmpty()==true)list.add(A[i]);
                i++;
                j++;
                k++;
                continue;
            }
            
            int max=Math.max(A[i],B[j]);
            max=Math.max(max,C[k]);
            
            if(A[i]<max){
                i++;
            }
            else if(B[j]<max){
                j++;
            }
            else{
                k++;
            }
        }
        return list;
    }
}