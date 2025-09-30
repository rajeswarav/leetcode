package org.example;

public class StringToIntegerConversion {

    public static void main(String[] args) {

        System.out.println("myRes = " + myAtoi("-91283472332"));

        System.out.println("myRes = " + myAtoi(" "));
    }



    static int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        System.out.println("str = " + str);


        char signSymbol = '0';

        str = str.trim();
        if(str.length() == 0){
            return 0;
        }

        if(str.length() >= 1){
            signSymbol =  str.charAt(0);
        }

        boolean negative = false;
        int sign = 1;
        if(signSymbol == '-' && str.length()== 1){
            sign = -1;
            return 0;

        }else if(signSymbol == '-' && str.length()>1){
            sign = -1;
            str = str.substring(1);
        }
        else if(signSymbol == '+' && str.length()==1){
            return 0;
        }else if(signSymbol == '+' && str.length()>1){
            str = str.substring(1);
        }
        if(!(str.charAt(0) >= '0'  && str.charAt(0) <= '9')){
            return 0;
        }
        long res = 0;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int num = 0;

            if((str.charAt(i) >= '0'  && str.charAt(i) <= '9')) {
                num = chars[i] - '0';
            }else{
                break;
            }
            res = (res * 10) + num;

            // Step 4: clamp immediately if out of range
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return(int)(sign * res);

    }


}
