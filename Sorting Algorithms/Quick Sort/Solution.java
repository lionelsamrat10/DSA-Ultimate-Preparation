// Time Complexity -> O(nlogn)
class Solution {
    public int[] sortArray(int[] nums) {
        return quickSortArray(nums, 0, nums.length - 1);
    }
    public static int[] quickSortArray(int[] nums, int low, int high){
        //We will do it using Quick Sort
        if(low < high){
            int pIndex = partition(nums, low, high);
            quickSortArray(nums, low, pIndex-1);
            quickSortArray(nums, pIndex+1, high);
        }
        return nums;
    }
    // This function takes the last element of the array as pivot and places it in such a way that
    // all the elements in its left are lesser than that and all at the right are greater than that
    public static int partition(int[] nums, int low, int high){
        //Take the pivot as the last element of the array
        int pivot = nums[high];
        int i = low;
        
        for(int j=low; j<=high-1; j++){
            if(nums[j] <= pivot){
                swap(nums, i, j);
                //Increment i by one
                i++;
            }
        }
        swap(nums, i, high);
        //return the position of pivot, denoted by i
        return i;
    }
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
