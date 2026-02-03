class Solution {
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        if (k == 0) return;

        int someMid = length - k;
        reverse(nums, 0, someMid - 1);
        reverse(nums, someMid, length - 1);
        reverse(nums, 0, length - 1);
    }
}