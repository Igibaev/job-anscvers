В Java существует два типа исключений: checked и unchecked.

Checked исключения проверяются компилятором во время компиляции и требуют обработки. Если исключение не обработано, то
код не скомпилируется.

Unchecked исключения не проверяются компилятором во время компиляции и могут возникнуть в любой момент выполнения
программы. Например, NullPointerException.

Ключевое слово throw используется для выброса исключения вручную в программе. Ключевое слово throws используется для
указания списка исключений, которые метод может генерировать.

Например, метод может иметь следующую сигнатуру:

csharp Copy code public void someMethod() throws SomeException { // ... } В этом случае, метод генерирует исключение
типа SomeException, и этот факт указан в сигнатуре метода с помощью ключевого слова throws.

Обработка исключений в Java осуществляется с помощью блоков try-catch. Если возникает исключение в блоке try, управление
передается в блок catch, где можно обработать исключение.

Например:

```java
try{ // выполнение кода, который может вызвать исключение 
}
catch(SomeException e){ // обработка исключения
}
```