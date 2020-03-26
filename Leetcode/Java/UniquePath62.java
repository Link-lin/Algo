public class UniquePath62 {

    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return uniquPathHelper(1, 1, m, n, 0);
    }

    public static int uniquPathHelper(int curM, int curN, int endM, int endN, int count) {
        System.out.println(curM + "" + curN);
        if (curM == endM && curN == endN) {
            count++;
            return count;
        }
        if (curN > endN || curM > endM) {
            return 0;
        }
        return uniquPathHelper(curM + 1, curN, endM, endN, count) + uniquPathHelper(curM, curN + 1, endM, endN, count);
    }

    /*
     * public static int uniquePaths(int m, int n){ if(m ==1 || n ==1) return 1; int
     * end = 10*m + n; return uniquPathHelper(11, end, 0); }
     * 
     * public static int uniquPathHelper(int currPos, int end, int count){
     * if(currPos == end){ count ++; return count; } if(currPos%10> end%10){ return
     * 0; }else if(currPos + 10 > end){ return uniquPathHelper(currPos+1, end,
     * count); } return uniquPathHelper(currPos+10, end, count) +
     * uniquPathHelper(currPos+1, end, count); }
     */

    
    // DP solution
    private static int s(int m, int n) {
        int r = n, c = m;
        int[][] dp = new int[r][c];
        for (int i = 0; i < r; i++)
            dp[i][0] = 1;
        for (int i = 0; i < c; i++)
            dp[0][i] = 1;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[r - 1][c - 1];
    }

    public static void main(String[] args) {
        System.out.print(uniquePaths(3, 2));
        s(2,3);
    }
}