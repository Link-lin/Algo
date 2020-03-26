public class exelsheet{

    public int titleToNumber(String s) {
        int length = s.length();
        int result = 0;

        for(int i =0; i< length; i++){
            char c = s.charAt(i);
            result += (c-64)*Math.pow(26, length-i-1);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        exelsheet x = new exelsheet();
        x.titleToNumber("ZY");
    }
}