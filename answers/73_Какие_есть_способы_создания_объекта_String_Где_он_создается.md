В Java объекты типа String можно создать несколькими способами:

Через литералы строк, которые заключаются в двойные кавычки: "Hello, World!". Через оператор new и вызов конструктора:
new String("Hello, World!"). Через вызов метода valueOf статического класса String: String str = String.valueOf(42); При
создании объекта String он помещается в специальную область памяти, называемую пулом строк (string pool). Если строка
уже существует в пуле, то возвращается ссылка на существующий объект, а не создается новый. Это называется механизмом
интернирования строк (string interning).