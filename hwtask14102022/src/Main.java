public class Main {
  public static void main(String[] args) {

  /*
    ������� ����� "Employee", �������:
    - �����������, ������� ��������� ����������
    salary,
    number of employee's working hours � �������� ����������
    - ��������� ������:
    addSalary(), ������� ��������� 10 ���� � �������� ���������� ���� ��� ������ 500
    addWork(), ����������� 5 ���� � �������� ���������� �������������� ����� ������ 6.
    ������� ��������� ����������� � ��������� � ��� ������
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