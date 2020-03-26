class LongestPalidrome{

    String lng = "";

    public String longestPalindrome(String s) {

        int n = s.length();
        if(n == 0){
            return "";
        }

        boolean[][] sub = new boolean[n][n];
        int max = 1;
        // Base cases
        for(int i = 0; i < n ; i++){
            sub[i][i] = true;
        }

        int start = 0;
        for(int i =0; i < n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                sub[i][i+1] = true;
                max = 2;
                start = i;
            }
        }

        for(int len = 3; len <= n; len++){
            for(int i =0; i < n-len+1; i++){
                int j = i +len -1;
                if(sub[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                    sub[i][j] = true;
                    if(len > max){
                        max = len;
                        start = i;
                    }
                }
            }
        }


        return s.substring(start, start + max);
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args){

    }
}