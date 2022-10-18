public class Main {
  public static void main(String[] args) {

  /*
    Создать класс "Employee", имеющий:
    - конструктор, который принимает переменные
    salary,
    number of employee's working hours в качестве параметров
    - следующие методы:
    addSalary(), который добавляет 10 евро к зврплате сотрудника если она меньше 500
    addWork(), добавляющий 5 евро к зарплате сотрудника есликоличество часов больше 6.
    Создать несколько сотрудников и применить к ним методы
         */

    Employee p1 = new Employee("Mariah", "Bell", 380, 5);
    Employee p2 = new Employee("Nathan", "Chen", 650, 9);
    Employee p3 = new Employee("Gracie", "Gold", 800, 4);

    p1.addSalary();
    p2.addSalary();
    p3.addSalary();
    p1.addWork();
    p2.addWork();
    p3.addWork();

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}