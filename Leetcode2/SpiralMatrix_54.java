import java.util.*;

public class SpiralMatrix_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> re = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        if (n == 0)
            return re;

        int rowStart = 0, rowEnd = m - 1, colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                re.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                re.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colStart; j--) {
                    re.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colStart <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowStart; j--) {
                    re.add(matrix[j][colStart]);
                }
            }
            colStart++;
        }

        return re;
    }

    public static void main(String[] args) {

    }

}