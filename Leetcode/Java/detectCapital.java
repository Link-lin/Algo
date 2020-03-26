/**
 * detectCapital
 */
public class detectCapital {

    public static boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();

        if(arr ==null || arr.length ==0) return false;
        int count = 0;
        for(char c : arr){
            if( c > 64 && c < 91){
                count ++;
            } 
        }
        if(count ==0 || count == arr.length || (count ==1 && arr[0] >64 && arr[0]< 91)) return true;

        return false;
    }

    public static void main(String[] args) {
        String s = "GooGle";
        System.out.print(detectCapitalUse(s));
    }
}