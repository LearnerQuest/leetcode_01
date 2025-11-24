class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int decimal = 0;
        for (int i = 0; i < nums.length; i++) {
            decimal = (decimal * 2 + nums[i]) % 5;
            result.add(decimal == 0);
        }

        return result;
    }
}
