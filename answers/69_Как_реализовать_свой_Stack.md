Stack - это структура данных, которая работает по принципу "последним пришел - первым ушел" (LIFO). Реализация своего собственного Stack может быть достаточно простой. Вот несколько способов реализации:

Использование массива
Один из простых способов реализации Stack - это использование массива для хранения элементов. Для этого нужно создать класс, содержащий массив элементов и переменную для отслеживания размера стека. Также нужно реализовать методы push(), pop() и peek() для добавления, удаления и получения верхнего элемента соответственно.

Пример реализации:

```java
public class MyStack<T> {
private T[] elements;
private int size;

    public MyStack(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public void push(T element) {
        if (size == elements.length) {
            throw new StackOverflowError();
        }
        elements[size++] = element;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T element = elements[--size];
        elements[size] = null;
        return element;
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
```
Использование связанного списка
Другой способ реализации Stack - это использование связанного списка. Для этого нужно создать класс, представляющий узел списка, который содержит ссылку на следующий элемент и значение текущего элемента. Также нужно создать класс, содержащий ссылку на вершину стека (голову списка) и переменную для отслеживания размера стека. Реализовать методы push(), pop() и peek() так же, как и в первом примере.

Пример реализации:

```java
public class Node<T> {
private T value;
private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class MyStack<T> {
private Node<T> top;
private int size;

    public void push(T element) {
        Node<T> node = new Node<>(element);
        node.setNext(top);
        top = node;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T element = top.getValue();
        top = top.getNext();
        size--;
        return element;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
```