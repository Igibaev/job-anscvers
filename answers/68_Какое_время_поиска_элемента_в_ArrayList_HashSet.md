Время поиска элемента в ArrayList и HashSet зависит от размера коллекции и от того, есть ли индексация элементов в коллекции.

Для ArrayList поиск элемента осуществляется по индексу, поэтому время поиска не зависит от размера списка и составляет O(1). Однако, если индексы не используются, то поиск будет осуществляться путем итерации по всем элементам, что может занять до O(n) времени, где n - размер списка.

Для HashSet поиск элемента осуществляется по хэш-коду элемента, что может занять до O(1) времени в среднем случае. Однако, если хэш-коды многих элементов коллизируют, то поиск может занять до O(n) времени, где n - размер HashSet.

В целом, время поиска элемента в коллекции зависит от ее внутренней реализации и использования индексации или хэш-кодов элементов.