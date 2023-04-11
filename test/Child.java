package test;

import java.nio.charset.StandardCharsets;

public class Child extends Parent {
    static {
        System.out.println("Static initializer of Child");
        System.loadLibrary("ImageProcessor");
    }

    {
        System.out.println("Instance initializer of Child");
    }

    public Child() {
        super();
        System.out.println("Constructor of Child");
    }

    public static void main(String[] args) {
        System.out.println(pro("test".getBytes(StandardCharsets.UTF_8)));
    }

    public static native int pro(byte[] bytes);
}
