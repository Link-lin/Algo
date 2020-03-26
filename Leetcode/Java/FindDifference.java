class FindDifference{
    public char FindTheDifference(String s, String t){
        char re = ' ';
        int[] arr = new int[26];
        for(int i =0; i < s.length(); i++){
            int index1 = s.charAt(i)-' ';
            int index2 = t.charAt(i)-' ';
            arr[index1]++;
            arr[index2]--;
        }

        for(int i=0; i< 26; i++){
            if(arr[i] !=0){
                re = (char) (i + ' ');
            }
        }
        return re;

    }
}