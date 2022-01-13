public class UniquePaths_62 {
    private int uniquePaths(int m, int n, int [][] grid) {
        if(m == 0 || n == 0) {
            return 0;
        }else if(grid[m-1][n-1] == 0) {
            grid[m-1][n-1] = uniquePaths(m-1, n, grid) +
                    uniquePaths(m, n-1, grid);
        }

        return grid[m-1][n-1];
    }

    public int uniquePaths(int m, int n) {
        if(m < 1 || n < 1) {
            throw new IllegalArgumentException("Input is invalid " + m + " " + n);
        }

        int [][] grid = new int[m][n];
        grid[0][0] = 1;

        return uniquePaths(m, n, grid);
    }
}
