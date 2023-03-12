public class Employee {
    //Создать класс Employee, содержащий следующие поля и методы:
    //поле имя,
    //поле зарплата,
    //поле количество рабочих часов в день,
    //конструктор
    //метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
    //метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
    //Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов
    String name;
  int salary;
  int workTime;

    public Employee(String name, int salary, int workTime) {
        this.name=name;
        this.salary=salary;
        this.workTime=workTime;
        addSalary(this.name, this.salary);
        addForWork(this.name, this.workTime);
    }
    public int addSalary(String name, int salary) {
        if(this.salary<500){
           this.salary =  this.salary+10;
        }return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workTime=" + workTime +
                '}';
    }

    public int addForWork(String name, int workTime){
        if(workTime>6){
            salary = salary+5;
        }return salary;

    }
}

