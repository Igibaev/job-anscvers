package test;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        String str = "Hello, world!";
        byte[] bytes = str.getBytes();
        BigInteger sign = new BigInteger(bytes);
        System.out.println(sign);
    }

    static String test = "test";

    public static void test() {
        System.out.println("test");
    }
}
