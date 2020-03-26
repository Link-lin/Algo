public class sortArrByParity{

    public static int[] sortArrByParityII(int A[]){
        int[] res = new int[A.length];
        int odd = 1, even =0;

        for(int i = 0; i< A.length; i++){
            if(A[i] % 2 == 0){
                res[even] = A[i];
                even+=2;
            }
            else{
                res[odd] = A[i];
                odd+=2;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int [] s ={4,2,5,7};
        int [] res = sortArrByParityII(s);
        for(int i =0; i < res.length; i++){
            System.out.print(res[i]);
        }
    }
}