public class integerReplacement {

    public int integerReplacement1(int n) {
        if(n == 2147483647) return 32;
        int count =0;
        while(n !=1){
            if(n %2 == 0){
                n /= 2;
                count += 1;
            }
            else{
                if(n-1 == 2){
                    count +=2;
                    break;
                }
                else if((n+1)/2%2 == 0){
                    n = (n +1)/2;
                    count +=2;
                }
                else if((n-1)/2%2 == 0){
                    n = (n -1)/2;
                    count +=2;
                }
            }
        }    
        return count;
    }
    public static void main(String[] args) {

    }
}