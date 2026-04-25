class Solution {
    public int numIslands(char[][] grid) {
     int m=grid.length;
     int c=0;
     int n=grid[0].length;
     int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    c++;
                    grid[i][j]='0';
                    Queue<int[]>queue=new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[]curr=queue.poll();
                        for(int[] dir:directions){
                            int nr=dir[0]+curr[0];
                            int nc=dir[1]+curr[1];
                            if(nr>=0&&nc>=0&&nc<grid[0].length&&nr<grid.length&&grid[nr][nc]=='1'){
                                grid[nr][nc]='0';
                                queue.offer(new int[]{nr,nc});
                            }
                        }
                    }
                }
        }
     }   
     return c;
    }
}
