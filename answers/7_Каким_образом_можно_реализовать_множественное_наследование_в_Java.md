В Java множественное наследование классов запрещено, но можно использовать множественное наследование интерфейсов.
Интерфейсы в Java могут содержать только абстрактные методы и константы, поэтому один класс может реализовывать
несколько интерфейсов и получить таким образом функциональность от каждого из них.

Вот пример использования множественного наследования интерфейсов в Java:

```java
interface InterfaceA {
    public void methodA();
}

interface InterfaceB {
    public void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A called");
    }

    public void methodB() {
        System.out.println("Method B called");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
```

Здесь класс MyClass реализует интерфейсы InterfaceA и InterfaceB, что позволяет ему иметь доступ к методам из обоих
интерфейсов.