class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*for(int i=0; i<nums.length-1; i++){
            for(int j=1+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    return true;
                } 
        }
        return false;
        */
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}