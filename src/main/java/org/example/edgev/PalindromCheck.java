package org.example.edgev;

import java.util.HashMap;
import java.util.Map;

public class PalindromCheck {

    public static void main(String[] args) {
        String palindrom="madamm";

        boolean result = isPalindrom(palindrom);
        System.out.println(palindrom+" is palindrom "+result);
    }
    public static boolean isPalindrom(String palindrom) {
        for(int i=0;i<palindrom.length()/2;i++){
            if(palindrom.charAt(i)!=palindrom.charAt(palindrom.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
