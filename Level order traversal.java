class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        if(root == null)return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null)q.add(temp.left);
            if(temp.right != null)q.add(temp.right);
            list.add(temp.data);
            q.remove();
        }
        return list;
    }
}