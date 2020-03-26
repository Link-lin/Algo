public class getSum{

    public static int getSum1(int a, int b){
        return (a&b)==0 ? a^b : getSum1(((a&b) <<1), a^b);
    }
    public static void main(String[] args){
        System.out.print(getSum1(5,4));
    }
}