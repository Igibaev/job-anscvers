У класса Object есть 11 методов:
Class<?> getClass() — получение класса текущего объекта; int hashCode() — получение хеш кода текущего объекта; boolean
equals​(Object obj) — сравнение текущего объекта с другим; Object clone() — создание и возвращение копии текущего
объекта; String toString() — получение строкового представления объекта; void notify() — пробуждение одного потока,
ожидающего на мониторе данного объекта (выбор потока рандомный); void notifyAll() — пробуждение всех потоков, ожидающего
на мониторе данного объекта; void wait() — переключает текущий поток в режим ожидания (замораживает его) на текущий
монитор, работает только в synchronized блоке, пока какой-нибудь notify или notifyAll не разбудит поток; void wait(long
timeout) — также замораживает текущий поток на текущий монитор (на текущий synchronized), но уже с таймером выхода из
этого состояния (ну или опять же: пока notify или notifyAll не разбудит); void wait(long timeout, int nanos) — метод,
аналогичный вышеописанному, но с более точным таймеров выхода из заморозки; void finalize() — перед удалением этого
объекта сборщиком мусора вызывается этот метод (напоследок). Он используется для очистки занимаемых ресурсов.