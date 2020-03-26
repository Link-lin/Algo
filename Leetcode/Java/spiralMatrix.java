import java.util.*;

public class spiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> re = new ArrayList<>();
        if (matrix.length == 0)
            return re;
        int left = 0, top = 0;
        int right = matrix[0].length - 1, down = matrix.length - 1;
        while (left <= right && top <= down) {
            for (int j = left; j <= right; j++) {
                re.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= down; i++) {
                re.add(matrix[i][right]);
            }
            right--;
            if (top <= down) {
                for (int j = right; j >= left; j--) {
                    re.add(matrix[down][j]);
                }
            }
            down--;
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    re.add(matrix[i][left]);
                }
            }
            left++;
        }
        return re;
    }

    public static void main(String[] args) {

    }
}