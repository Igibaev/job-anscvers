Для сравнения строк в Java используются методы equals() и compareTo().

Метод equals() сравнивает две строки на идентичность, то есть на совпадение символов и их порядка. Например:

```java
String str1="Hello";
String str2="hello";
boolean isEqual=str1.equals(str2); // вернет false, так как символы разные

```

Метод compareTo() сравнивает две строки лексикографически, то есть посимвольно сравнивает две строки до тех пор, пока не
найдет первые отличающиеся символы. Например:

```java
String str1="apple";
String str2="banana";
int result=str1.compareTo(str2); // вернет отрицательное число, так как "apple" идет раньше "banana" по алфавиту

```

Для сортировки массива строк можно использовать метод Arrays.sort(), который сортирует строки в лексикографическом
порядке. Например:

```java
String[] strArra y= {"apple","banana","cherry"};
Arrays.sort(strArray);
```

// теперь strArray содержит {"apple", "banana", "cherry"} Для сортировки списка строк можно использовать метод
Collections.sort(). Например:

```java
List<String> strList = new ArrayList<>();
strList.add("apple");
strList.add("banana");
strList.add("cherry");
Collections.sort(strList);
```

// теперь strList содержит {"apple", "banana", "cherry"}