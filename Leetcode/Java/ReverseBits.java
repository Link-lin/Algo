public class ReverseBits {

    public int reverseBits(int n) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res |= ((n >> i) & 1) << (31-i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}