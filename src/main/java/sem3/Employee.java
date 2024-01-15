package sem3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private String name;
    private String position;
    private String phone;
    private double salary;
    private int age;

    @Override
    public String toString() {
        return "Employee name: " + getName() +
                ", position: " + getPosition() +
                ", phone: " + getPhone() +
                ", salary: " + getSalary() +
                ", age: " + getAge();
    }

    public void info(){
        System.out.println(this);
    }

    public void info_format(){
        System.out.printf("%s%n", this);
    }

    public static void increaseSalary(List<Employee> employees,int amount,int age){
        List<Employee> temp =
                employees.stream().filter(e-> e.getAge()>age).peek(x->x.setSalary(x.getSalary()+amount)).toList();
    }

    public static int compare(int yearFirst, int monthFirst, int dayFirst, int yearSecond, int monthSecond, int daySecond){
        int firstDate = yearFirst * 10_000 + monthFirst * 100 + dayFirst;
        int secondDate = yearSecond * 10_000 + monthSecond * 100 + daySecond;
        return firstDate - secondDate;
    }
}