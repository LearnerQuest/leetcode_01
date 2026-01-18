class Solution {
    public int largestMagicSquare(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int max = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int side=1;side+i<=n && side+j<=m;side++){
                    Set<Integer> set = new HashSet<>();
                    for(int x=j;x<j+side;x++) {
                        int r = 0, c = 0;
                        for(int y=i;y<i+side;y++) c+=a[y][x];
                        set.add(c);
                    }
                    for(int y=i;y<i+side;y++) {
                        int r = 0, c = 0;
                        for(int x=j;x<j+side;x++) r+=a[y][x];
                        set.add(r);
                    }
                    int pd = 0;
                    for(int x=0;x<side;x++){
                        pd += a[i+x][j+x];
                    }

                    int sd = 0;
                    for(int x=0;x<side;x++){
                        sd += a[i+x][j+side-1-x];
                    }
                    set.add(pd);
                    set.add(sd);
                    if(set.size() == 1) max = Math.max(max,side);
                }
            }
        }
        return max;
    }
}