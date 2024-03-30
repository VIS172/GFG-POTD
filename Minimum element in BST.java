class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        
        
        //in a BST leftmost node is the min element
        //we keep traversing to the left till null is hit and return the node
       return (root.left==null) ? root.data : minValue(root.left);
        
    }
}