Коллизия в хеш-таблицах возникает, когда два разных объекта имеют одинаковый хеш-код. Такая ситуация может возникнуть
из-за ограниченного диапазона возможных значений хеш-кодов.

В Java для решения этой проблемы применяется метод цепочек (chaining). При использовании этого метода в каждую ячейку
хеш-таблицы добавляется связный список. Если возникает коллизия, объекты, имеющие одинаковый хеш-код, помещаются в одну
и ту же ячейку и добавляются в связный список.

Когда выполняется поиск элемента, хеш-таблица сначала вычисляет хеш-код и находит соответствующую ячейку. Затем
производится поиск в связном списке в этой ячейке.

Также можно использовать открытую адресацию (open addressing) для разрешения коллизий, когда при возникновении коллизии
новый элемент помещается в следующую свободную ячейку хеш-таблицы.

Чтобы избежать коллизий, важно, чтобы метод hashCode() объекта возвращал уникальный хеш-код для каждого уникального
объекта. Хорошая реализация метода hashCode() должна стремиться распределять объекты как можно более равномерно по всей
хеш-таблице. Если объекты распределены неравномерно, это может привести к тому, что некоторые ячейки хеш-таблицы будут
перегружены, а другие - пустыми. Это может привести к ухудшению производительности при поиске элементов.