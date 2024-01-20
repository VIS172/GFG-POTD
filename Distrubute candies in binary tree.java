class Solution
{
       static int moves;
    static int solve(Node root) 
    {
        if(root == null)
            return 0;

        int ln = solve(root.left);/*Recursively call the solution function on the left child         of the current node.This gives us the result (lr) for the left subtree.*/
        int rn = solve(root.right);/*Recursively call the solution function on the right              child of the current node. This gives us the result (rr)   for the right subtree.*/
        moves += Math.abs(ln) + Math.abs(rn);/*The absolute value ensures that we            consider only the magnitude,not the direction (positive or negative).*/
        return root.data - 1 + ln + rn;
    }

    public static int distributeCandy(Node root) 
    {
        moves = 0;
        solve(root);
        return moves;
    }
}