Статические поля и статический блок родительского класса (в порядке объявления).
Статические поля и статический блок дочернего класса (в порядке объявления).
Нестатические поля родительского класса (в порядке объявления).
Нестатический блок родительского класса (если есть).
Конструктор родительского класса (если есть).
Нестатические поля дочернего класса (в порядке объявления).
Нестатический блок дочернего класса (если есть).
Конструктор дочернего класса.
```java
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

// Output:
// Static initializer of Parent
// Static initializer of Child
// Instance initializer of Parent
// Constructor of Parent
// Instance initializer of Child
// Constructor of Child

```