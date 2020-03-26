import java.util.*;

public class grayCode {

    public List<Integer> grayCode1(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1 << n; i++)
            result.add(i ^ i >> 1);
        return result;
    }

    public static void main(String[] args) {

    }
}