import java.util.*;

public class Google1{

    public int distance(int x, int y){
        return (int)Math.sqrt((double)x*x+(double)y*y);
    }

    public int solution(int K, int[] X, int[] Y) {
        // write your code in Java SE 8
        int[] arr = new int[X.length];
        for(int i = 0; i < X.length; i++){
           arr[i] = distance(X[i], Y[i]);  
        }
        Arrays.sort(arr);
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] +",");
        }
        return arr[K];
    }
    
    public static void main(String[] args){

    }
}
