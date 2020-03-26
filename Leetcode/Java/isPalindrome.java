class isPalindrome{

    public static boolean isPalind(int x){
        if(x<0) {
        return false;
        }
        String a = Integer.toString(x);
        int length = a.length();
        for(int i =0; i < a.length(); ++i){
            if(a.charAt(i) == a.charAt(length-i-1)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPalind2(int x){
        int origin = x;
        int rev = 0;

        if(x < 0 ) return false;

        while(x !=0){
            int y = x%10;
            rev = rev*10+ y;
            x = x/10;
        }
        if(origin == rev) return true;
        return false;
    }

    public static void main(String[] args){
        Boolean a = isPalind2(101);
        System.out.print(a);
    }
}