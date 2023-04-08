Nested class (вложенный класс) - это класс, который объявлен внутри другого класса. Он может быть объявлен как
статический или нестатический.

Статический вложенный класс является статическим членом внешнего класса, то есть он не имеет доступа к нестатическим
членам внешнего класса. Такой класс может использоваться, например, для создания вспомогательных классов, которые нужны
только внутри внешнего класса.

Нестатический вложенный класс (inner class) связан с экземпляром внешнего класса и имеет доступ к его членам, как к
своим собственным. Он может быть использован для реализации каких-либо интерфейсов, создания обратных вызовов (callback)
, реализации слушателей событий и т.д.

Пример статического вложенного класса:

```java
public class OuterClass {
    private static int x = 10;

    static class StaticNestedClass {
        public void printX() {
            System.out.println("x = " + x);
        }
    }
}
```

Пример нестатического вложенного класса:

```java
public class OuterClass {
    private int x = 10;

    public class InnerClass {
        public void printX() {
            System.out.println("x = " + x);
        }
    }
}
```

В обоих случаях вложенный класс может быть создан и использован внутри внешнего класса следующим образом:

```java
OuterClass.StaticNestedClass nestedObject=new OuterClass.StaticNestedClass();
        nestedObject.printX();
```

```java
OuterClass outerObject=new OuterClass();
        OuterClass.InnerClass innerObject=outerObject.new InnerClass();
        innerObject.printX();
```