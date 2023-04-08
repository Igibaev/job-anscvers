Использование enum типов в TreeSet и TreeMap допустимо.

И мы можем написать:

```java
TreeSet<Role> treeSet = new TreeSet<>();
treeSet.add(Role.SECURITY_GUARD);
treeSet.add(Role.DIRECTOR);
treeSet.add(Role.TEACHER);
treeSet.add(Role.STUDENT);
treeSet.forEach(System.out::println);
```

И в консоли будет выведено:

``STUDENT
TEACHER
DIRECTOR
SECURITY_GUARD``

Мы получили вывод не по алфавиту. Дело в том, что если мы используем элементы enum-а для значений TreeSet или как ключи для TreeMap, элементы сортируются по их естественному порядку (по порядку, в котором они и заданы в enum).

Понимание этих особенностей помогает нам писать код качественнее.