class Solution{
    Node cloneGraph(Node node){
        HashMap<Integer, Node> hm = new HashMap();
        HashSet<Integer> visited = new HashSet();
        Queue<Node> q = new LinkedList();
        
        //Initial Adding
        q.add(node);
        hm.put(node.val, new Node(node.val, new ArrayList()));
        
        while(!q.isEmpty()){
            // put node in visited
            Node cur = q.remove();
            visited.add(cur.val);
            ArrayList<Node> neighbours = hm.get(cur.val).neighbors ;
            
            // traverse the entire arraylist
            for(Node n : cur.neighbors){
                if( !visited.contains(n.val)){
                    q.add(n);
                    hm.put(n.val,  new Node(n.val, new ArrayList()));   
                }
                neighbours.add(hm.get(n.val));
            }
        }
        return hm.get(node.val);
    }
}