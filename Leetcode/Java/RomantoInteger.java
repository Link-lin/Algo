class RomantoInteger{

    public static int getValue(char c){
        int value = 0;

        switch(c){
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value =50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value =500;
                break;
            case 'M':
                value =1000;
                break;
        }
        return value;
    }

    public static int romanToInt(String s){
        int length = s.length();
        int total = 0;

        for(int i =0; i< length; ++i){
            char x = s.charAt(i);
            int value1 = getValue(x);
            if(i +1 < length){
                char y = s.charAt(i+1);
                int value2 = getValue(y);
                if (value2 >value1){
                    total += value2-value1;
                    i++;
                    continue;
                }
            }
            total += value1; 
        }
        return total;

    }

    public static void main(String[] args){
        int out = romanToInt("MCMXCIV");

        System.out.print(out);
    }
}