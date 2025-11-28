package org.example.nielsenround;
class XYZ
{
    static int x;
    static
    {
        System.out.println("X");
        x = 50;
    }
}

public class TestBlock
{
    static
    {
        System.out.println("Y");
    }

    public static void main(String[] args)
    {
        System.out.println("Z");
        System.out.println(XYZ.x);
    }

}
