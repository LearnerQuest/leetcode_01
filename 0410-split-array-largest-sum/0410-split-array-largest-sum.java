class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);   // min possible max sum
            right += num;                 // max possible max sum
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                result = mid;
                right = mid - 1;   // try smaller max sum
            } else {
                left = mid + 1;    // need bigger max sum
            }
        }

        return result;
    }
    private boolean canSplit(int[] nums, int k, int mid) {
        int count = 1;
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > mid) {
                count++;
                currSum = num;
                if (count > k) return false;
            } else {
                currSum += num;
            }
        }

        return true;
    }
}