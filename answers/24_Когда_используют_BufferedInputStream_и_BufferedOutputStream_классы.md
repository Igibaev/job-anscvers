InputStream используется для побайтового чтения данных из некоторого ресурса, а OutputStream — для побайтовой записи. Но побайтовые операции могут быть весьма неудобными и требуют дополнительной обработки (чтобы нормально считывать/записывать тексты). Собственно, для упрощения таких байтовых записей ввели BufferedOutputStream, а для чтения BufferedInputStream.

Эти классы являются не чем иным как буферами, накапливающими данные, позволяющими работать с данными не побайтово, а целыми пакетами данных (массивами).

При создании BufferedInputStream принимает в конструктор экземпляр типа InputStream, с которого идёт считка данных:

`BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
byte[] arr = new byte[100];
bufferedInputStream.read(arr);`

System.in — это объект типа InputStream, который считывает данные с консоли.

То есть с помощью данного объекта BufferedInputStream мы можем читать данные с InputStream, записывая их в переданный массив. Получается своего рода обертка класса InputStream.

Массив arr из данного примера — массив которому достаются данные из BufferedInputStream. Тот в свою очередь читает данные из InputStream другим массивом, который по умолчанию имеет размер 2048 байт.

Аналогично и для BufferedOutputStream: в конструктор необходимо передать экземпляр типа OutputStream, в который мы будем писать данные целыми массивами:

`byte[] arr = "Hello world!!!".getBytes();
BufferedOutputStream bufferedInputStream = new BufferedOutputStream(System.out);
bufferedInputStream.write(arr);
bufferedInputStream.flush();`

System.out — это объект типа OutputStream, который записывает данные в консоли.

Метод flush() отправляет данные с BufferedOutputStream в OutputStream, очищая при этом BufferedOutputStream. Без этого метода ничего записываться и не будет.

И аналогично предыдущему примеру: arr — это массив, из которого записываются данные в BufferedOutputStream. С него же они пишутся в OutputStream уже другим массивом, который по умолчанию имеет размер 512 байт.

Подробнее об этих двух классах — [в статье.](https://betacode.net/13359/java-bufferedoutputstream) 
