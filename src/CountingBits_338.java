public class CountingBits_338 {
    public int[] countBits(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int [] memo = new int [n+1];

        for(int i=1; i<=n; i++) {
            memo[i] = memo[i>>1] + (i&1);
        }

        return memo;
    }
}
