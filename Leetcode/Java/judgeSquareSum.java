

public class judgeSquareSum{

    public static boolean judgeSquareS(int c){
        int root = (int)(Math.sqrt(c)); 
        System.out.println(root);

        for(int i =0; i <= root; i++){
            int rest = c - i*i;
            System.out.println(rest);
            
            if(Math.sqrt(rest) %1 == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean judgeSquare2(int c){
        int root = (int) Math.sqrt(c);
        int i = 0;
        while(i <= root){
            if(i*i + root*root == c){
                return true;
            }
            else if(i > c){
                root --;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        boolean s = judgeSquareS(41);
        System.out.print(s);
    }

}