package com.Forloopconcept;
public class Main {
    public static void main(String[] args)
    {
        int a=10, b=20, c=25;
        {
        System.out.println(b-- + c++ + ++a + --b + a++ + ++a);
            System.out.println(++b + a-- - c++ + ++a + ++b);
                         //(20+25+11+18+11+13)=98
                        // (19+13-26+13+20)=39
    }
    }
}