import java.util.*;

public class majorityElementII229 {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> re = new ArrayList<>();
        int length = nums.length;
        if (length == 0)
            return re;

        int count1 = 0, count2 = 0;
        int n1 = 0, n2 = 0;

        for (int i = 0; i < length; i++) {
            int n3 = nums[i];

            if (count1 > 0 && count2 > 0) {

                if (n3 == n1) {
                    count1++;
                } else if (n3 == n2) {
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            } else if (count1 > 0) {

                if (n3 == n1) {
                    count1++;
                } else {
                    n2 = n3;

                    count2++;
                }
            } else if (count2 > 0) {
                if (n3 == n2) {
                    count2++;
                } else {
                    n1 = n3;
                    count1++;
                }
            } else {
                n1 = n3;
                count1++;
            }
        }

        count1 = count2 = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == n1) {
                count1++;
            } else if (nums[i] == n2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            re.add(n1);
        }
        if (count2 > nums.length / 3) {
            re.add(n2);
        }

        return re;
    }

    public static void main(String[] args) {

    }
}