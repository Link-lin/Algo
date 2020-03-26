public class RotateMatrix {


    // 2ms solution. Actually 1 ms
    public static void rotate(int[][] matrix) {
        int size = matrix.length;
        int[] temp = new int[size];
        int x = 0;
        int bound = (size % 2 == 0) ? size / 2 : size / 2 + 1;
        // Possible reason is that the space spatial locality
        while (x != bound) {
            for (int i = x; i < matrix.length - x - 1; i++) {
                temp[i] = matrix[i][x];
                matrix[i][x] = matrix[size - 1 - x][i];
                //print(matrix);
                matrix[size - 1 - x][i] = matrix[size - 1 - i][size - 1 - x];
                //print(matrix);
                matrix[size - 1 - i][size - 1 - x] = matrix[x][size - 1 - i];
                //print(matrix);
                matrix[x][size - 1 - i] = temp[i];
                //print(matrix);
            }
            x++;
        }
    }

    // Better spacial localtiy, smae result.. No difference with solution beat 100%
    public static void rotate2(int[][] matrix){
        int size = matrix.length;
        int[] temp = new int[size];
        int x = 0;

        int bound = (size % 2 == 0) ? size / 2 : size / 2 + 1;
        // Possible reason is that the space spatial locality
        while (x != bound) {
            for (int i = x; i < matrix.length - x - 1; i++) {
                temp[i] = matrix[i][x];
            }

            for (int i = x; i < matrix.length - x - 1; i++) {
                matrix[i][x] = matrix[size - 1 - x][i];
            }

            for (int i = x; i < matrix.length - x - 1; i++) {
                matrix[size - 1 - x][i] = matrix[size - 1 - i][size - 1 - x];
            }

            for (int i = x; i < matrix.length - x - 1; i++) {
                matrix[size - 1 - i][size - 1 - x] = matrix[x][size - 1 - i];
            }

            for (int i = x; i < matrix.length - x - 1; i++) {
                matrix[x][size - 1 - i] = temp[i];
            }
            x++;
        }
    }


    public static void print(int[][] s) {
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] s = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        print(s);
        rotate(s);
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[i][j] + ",");
            }
            System.out.println();
        }

    }
}