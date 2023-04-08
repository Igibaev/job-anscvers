Переопределение метода в объектно-ориентированном программировании - это создание новой реализации метода в подклассе, который уже определен в одном из его суперклассов. При переопределении метода в подклассе, он имеет ту же сигнатуру, что и метод в суперклассе, но может иметь различную реализацию, которая перекрывает реализацию в суперклассе.

Например, пусть есть суперкласс "Фигура" и подклассы "Круг" и "Квадрат". В классе "Фигура" может быть определен метод "вычислить площадь", который использует для вычисления площади различные свойства фигуры. Каждый подкласс может переопределить этот метод, чтобы вычислить площадь соответствующей фигуры.

Вот пример кода на Java, который демонстрирует переопределение метода:

```java
class Shape {
public void calculateArea() {
System.out.println("This is the calculateArea() method in Shape class");
}
}

class Circle extends Shape {
@Override
public void calculateArea() {
System.out.println("This is the calculateArea() method in Circle class");
}
}

class Square extends Shape {
@Override
public void calculateArea() {
System.out.println("This is the calculateArea() method in Square class");
}
}

public class Main {
public static void main(String[] args) {
Shape shape = new Shape();
shape.calculateArea(); // Output: This is the calculateArea() method in Shape class

      Circle circle = new Circle();
      circle.calculateArea(); // Output: This is the calculateArea() method in Circle class

      Square square = new Square();
      square.calculateArea(); // Output: This is the calculateArea() method in Square class
}
}
```
