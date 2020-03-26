public class licensekey{

    public String solution(String S, int K) {
        StringBuilder x = new StringBuilder();
        for(int i =S.length()-1; i>=0; i--){
            if (S.charAt(i) != '-'){
                x.append(x.length()%(K)==0 ? "-" : "").append(S.charAt(i));
            }
        }
        return x.reverse().toString().toUpperCase();
    }

    public static void main(String[] args){

    }
}