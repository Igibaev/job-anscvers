Современные фреймворки используют в основном только unchecked exceptions, так как они позволяют сделать код более читаемым и проще для понимания.

Unchecked exceptions не обязательно перехватывать или объявлять в сигнатуре метода, что позволяет не усложнять код лишними блоками try-catch. Они используются для сигнализирования об ошибках, которые могут возникнуть в ходе работы программы, например, NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException и др. Обработка таких исключений обычно требует исправления кода, поэтому их перехватывание является необязательным.

С другой стороны, checked exceptions обязательно нужно либо обработать, либо объявить в сигнатуре метода. Это может привести к перегруженности кода, так как для каждой checked exception нужно писать блок try-catch или throws в сигнатуре метода, даже если в данном месте кода обработка данного исключения не требуется.

Таким образом, использование unchecked exceptions позволяет сделать код более лаконичным и понятным, что способствует улучшению его качества.