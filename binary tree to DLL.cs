
class Solution
{ Node pre=null,head=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
      if(root==null) return null;
      bToDLL(root.left);
      if(pre==null) head=root;
      else{
          root.left=pre;
          pre.right=root;
      }
      pre=root;
      bToDLL(root.right);
      return head;
    }
}

