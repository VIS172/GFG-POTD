class Tree{
    
    public static void helper(Node root,int level,TreeMap<Integer,Integer>map){
        if(root==null) return;
        map.put(level,map.getOrDefault(level,0)+root.data);
        helper(root.left,level+1,map);
        helper(root.right,level,map);
    }
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayList<Integer>list = new ArrayList<>();
        TreeMap<Integer,Integer>map = new TreeMap<>();
        helper(root,0,map);
        for(int i:map.values()){
            list.add(i);
        }
        return list;
    }
}