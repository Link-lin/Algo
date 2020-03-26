import java.util.*;

public class Google2{

    public static int solution(int[] S, int[] E) {
        // write your code in Java SE 8
        int i =0, j=0;
        Arrays.sort(S);
        Arrays.sort(E);
        int count = S.length;
        while(i != S.length-1 || j !=S.length-1){
            if(i == S.length-1 && (S[i]==E[j])){
                count--;
                break;
            }
            if(S[i] < E[j]){
                i++;
            }else if(E[j] < S[i]){
                j++;
            }else{
                i++;
                j++;
                count --;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] a ={1,2,6,5,3};
        int[] b = {5, 5, 7, 6, 8};
        solution(a, b);

    }
}