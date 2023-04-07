### Фабричный метод
Шаблон проектирования «Фабричный метод» (Factory Method) используется для создания объектов, не указывая конкретный класс создаваемого объекта. Вместо этого клиентский код вызывает метод фабрики, который создает объекты. Этот шаблон позволяет легко изменять создаваемый объект без изменения клиентского кода.

``` // Абстрактный класс, который определяет фабричный метод createReport()
abstract class ReportFactory {
    public abstract Report createReport();
}

// Классы, которые наследуют абстрактный класс ReportFactory и реализуют фабричный метод createReport()
class PDFReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}

class ExcelReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new ExcelReport();
    }
}

// Интерфейс для создаваемых объектов
interface Report {
    void generateReport();
}

// Классы, которые реализуют интерфейс Report
class PDFReport implements Report {
    @Override
    public void generateReport() {
        // Генерация отчета в формате PDF
    }
}

class ExcelReport implements Report {
    @Override
    public void generateReport() {
        // Генерация отчета в формате Excel
    }
}

// Клиентский код
public class Client {
    public static void main(String[] args) {
        ReportFactory factory = new PDFReportFactory();
        Report report = factory.createReport();
        report.generateReport();
    }
}
 ```
### Singleton
Шаблон проектирования «Одиночка» (Singleton) гарантирует, что класс имеет только один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру. Этот шаблон полезен, когда нужно гарантировать, что класс имеет только один экземпляр, и этот экземпляр может быть использован глобально в приложении.

``` public class Singleton {
    private static Singleton instance;
    
    // Закрытый конструктор, чтобы предотвратить создание объектов извне
    private Singleton() {
    }
    
    // Глобальная точка доступа к экземпляру Singleton
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Методы экземпляра
    public void doSomething() {
        // Реализация метода
    }
}

// Клиентский код
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
```
### Стратегия
Шаблон проектирования «Стратегия» позволяет определять набор алгоритмов, инкапсулировать их и делать взаимозаменяемыми. Таким образом, этот шаблон позволяет изменять поведение объектов в зависимости от контекста их использования.

В шаблоне проектирования «Стратегия» выделяются следующие роли:

Контекст (Context) — объект, который использует стратегию.
Стратегия (Strategy) — интерфейс или абстрактный класс, который определяет алгоритм, который может быть использован контекстом.
Конкретные стратегии (Concrete Strategies) — конкретные реализации стратегии, которые предоставляют реализацию алгоритма.
Клиент (Client) — объект, который создает контекст и выбирает стратегию.

``` // Интерфейс стратегии
public interface PaymentStrategy {
    public void pay(double amount);
}

// Конкретные реализации стратегии
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    public void pay(double amount) {
        // Реализация платежа с помощью кредитной карты
    }
}

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;
    
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public void pay(double amount) {
        // Реализация платежа с помощью PayPal
    }
}

// Класс, который использует стратегию
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    
    public double calculateTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    
    public void pay(PaymentStrategy paymentStrategy) {
        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}

// Клиентский код
public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Item 1", 10));
        cart.addItem(new Item("Item 2", 20));
        cart.addItem(new Item("Item 3", 30));
        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "123", "10/23"));
        cart.pay(new PayPalStrategy("johndoe@example.com", "password"));
    }
}
```
### Строитель
Шаблон проектирования "Строитель" (Builder) используется для создания сложных объектов, шаг за шагом, и отделяет процесс создания объекта от его представления. Это означает, что мы можем использовать один и тот же процесс создания объекта для создания различных представлений.

Например, допустим, у нас есть класс "Машина", который имеет множество свойств, таких как модель, цвет, мощность двигателя и т.д. Вместо того чтобы передавать все эти параметры через конструктор, мы можем использовать шаблон проектирования "Строитель", который позволит нам создавать объект "Машина" шаг за шагом.

``` public class Car {
    private String model;
    private String color;
    private int horsepower;

    public Car(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
}

public class CarBuilder {
    private String model;
    private String color;
    private int horsepower;

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setHorsepower(int horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public Car build() {
        return new Car(model, color, horsepower);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
            .setModel("Audi")
            .setColor("Black")
            .setHorsepower(200)
            .build();
        System.out.println(car1.getModel() + " " + car1.getColor() + " " + car1.getHorsepower());

        Car car2 = new CarBuilder()
            .setModel("BMW")
            .setColor("White")
            .setHorsepower(250)
            .build();
        System.out.println(car2.getModel() + " " + car2.getColor() + " " + car2.getHorsepower());
    }
}
```
### Фасад
Паттерн "Фасад" (Facade) - предоставляет унифицированный интерфейс для доступа к набору интерфейсов в подсистеме. Этот паттерн обеспечивает простой интерфейс для сложных систем и позволяет скрыть детали реализации.
```java 
public class CarEngineFacade {
    private Car car;
    private Engine engine;
    private FuelInjector fuelInjector;

    public CarEngineFacade(Car car, Engine engine, FuelInjector fuelInjector) {
        this.car = car;
        this.engine = engine;
        this.fuelInjector = fuelInjector;
    }

    public void startCar() {
        car.start();
        engine.start();
        fuelInjector.on();
    }

    public void stopCar() {
        fuelInjector.off();
        engine.stop();
        car.stop();
    }
}
```

### Адаптер
Паттерн "Адаптер" (Adapter) - позволяет объектам с несовместимыми интерфейсами работать вместе. Адаптер представляет собой посредника между двумя объектами, переводя вызовы методов одного объекта в вызовы, понятные для другого.
```java 
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

public interface AdvancedMediaPlayer {
    public void playMp4(String fileName);
    public void playAvi(String fileName);
}

public class Mp4Player implements AdvancedMediaPlayer {
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
    public void playAvi(String fileName) {
        // do nothing
    }
}

public class AviPlayer implements AdvancedMediaPlayer {
    public void playMp4(String fileName) {
        // do nothing
    }
    public void playAvi(String fileName) {
        System.out.println("Playing AVI file: " + fileName);
    }
}

public class MediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer = new AviPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer.playAvi(fileName);
        }
    }
}

```
### Декоратор
Паттерн "Декоратор" (Decorator) - позволяет динамически добавлять новые функции к объекту без изменения его кода. Декоратор оборачивает объект в другой объект, который может добавлять новые функции или изменять поведение существующих функций.

### Компоновщик
Паттерн "Компоновщик" (Composite) - объединяет объекты в древовидную структуру для представления иерархии объектов. Каждый узел в дереве может быть как простым объектом, так и контейнером для других объектов.

### Цепочка обязанностей
Паттерн "Цепочка обязанностей" (Chain of Responsibility) - позволяет объектам, представляющим различные обработчики, последовательно обрабатывать запросы и передавать их друг другу до тех пор, пока запрос не будет обработан. Каждый обработчик решает, может ли он обработать запрос самостоятельно или должен передать его дальше.

### Шаблонный метод
Паттерн "Шаблонный метод" (Template Method) - определяет каркас алгоритма в родительском классе, оставляя конкретную реализацию дочерним классам. Этот паттерн позволяет определить общий процесс выполнения операции, при этом оставляя конкретные детали для каждого класса.

### Наблюдатель
Паттерн "Наблюдатель" (Observer) - позволяет объектам следить за изменениями в других объектах и получать оповещения о них. Этот паттерн используется для создания слабой связи между объектами, что облегчает изменения в одном объекте без влияния на другие объекты.
