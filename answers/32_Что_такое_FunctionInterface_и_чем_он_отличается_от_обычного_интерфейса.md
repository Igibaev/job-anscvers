FunctionInterface - это функциональный интерфейс в Java, который содержит только один абстрактный метод. Он используется для работы с лямбда-выражениями и методами ссылок.

Основное отличие FunctionInterface от обычного интерфейса заключается в том, что он может быть аннотирован аннотацией @FunctionalInterface. Эта аннотация гарантирует, что интерфейс является функциональным и содержит только один абстрактный метод. Если интерфейс помечен аннотацией @FunctionalInterface, и в нем содержится более одного абстрактного метода, то компилятор выдаст ошибку.

Пример FunctionInterface:

java
Copy code
`@FunctionalInterface
public interface MyFunctionInterface {
int calculate(int a, int b);
}`
В этом примере MyFunctionInterface - функциональный интерфейс, содержащий один абстрактный метод calculate. Его можно использовать с лямбда-выражениями следующим образом:

css
Copy code
`MyFunctionInterface sum = (a, b) -> a + b;
System.out.println(sum.calculate(2, 3)); // выводит 5`
Таким образом, использование FunctionInterface позволяет работать с лямбда-выражениями в более удобной и элегантной форме.

https://metanit.com/java/tutorial/9.3.php