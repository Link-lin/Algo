class IntegerToRoman{
    public static String check(int thous, int hund, int tens, int ones){
        StringBuilder rom = new StringBuilder();
        for(int i =0; i<thous; i++){
            rom.append("M");
        }
        // Append String for hund
        if(hund == 4){
            rom.append("CD");
        } 
        else if(hund == 9){
         rom.append("CM");
        }
        else if( hund <4){
            for(int i =0; i<hund; i++){
                rom.append("C");
            }
        }
        else if(hund == 5){
            rom.append("D");
        }
        else if(hund >5){
            rom.append("D");
            for(int i= 5; i <hund ;++i){
                rom.append("C");
            }
        }
        // Append String for tens
        if(tens == 4){
            rom.append("XL");
        } 
        else if(tens == 9){
         rom.append("XC");
        }
        else if( tens< 4){
            for(int i =0; i<tens; i++){
                rom.append("X");
            }
        }
        else if(tens >= 5){
            rom.append("L");
            for(int i= 5; i <tens ;++i){
                rom.append("X");
            }
        }
        // Append String for ones 
        if(ones == 4){
            rom.append("IV");
        } 
        else if(ones== 9){
         rom.append("IX");
        }
        else if( ones< 4){
            for(int i =0; i<ones; i++){
                rom.append("I");
            }
        }
        else if(ones >= 5){
            rom.append("V");
            for(int i= 5; i <ones ;++i){
                rom.append("I");
            }
        }

        // Turn String builder to String
        String re = rom.toString();
        return re;
    }

    public static String intToRoman(int num){

        int thous = num/1000;
        int hund = (num-thous*1000)/100;
        int tens = (num-thous*1000-hund*100)/10;
        int ones = (num-thous*1000-hund*100-tens*10);
        //System.out.print(t);
        String result = check(thous, hund, tens, ones);
        return result;
    }

    public static String intToRoman2(int num) {
        
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        return m[num/1000] + c[(num%1000)/100] + x[(num%100)/10] + i[num%10];
    }

    public static void main(String[] args){
        String n= intToRoman2(2944);
        System.out.print(n);
    }
    
}