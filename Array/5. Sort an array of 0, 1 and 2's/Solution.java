// The Dutch national Flag Problem
// Leetcode URL: https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        int count_0 = 0, count_1 = 0, count_2 = 0;
        
        //Store the counts of 0, 1 and 2
        for(int i=0; i<nums.length; i++){
            switch(nums[i]){
                case 0:
                    count_0++;
                    break;
                case 1:
                    count_1++;
                    break;
                case 2:
                    count_2++;
                    break;
            }
        }
        int itr = 0;
        
        // store the 0s in the starting of the array
        while(count_0 > 0){
            nums[itr++] = 0;
            count_0--;
        }
        // Then store the 1's
        while(count_1 > 0){
            nums[itr++] = 1;
            count_1--;
        }
        
        // Then store the 2's
        while(count_2 > 0){
            nums[itr++] = 2;
            count_2--;
        }
    }
}
