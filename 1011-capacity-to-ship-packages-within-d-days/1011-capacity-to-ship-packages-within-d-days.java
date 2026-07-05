class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int w : weights) {
            left = Math.max(left, w); // max weight
            right += w;               // total weight
        }

        int ans = right;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(canShip(weights, days, mid)) {
                ans = mid;
                right = mid - 1; // try smaller capacity
            } else {
                left = mid + 1;  // need bigger capacity
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int usedDays = 1;
        int currentLoad = 0;

        for(int w : weights) {
            if(currentLoad + w > capacity) {
                usedDays++;
                currentLoad = 0;
            }

            currentLoad += w;
        }

        return usedDays <= days;
    }
}