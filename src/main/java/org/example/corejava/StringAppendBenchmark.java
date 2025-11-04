package org.example.corejava;
public class StringAppendBenchmark {
    public static void main(String[] args) {
        int n = 5_000_000;
        long t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("x");
        long tBuilder = System.nanoTime() - t1;

        t1 = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("x");
        long tBuffer = System.nanoTime() - t1;

        System.out.println("StringBuilder: " + tBuilder/1_000_000 + " ms len:"+sb.length());
        System.out.println("StringBuffer:  " + tBuffer/1_000_000 + " ms len:"+sbuf.length());
    }
}
