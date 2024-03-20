class Solution{
    
    public int sumOfLongRootToLeafPath(Node root)
    {
        if(root==null){
            return 0;
        }
        int[] arr={0,0};
        sumOfLongRootToLeafPathDriver(root, arr,0,0);
        
        return arr[1];
    }
    
    public void sumOfLongRootToLeafPathDriver(Node root, int[] arr, int size, int sum)
    {
        if(root==null){
            return;
        }
        sum+=root.data;
        size++;
        
        if(size==arr[0]){
            arr[1]=Math.max(arr[1], sum);
        }
        else if(size>arr[0]){
            arr[0]=size;
            arr[1]=sum;
        }
        
        sumOfLongRootToLeafPathDriver(root.left, arr,size,sum);
        sumOfLongRootToLeafPathDriver(root.right, arr,size,sum);
        
        
    }
}