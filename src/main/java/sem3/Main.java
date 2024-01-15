package sem3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees =
                new ArrayList<>(List.of(new Employee[]{
                        new Employee("Oleg", "developer", "88003000009", 100000.5, 25),
                        new Employee("Sasha", "tester", "88003000008", 110000.5, 28),
                        new Employee("Sergei", "analytic", "88003000007", 120000.5, 35),
                        new Employee("Ivan", "designer", "88003000006", 130000.5, 47),
                        new Employee("Stepan", "devOps", "88003000005", 140000.5, 46),
                        new Manager("Maks", "teamLead", "88003000004", 150000.5, 46)}));

        int result = Employee.compare(2022, 12, 20, 2023, 12, 20);
        dateComparisonResult(result);
        result = Employee.compare(2023, 12, 20, 2022, 12, 20);
        dateComparisonResult(result);
        result = Employee.compare(2022, 12, 20, 2022, 12, 20);
        dateComparisonResult(result);
        System.out.println();

        employees.forEach(System.out::println);
        System.out.println();
        Manager.increaseSalary(employees, 5000, 20);
        employees.forEach(System.out::println);
        System.out.println();

        List<Student> students =
                new ArrayList<>(List.of(
                        new Student("Иванов Иван", List.of(4.0, 5.0, 5.0, 4.0), "Информатика"),
                        new Student("Петров Петр", List.of(5.0, 5.0, 5.0, 4.0), "Информатика"),
                        new Student("Сидоров Сергей", List.of(5.0, 4.0, 5.0, 5.0), "Гуманитарные науки"),
                        new Student("Смирнов Михаил", List.of(4.0, 5.0, 5.0, 4.0), "Информатика"),
                        new Student("Козлов Андрей", List.of(5.0, 5.0, 5.0, 5.0), "Информатика"),
                        new Student("Никитин Александр", List.of(5.0, 5.0, 4.0, 4.0), "Информатика"),
                        new Student("Кузнецов Владимир", List.of(5.0, 5.0, 5.0, 4.0), "Информатика")));
        students.forEach(System.out::println);
        System.out.println();
        Student.getAverageGrade(students).forEach(System.out::println);
    }

    private static void dateComparisonResult(int date) {
        if (date < 0) {
            System.out.println("Первая дата меньше второй");
        } else if (date > 0) {
            System.out.println("Первая дата больше второй");
        } else System.out.println("Даты равны");
    }
}