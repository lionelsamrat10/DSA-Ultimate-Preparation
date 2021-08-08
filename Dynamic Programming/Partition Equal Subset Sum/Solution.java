class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        // Calculate the sum
        for(int i=0; i<n; i++) sum += nums[i];
        // If sum is odd return false
        if(sum % 2 != 0) return false;
        // if sum is even then we only need to find solution for sum/2, cause if sum/2
		// solution is present then it is likely that another sum/2 solution is also available in the array
        
        // Create the table
        boolean dp[][] = new boolean[n + 1][sum / 2 + 1];
        // Fill in the table
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=sum/2; j++) {
                if(i == 0) dp[i][j] = false; // Like dp[0][1...n] = false
                else if(j == 0) dp[i][j] = true; // Like dp[1...n][0] = false
                else if(nums[i-1] <= j) dp[i][j] = dp[i-1][j - nums[i-1]] || dp[i-1][j]; 
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum / 2];
    }
}
