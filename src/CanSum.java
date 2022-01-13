public class CanSum {
    public boolean canSum(int target, int[] nums) {
        return canSum(target, nums, new int[target+1]);
    }

    private boolean canSum(int target, int[] nums, int[] dp) {
        if(target < 0 || dp[target] == 2) {
            return false;
        }else if(target == 0 || dp[target] == 1) {
            return true;
        }

        for(int num : nums) {
            if(canSum(target-num, nums, dp)) {
                dp[target] = 1;
                return true;
            }
        }

        dp[target] = 2;
        return false;
    }
}
