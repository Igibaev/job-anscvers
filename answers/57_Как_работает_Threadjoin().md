Метод Thread.join() используется для ожидания завершения потока, на котором он вызывается. Если вызвать этот метод на потоке A из потока B, то поток B будет ждать, пока поток A завершится.

Пример использования метода join():

```java
Thread threadA = new Thread(() -> {
// какой-то код для выполнения в потоке A
});

threadA.start(); // запускаем поток A

try {
threadA.join(); // ждем, пока поток A завершится
} catch (InterruptedException e) {
// обработка исключения
}
```

// продолжаем работу в потоке B
Как работает join()? Когда поток вызывает join(), он блокируется и ждет, пока поток, на котором вызван join(), завершится. Внутри метода join() используется метод wait(), который помещает текущий поток в ожидание, пока не будет вызван метод notify(). Когда поток, на котором вызван join(), завершится, он вызывает метод notify() и все потоки, ожидающие его завершения, будут разблокированы и продолжат выполнение.

Важно отметить, что вызов метода join() может привести к блокировке текущего потока на неопределенный период времени, если поток, на котором вызывается join(), не завершается. Поэтому желательно использовать join() с осторожностью и предусмотреть механизмы остановки потока, если он не завершается в течение определенного времени.