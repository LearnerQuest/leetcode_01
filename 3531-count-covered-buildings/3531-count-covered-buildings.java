class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        // int[][] grid = new int[n+][n+1];
        
        int[] fr = new int[n+1];
        int[] lr = new int[n+1];
        int[] fc = new int[n+1];
        int[] lc = new int[n+1];
        Arrays.fill(fr,-1);
        Arrays.fill(lr,-1);
        Arrays.fill(fc,-1);
        Arrays.fill(lc,-1);

        for(int[] a : buildings){
            int r = a[0];
            int c = a[1];
            fc[c] = (fc[c]==-1) ? r : Math.min(r,fc[c]);
            lc[c] = (lc[c]==-1) ? r : Math.max(r,lc[c]);
            fr[r] = (fr[r]==-1) ? c : Math.min(c,fr[r]);
            lr[r] = (lr[r]==-1) ? c : Math.max(c,lr[r]);
        }
        int count = 0 ;
        for(int[] a : buildings){
            int r = a[0];
            int c = a[1];
            if(fc[c]!=r && lc[c]!=r && fr[r]!=c && lr[r]!=c) count++;
        }
        return count;
    }
}