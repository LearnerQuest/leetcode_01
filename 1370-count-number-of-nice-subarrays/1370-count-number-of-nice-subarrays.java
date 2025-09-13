
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countLessThanEqualToK(nums, k) - countLessThanEqualToK(nums, k - 1);
    }

    public int countLessThanEqualToK(int[] nums, int k) {
        int i = 0; // Left pointer of the sliding window
        int count = 0; // Count of valid subarrays
        int oddCount = 0; // Number of odd elements in the current window
        
        for (int j = 0; j < nums.length; j++) { // Right pointer of the sliding window
            if (nums[j] % 2 == 1) // Check if the current element is odd
                oddCount++; // Increment the odd count
            
            // While the number of odd elements exceeds 'k', move the left pointer to the right
            while (oddCount > k) {
                if (nums[i] % 2 == 1) // Check if the element at the left pointer is odd
                    oddCount--; // Decrement the odd count
                i++; // Move the left pointer to the right
            } 
            
            count += j - i + 1; // Add the number of valid subarrays ending at 'j'
        }
        
        return count; // Return the total count of subarrays with at most 'k' odd numbers
    }
}