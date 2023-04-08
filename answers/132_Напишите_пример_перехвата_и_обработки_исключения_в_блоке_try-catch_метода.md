Конечно! Вот пример обработки исключения деления на ноль:

```java
public class Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
    }
}
```

В этом примере переменная b равна нулю, что приводит к исключению ArithmeticException. В блоке try выполняется операция
деления, а в блоке catch перехватывается исключение и выводится сообщение "Деление на ноль!".