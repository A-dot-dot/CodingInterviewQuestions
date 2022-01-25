public class ClimbingStairs_70 {
  private int countWays(int n, int[] ways) {
        if(ways[n-1] == 0) {
            ways[n-1] = countWays(n-1, ways) +
                                countWays(n-2, ways);
        }
        
        return ways[n-1];
    }
    
    public int climbStairs(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("invalid input : " + n);
        } else if(n < 3) {
            return n;
        }
        
        
        int [] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        
        return countWays(n, ways);
    }
}
