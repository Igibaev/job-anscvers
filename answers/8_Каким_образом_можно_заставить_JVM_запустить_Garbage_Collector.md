В Java есть метод System.gc(), который можно использовать для запроса запуска Garbage Collector. Однако, использование этого метода не гарантирует немедленного запуска GC, так как это зависит от реализации JVM и текущей загруженности системы.

Также можно использовать опцию командной строки -XX:+ExplicitGCInvokesConcurrent, которая принудительно запускает GC в фоновом режиме. Однако, не рекомендуется часто использовать эту опцию, так как это может негативно повлиять на производительность системы.

В целом, в Java не рекомендуется явно запускать Garbage Collector, так как он запускается автоматически при необходимости.