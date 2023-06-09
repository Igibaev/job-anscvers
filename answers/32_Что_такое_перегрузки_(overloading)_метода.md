Перегрузка метода (method overloading) - это возможность определения методов в одном классе с одним именем, но разными параметрами. При вызове метода компилятор определяет, какой именно метод будет вызываться на основании типов переданных аргументов.

Например, можно определить несколько методов с именем "sum", каждый из которых будет принимать разное количество и тип аргументов:

```java
public int sum(int a, int b) {
return a + b;
}

public int sum(int a, int b, int c) {
return a + b + c;
}

public double sum(double a, double b) {
return a + b;
}
```

При вызове метода sum компилятор будет выбирать подходящий метод в зависимости от переданных аргументов:

```java
int result1 = sum(1, 2);         // вызов первого метода
int result2 = sum(1, 2, 3);      // вызов второго метода
double result3 = sum(1.5, 2.5);  // вызов третьего метода

```
Перегрузка методов позволяет использовать одно имя для нескольких методов с похожей функциональностью, что упрощает понимание и использование класса.