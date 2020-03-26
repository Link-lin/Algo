public class reverseword{

    public static String reverseWords(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }
       String[] arr = s.trim().split(" ");

       StringBuilder builder = new StringBuilder();
       for(int i = arr.length-1; i >=0; i--){
            if(arr[i].length() == 0) continue;
            else{
                builder.append(arr[i]+" ");
            }
       }
       return builder.toString().trim();
    }

    public static void main(String[] args){
        String s = "Sky is blue    today";
        System.out.print(reverseWords(s));
    }
}