Существует множество стандартных классов в Java, которые являются immutable (неизменяемыми) объектами. Некоторые из них:

java.lang.String - объекты класса String неизменяемы и не могут быть изменены после создания.
java.lang.Integer, java.lang.Long, java.lang.Short, java.lang.Float, java.lang.Double, java.lang.Character, java.lang.Boolean - все примитивные типы данных в Java являются неизменяемыми объектами.
java.time.* - классы, связанные с датой и временем (например, LocalDate, LocalTime, Instant) являются неизменяемыми.
java.math.BigDecimal, java.math.BigInteger - классы, предназначенные для работы с большими числами, также являются неизменяемыми.
Кроме того, в Java есть множество сторонних библиотек, которые также содержат неизменяемые классы, например, Guava Immutable Collections.