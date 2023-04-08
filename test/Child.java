package test;

public class Child extends Parent {
    static {
        System.out.println("Static initializer of Child");
    }

    {
        System.out.println("Instance initializer of Child");
    }

    public Child() {
        super();
        System.out.println("Constructor of Child");
    }
}
