class ReverseInteger{
    public static int reverse(int x) {
        String y = String.valueOf(x);
        Boolean neg = false;
        String reverse = "";
        if( y.charAt(0) == '-') {
            neg = true;
        }
        if(neg){
            for(int i = y.length()-1; i>0 ; i--){
                if(i == y.length()-1 && y.charAt(y.length()-1) == '0') continue;
                reverse = reverse+ y.charAt(i);
            }
        }
        else {
            for (int i = y.length() - 1; i >= 0; i--) {
                if (i == y.length() - 1 && y.charAt(y.length() - 1) == '0') continue;
                reverse = reverse + y.charAt(i);
            }
        }

        try{
            x = Integer.parseInt(reverse);
            if(neg) x = -x;
        }catch(Exception e){
            return 0;
        }
        System.out.print(x);
        return x;
    }

    public static void main (String[] args){
        reverse(123);
    }

}