1. Первое, что приходит в голову, это методы класса Collections, хранящий в себе множество вспомогательных методов для коллекций:

```java
public static List<String> processTheList(List<String> nameList) {
for (int i = 0; i < nameList.size(); i++) {
nameList.set(i, nameList.get(i).substring(1));
}
Collections.sort(nameList);
return nameList;
}
```

2. Также если мы используем Java версии 8 и выше мы просто обязаны показать решение через стримы:

```java
public static List<String> processTheList(List<String> nameList) {
return nameList.stream()
.map(x -> x.substring(1))
.sorted().collect(Collectors.toList());
}

```
Независимо от выбранного решения, проверка может быть следующая:

```java 
List<String> nameList = new ArrayList();
nameList.add("John");
nameList.add("Bob");
nameList.add("Anna");
nameList.add("Dmitriy");
nameList.add("Peter");
nameList.add("David");
nameList.add("Igor");

System.out.println(processTheList(nameList));
```

Вывод в консоли:

`[avid, eter, gor, mitriy, nna, ob, ohn]`