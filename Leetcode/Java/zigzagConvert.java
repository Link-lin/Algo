public class zigzagConvert {

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder builder = new StringBuilder();
        char[] arr = s.toCharArray();
        int bigJump = (numRows-1)*2;
        for(int i =0; i < numRows; i++){
            
            if(i == 0 || i == numRows-1){
                for(int j =i; j < arr.length; j+=bigJump){
                    builder.append(arr[j]);
                }
            }
            else{
                int j = i;
                boolean flag = true;
                int insideRowLargeStep = 2 * (numRows - 1 - i);
                int insideRowSmallStep = bigJump- insideRowLargeStep;
                while (j < s.length()) {
                   builder.append(s.charAt(j));
                    if (flag)
                        j = j + insideRowLargeStep;
                    else
                        j = j + insideRowSmallStep;
                    flag = !flag;
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = convert("PAYPALISHIRING", 4);
        System.out.println(s);
    }
}