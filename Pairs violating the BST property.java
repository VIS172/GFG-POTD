class Solution {
    public static int pairsViolatingBST(int n, Node root) {
        
        int[] arr = new int[n];
        inOrderTraversal(arr, 0, root);
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] >= arr[j]) count++;
            }
        }
        return count;
    }
    static int inOrderTraversal(int[] arr, int i, Node root) {
        if (root == null) return i;
        i = inOrderTraversal(arr, i, root.left);
        arr[i++] = root.data;
        return inOrderTraversal(arr, i, root.right);
    }
}