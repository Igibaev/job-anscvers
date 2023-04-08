public class Parent {
    static {
        System.out.println("Static initializer of Parent");
    }

    {
        System.out.println("Instance initializer of Parent");
    }

    public Parent() {
        System.out.println("Constructor of Parent");
    }
}
