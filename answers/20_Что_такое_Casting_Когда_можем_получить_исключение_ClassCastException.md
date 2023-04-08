Casting в Java означает явное преобразование типов данных одного объекта в другой тип.

Исключение ClassCastException возникает в случае, когда происходит неправильное приведение типов данных во время
выполнения программы. Например, если попытаться привести объект одного класса к другому классу, который не является его
подклассом, то возникнет исключение ClassCastException.


```java
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = (Dog) animal; // Ошибка! ClassCastException
        dog.bark();
    }
}
```

В этом примере объект типа Animal не может быть приведен к типу Dog, потому что он не является объектом класса Dog или
его подклассом. При выполнении программы возникнет исключение ClassCastException.