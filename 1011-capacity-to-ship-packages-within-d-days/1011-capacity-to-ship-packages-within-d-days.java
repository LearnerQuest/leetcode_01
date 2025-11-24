class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        //“What is the minimum ship capacity so that all packages can be shipped in days days?”

        for (int w : weights) {
            low = Math.max(low, w);   
            high += w;                
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid))
                high = mid;      
            else
                low = mid + 1;   
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                dayCount++;       
                currentLoad = 0;
            }
            currentLoad += w;

            if (dayCount > days)
                return false;    
        }

        return true;             
    }
}
