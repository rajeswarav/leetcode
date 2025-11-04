package org.example.edgev;

public class WordReverse {
    public static class ReverseWordsTest {

        public static void main(String[] args) {

            String name = "edgeverve is awesome";

            String reverse = reverseWords(name);
            System.out.println(reverse);


        }

        private static String reverseWords(String name) {
            String[]  words = name.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]+" ");
            }
            return sb.toString().trim();

        }
    }
}
