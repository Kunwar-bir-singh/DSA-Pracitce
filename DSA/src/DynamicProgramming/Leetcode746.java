class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = cost[0];
        int curr = cost[1];
  
        if(n == 2 ) return Math.min(prev, curr);
  
        for(int i = 2; i < n; i++){
            int nextAns = cost[i] + Math.min(prev, curr);
            prev = curr;
            curr = nextAns;
        }
        return Math.min(curr, prev);
    }
}