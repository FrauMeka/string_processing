package org.example;

public class Main{
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        System.out.println((processor.isStrongPassword("Meka123!")));
        System.out.println(processor.calculateDigits("1 cat and 5 dogs"));
        System.out.println(processor.calculateWords("Hello cat"));
        System.out.println(processor.calculateExpression("3 +59*9"));
    }
}
