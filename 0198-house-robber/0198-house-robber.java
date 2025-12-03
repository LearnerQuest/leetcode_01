class Solution {
    public int rob(int[] nums) {
        int prev = 0, prev2 = 0;

        for (int num : nums) {
            int pick = num + prev2;
            int notPick = prev;
            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}
