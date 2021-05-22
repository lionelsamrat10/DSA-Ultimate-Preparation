class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size * (size + 1) / 2;
        //Find the sum of elements in the given array
        int sumOfElements = 0;
        for(int i: nums){
            sumOfElements += i;
        }
        return sum - sumOfElements;
    }
}
//T(n) = O(n)
