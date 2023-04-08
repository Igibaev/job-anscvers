package test;

public class Parent extends Test{


    static {

        System.out.println("Static initializer of Parent");
    }

    {
        test = "sdfds";
        System.out.println("Instance initializer of Parent");
        System.out.println(test);
    }

    public Parent() {
        System.out.println("Constructor of Parent");
    }

}
