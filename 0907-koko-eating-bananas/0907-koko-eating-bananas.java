class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1; int high = getMax(piles); int ans = Integer.MAX_VALUE;
        while(low<= high){
            int mid = low+(high-low)/2;
            long totalhours = helper(piles, mid);
            if(totalhours <=h){
                ans = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        return ans;

    }
    public static long helper(int[] piles ,int k){
        long totalHours =0;
        int n = piles.length;
        for(int i=0; i<n; i++){
            totalHours += (piles[i] + k - 1) / k;
        }
        return totalHours;
    } 
    private int getMax(int[] piles){ 
        int max = piles[0];
        for(int pile : piles){
            max = Math.max(max, pile);
        }
        return max;
    }
}