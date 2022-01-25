import java.util.Arrays;
public class CombinationSumIV_377 {
    public int combinationSum4(int[] nums, int target) {
        int [] dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;

        return combinationSum(nums, target, dp);
    }

    private int combinationSum(int[] nums, int target, int [] dp) {
        if(target < 0 || dp[target] == 0) {
            return 0;
        }else if(target == 0 || dp[target] > 0) {
            return dp[target];
        }else {
            int count = 0;
            for(int num : nums) {
                count += combinationSum(nums, target-num, dp);
            }

            dp[target] = count;
            return dp[target];
        }
    }
}
