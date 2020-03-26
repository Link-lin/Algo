import java.util.*;

public class gussNum {

    // Random algorithem
    public int guessNum(int n){
        Random rand = new Random();
        int myguess = rand.nextInt(n);
        int upper = n;
        int low = 0;
        while(guess(myguess) != 0){
            if(guess(myguess) == -1){
                low = myguess;
                myguess = (int) (low + (Math.random() * (upper - low)) + 1);

            }
            else if(guess(myguess) == 1){
                upper = myguess;
                myguess =  (int) (low + (Math.random() * (upper - low)));
            }
        }
        return myguess;
    }

   public int guessNum1(int n){
        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return j;
   }

    // Iterative O(n)
    public int guessNum2(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (guess(i) == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public int guess(int i ){
        return 1;
    }

    public static void main(String[] args) {

    }
}