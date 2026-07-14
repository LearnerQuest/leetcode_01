class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int res =nums[0];
        for(int i=0; i<nums.length; i++){
             if (leftProduct == 0) {
                leftProduct = 1;
            }
            if (rightProduct == 0) {
                rightProduct = 1;
            }
            leftProduct *= nums[i];
            rightProduct *= nums[nums.length - 1 - i];
            res = Math.max(res, Math.max(leftProduct, rightProduct));
        }
        return res;
    }
}