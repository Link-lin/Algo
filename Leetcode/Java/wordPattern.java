public class wordPattern{

    public boolean wordPattern1(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        //Map<String,Integer> index = new HashMap<>();
        for (Integer i=0; i<words.length; ++i){}
            //if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
             //   return false;
        return true;
    }
    public static void main(String[] args){

    }
}