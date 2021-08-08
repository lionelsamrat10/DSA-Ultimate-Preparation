class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        // Take the table to store the values
        int dp[][] = new int[n+1][amount+1];
        // Fill in the Table
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=amount; j++) {
                // If amount is 0 then it is made up with 0 coins in dp[0][0]
                if(j == 0) dp[i][j] = 0;
                // If amount is greater than the available denominations then fill 1e5 or infinity
                else if(i == 0) dp[i][j] = 100000;
                // Exclusion: If coins is greater than the amount bring it from upside cell
                else if(coins[i-1] > j) dp[i][j] = dp[i-1][j];
                // Else take the min of dp[i-1][j] and 1 + dp[i][j - coins[i-1]]
                else dp[i][j] = Math.min(1 + dp[i][j - coins[i-1]], dp[i-1][j]);
            }
        }
        return dp[n][amount] > 10000 ? -1 : dp[n][amount];
    }
}
