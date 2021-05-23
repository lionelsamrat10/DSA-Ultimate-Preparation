class Solution {
    public int search(int[] nums, int target) {
        return bin_search(nums, 0, nums.length - 1, target);
    }
    
    public int bin_search(int[] nums, int low, int high, int target){
        if(low <= high){
            int mid = low + (high - low) / 2;
            //If key is present at mid return it
            if(nums[mid] == target) return mid;
            //If left subarray of the mid is sorted
            if(nums[low] <= nums[mid]){
                //check whether the key liew in this subarray or not
                if(target >= nums[low] && target <= nums[mid]){
                    return bin_search(nums, low, mid - 1, target);
                }
                return bin_search(nums, mid + 1, high, target);
            }
            //If right subarray of the mid is sorted
            if(target >= nums[mid] && target <= nums[high]){
                return bin_search(nums, mid + 1, high, target);
            }
            return bin_search(nums, low, mid - 1, target);
        }
        return -1;
    }
}
