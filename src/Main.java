import models.Person;
import models.Student;
import models.Employee;
import models.Payable;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Lennon", "Manager", 50000.0);
        Student stu = new Student("Nauryzbek", "Sauryzbek", 3.5);

        System.out.println(emp.toString());
        System.out.println("Salary: " + emp.getPaymentAmount());

        System.out.println(stu.toString());
        System.out.println("Stipend: " + stu.getPaymentAmount());
    }
}
