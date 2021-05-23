//O(logn) Solution
class Solution {
    public int mySqrt(int x) {
        long low = 1, high = x;
        long mid, answer = 0;
        // Base Cases
        if (x == 0 || x == 1){
            return x;
        }
        
        while(low <= high){
            mid = low + (high - low) / 2;
            // If x is a perfect square
            if(mid * mid == x){
                return (int)mid;
            }
            // incrementing start if integral
            // part lies on right side of the mid
            if(mid * mid < x){
                low = mid + 1;
                answer = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)answer;
    }
}
