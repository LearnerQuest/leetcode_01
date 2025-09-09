class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);   // find first occurrence
        int last = binarySearch(nums, target, false);   // find last occurrence
        return new int[] {first, last};
    }

    // Helper function: works for both first & last occurrence
    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;  
                if (findFirst) {
                    right = mid - 1;   // keep searching left
                } else {
                    left = mid + 1;    // keep searching right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
