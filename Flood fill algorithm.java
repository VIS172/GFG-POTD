class Solution{
    public void Floodfill(int[][] image, int sr, int sc, int newcolor,boolean vis[][],int orgcolor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcolor || image[sr][sc] == newcolor){
            return;
        }
        image[sr][sc] = newcolor;
        Floodfill(image,sr-1,sc,newcolor,vis,orgcolor);
        Floodfill(image,sr,sc-1,newcolor,vis,orgcolor);
        Floodfill(image,sr,sc+1,newcolor,vis,orgcolor);
        Floodfill(image,sr+1,sc,newcolor,vis,orgcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor){
        boolean vis[][] = new boolean[image.length][image[0].length];
        Floodfill(image,sr,sc,newcolor,vis,image[sr][sc]);
        return image;
    }
}