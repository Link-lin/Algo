public class CountPrime{

    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }
        
        //create a boolean array to store non-prime int     
        //default is false
        boolean[] isNotPrime = new boolean[n];
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isNotPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    isNotPrime[i*j] = true;
                }
            }
        }
    
        return count;
    }

    public static void main(String[] args){

    }
}