class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        // Case 1: skip first house
        int max1 = solve(nums, 1, n - 1);

        // Case 2: skip last house
        int max2 = solve(nums, 0, n - 2);

        return Math.max(max1, max2);
    }

    private int solve(int[] nums, int start, int end) {
        int prev = 0, prev2 = 0;

        for (int i = start; i <= end; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev;
            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}
