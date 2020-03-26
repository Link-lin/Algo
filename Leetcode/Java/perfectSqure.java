/**
 * perfectSqure
 */
public class perfectSqure {

    public static boolean isPerfectSquare(int num){
        int s = (int) Math.floor(Math.sqrt(num) + 0.5);
        return s*s ==num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(225));
    }
}