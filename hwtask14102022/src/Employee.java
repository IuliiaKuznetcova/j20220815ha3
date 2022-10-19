public class Employee{

 /* String firstName;
  String lastName;*/
  int salary;
  int hoursOfWork;



  //public Employee(String firstName, String lastName, int salary, int hoursOfWork)
  public Employee (int salary, int hoursOfWork){
    /*this.firstName = firstName;
    this.lastName = lastName;*/
    this.salary = salary;
    this.hoursOfWork = hoursOfWork;


  }

  public void addSalary(){
    if (salary < 500){
      salary += 10;
    }
  }

  public void addWork(){
    if (hoursOfWork > 6){
      salary += 5;
    }
  }

  @Override
  public String toString() {
    return String.format("Employee(salary=%d, hours=%d)", salary, hoursOfWork);
  }

}

