class Solution {
    public void sortColors(int[] nums) {
        int count0 =0;
        int count1 =0;
        int count2 =0;
        int n = nums.length;
        for(int i=0; i<n;i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        int index =0;
        while(count0 -->0){
            nums[index++] =0;
        }
        while(count1-- > 0){
            nums[index++] = 1;
        }
        while(count2-- > 0){
            nums[index++] = 2;
        }
        
    }
}