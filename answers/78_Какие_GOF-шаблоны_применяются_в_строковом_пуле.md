В строковом пуле явно прослеживается GOF шаблон — легковес (flyweight), иначе его называют поселенец. Если же вы увидели
тут ещё какой-то шаблон — делитесь в комментарии.

Ну а мы поговорим о шаблоне легковесе.

Легковес — структурный шаблон проектирования, при котором объект, представляющий себя как уникальный экземпляр в разных
местах программы, по факту не является таковым. Легковес экономит память, разделяя общее состояние объектов между собой,
вместо хранения одинаковых данных в каждом объекте.

Для понимания сути рассмотрим самый простой пример. Предположим, у нас есть интерфейс сотрудника:

```java
public interface Employee {
    void work();
}

```

И есть некоторые реализации, например, юрист:

```java
public class Lawyer implements Employee {

    public Lawyer() {
        System.out.println("Юрист взят в штат.");
    }

    @Override
    public void work() {
        System.out.println("Решение юридических вопросов...");
    }
}
```

И бухгалтер:

```java
public class Accountant implements Employee {

    public Accountant() {
        System.out.println("Бухгалтер взят в штат.");
    }

    @Override
    public void work() {
        System.out.println("Ведение бухгалтерского отчёта....");
    }
}
```

Методы весьма условны: нам всего лишь нужно видеть, что они выполняются. Такая же ситуация и с конструктором. Благодаря
выводу в консоли мы будем видеть, когда создаются новые объекты.

Также у нас есть отдел сотрудников, задача которого — выдавать запрашиваемого сотрудника, если же его нет — нанимать в
штат и выдавать в ответ на запрос:

```java

public class StaffDepartment {
    private Map<String, Employee> currentEmployees = new HashMap<>();

    public Employee receiveEmployee(String type) throws Exception {
        Employee result;
        if (currentEmployees.containsKey(type)) {
            result = currentEmployees.get(type);
        } else {
            switch (type) {
                case "Бухгалтер":
                    result = new Accountant();
                    currentEmployees.put(type, result);
                    break;
                case "Юрист":
                    result = new Lawyer();
                    currentEmployees.put(type, result);
                    break;
                default:
                    throw new Exception("Данный сотрудник в штате не предусмотрен!");
            }
        }
        return result;
    }
}
```

То есть логика простая: если есть данная единица — верни её, если нет — создай, помести в хранилище (что-то вроде кеша)
и отдай назад.

А теперь давайте посмотрим, как это всё работает:

```java
public static void main(String[]args)throws Exception{
    StaffDepartment staffDepartment=new StaffDepartment();
    Employee empl1=staffDepartment.receiveEmployee("Юрист");
    empl1.work();
    Employee empl2=staffDepartment.receiveEmployee("Бухгалтер");
    empl2.work();
    Employee empl3=staffDepartment.receiveEmployee("Юрист");
    empl1.work();
    Employee empl4=staffDepartment.receiveEmployee("Бухгалтер");
    empl2.work();
    Employee empl5=staffDepartment.receiveEmployee("Юрист");
    empl1.work();
    Employee empl6=staffDepartment.receiveEmployee("Бухгалтер");
    empl2.work();
    Employee empl7=staffDepartment.receiveEmployee("Юрист");
    empl1.work();
    Employee empl8=staffDepartment.receiveEmployee("Бухгалтер");
    empl2.work();
    Employee empl9=staffDepartment.receiveEmployee("Юрист");
    empl1.work();
    Employee empl10=staffDepartment.receiveEmployee("Бухгалтер");
    empl2.work();
}
```

И в консоли, соответственно, будет вывод:

``
Юрист взят в штат. Решение юридических вопросов... Бухгалтер взят в штат. Ведение бухгалтерского отчёта.... Решение юридических вопросов... Ведение бухгалтерского отчёта.... Решение юридических вопросов... Ведение бухгалтерского отчёта.... Решение юридических вопросов... Ведение бухгалтерского отчёта.... Решение юридических вопросов... Ведение бухгалтерского отчёта...
``

Как вы видите, всего было создано лишь два объекта, которые при этом многократно переиспользовались.

Пример весьма простой, но он наглядно демонстрирует как применение данного шаблона может сэкономить наши ресурсы. Ну и
как вы заметили, логика данного паттерна уж больно похожа на логику работы страхового пула.

Подробнее о разновидностях GOF паттернов вы можете почитать в этой статье.