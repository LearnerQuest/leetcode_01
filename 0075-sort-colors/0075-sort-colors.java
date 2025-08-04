class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length; i++){
            int minPos =i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
                nums[minPos] = nums[i];
                nums[i]= temp; 
        }
    }
   // public int swap(int[] nums){
        //swap
                //int temp = nums[minPos];
                //nums[minPos] = nums[i];
               // nums[i]= temp; 
    //}
}