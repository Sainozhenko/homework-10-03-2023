public class Main {
    public static void main(String[] args) {

        //Создать класс Employee, содержащий следующие поля и методы:
        //
        //поле имя,
        //поле зарплата,
        //поле количество рабочих часов в день,
        //конструктор
        //метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
        //метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
        //Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов
     Employee employee = new Employee("Abc",499,6);
     Employee employee1 = new Employee("Cba",599,9);
        System.out.println(employee);
        System.out.println(employee1);



    }
}