package org.example.corejava;

public class SumOfProductCodes {

    public static void main(String[] args) {
        String array[] = {"P1", "a2","o3","i2", "j3"};
        int sum = 0;
        for(int j=0;j<array.length;j++){
            String elem = array[j];
            String startLetter = elem.substring(0,1);
            if("AEIOU".toLowerCase().contains(startLetter.toLowerCase())){
                System.out.println(elem);
                String numStr = elem.substring(1);
                int num = Integer.parseInt(numStr);
                sum += num;
            }
        }
   System.out.println("total sum is:"+sum);
    }
}
