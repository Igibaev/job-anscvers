Класс Object в Java содержит следующие методы:

public Object clone() throws CloneNotSupportedException: создает и возвращает копию объекта.
public boolean equals(Object obj): определяет, равен ли текущий объект указанному объекту.
protected void finalize() throws Throwable: вызывается перед удалением объекта из памяти сборщиком мусора.
public final Class<?> getClass(): возвращает объект Class, который представляет текущий объект.
public int hashCode(): возвращает хэш-код для текущего объекта.
public final void notify(): возобновляет выполнение потока, ожидающего объекта.
public final void notifyAll(): возобновляет выполнение всех потоков, ожидающих объекта.
public String toString(): возвращает строковое представление объекта.
public final void wait() throws InterruptedException: заставляет поток ожидать, пока другой поток не вызовет метод notify() или notifyAll() для этого объекта.
public final void wait(long timeoutMillis) throws InterruptedException: заставляет поток ожидать, пока другой поток не вызовет метод notify() или notifyAll() для этого объекта, или пока не истечет указанный период времени.
public final void wait(long timeoutMillis, int nanos) throws InterruptedException: заставляет поток ожидать, пока другой поток не вызовет метод notify() или notifyAll() для этого объекта, или пока не истечет указанный период времени и дополнительное время в наносекундах.
Эти методы наследуются всеми классами в Java. Кроме того, класс Object также содержит метод protected Object finalize() throws Throwable, который вызывается перед удалением объекта из памяти сборщиком мусора, но этот метод устарел и не рекомендуется к использованию.