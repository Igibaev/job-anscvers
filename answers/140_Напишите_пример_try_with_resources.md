Оператор try-with-resources позволяет создавать ресурсы внутри блока try и автоматически закрывать их после выполнения
блока, даже в случае исключения.

Вот пример использования try-with-resources для работы с файлом:

java Copy code

```java
try(BufferedReader reader=new BufferedReader(new FileReader("file.txt"))){
        String line=reader.readLine();
        while(line!=null){
        System.out.println(line);
        line=reader.readLine();
        }
        }catch(IOException e){
        e.printStackTrace();
        }
```

В этом примере мы создаем экземпляр класса BufferedReader, который используется для чтения из файла "file.txt". Этот
экземпляр создается в скобках после оператора try. После выполнения блока try экземпляр BufferedReader будет закрыт
автоматически, несмотря на то, что блок catch не обрабатывает исключения ввода-вывода.