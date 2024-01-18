package sem4;

import sem4.Exceptions.*;
import sem4.Models.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainHome {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        customers.add(new Customer("Клиент1", 20, 123, Gender.FEMALE));
        customers.add(new Customer("Клиент2", 21, 345, Gender.MALE));


        products.add(new Product("Товар1", 10));
        products.add(new Product("Товар2", 20));
        products.add(new Product("Товар3", 30));
        products.add(new Product("Товар4", 40));
        products.add(new Product("Товар5", 50));

        try {
            orders.add(placeOrder(customers.get(0), products.get(0), 5));
            orders.add(placeOrder(customers.get(1), products.get(1), 5));
            orders.add(placeOrder(customers.get(0), products.get(2), 5));
            orders.add(placeOrder(new Customer("new Клиент", 50, 456, Gender.FEMALE), products.get(0), 5));
            orders.add(placeOrder(customers.get(0), new Product("new Товар", 15), 5));
            orders.add(placeOrder(customers.get(0), products.get(2), -5));
        } catch (CustomerException | ProductException | AmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Orders length: " + orders.size());
        }

        ArrayList<Customer> customersHoliday = new ArrayList<>();
        customersHoliday.add(new Customer("Анна", 20, 123, Gender.FEMALE));
        customersHoliday.add(new Customer("Александр", 21, 345, Gender.MALE));
        customersHoliday.add(new Customer("Нина", 20, 123, Gender.FEMALE));
        customersHoliday.add(new Customer("Николай", 21, 345, Gender.MALE));
        customersHoliday.add(new Customer("Яна", 20, 123, Gender.FEMALE));
        customersHoliday.add(new Customer("Ярослав", 21, 345, Gender.MALE));

        congratulateCustomers(customersHoliday);

    }

    private static Holiday getHolidayForToday() {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() == 1 && today.getDayOfMonth() == 1) {
            return Holiday.NEW_YEAR;
        } else if (today.getMonthValue() == 3 && today.getDayOfMonth() == 8) {
            return Holiday.March_8;
        } else if (today.getMonthValue() == 2 && today.getDayOfMonth() == 23) {
            return Holiday.February_23;
        } else {
            return Holiday.NONE;
        }
    }

    private static void congratulateCustomers(ArrayList<Customer> customers) {
        Holiday currentHoliday = getHolidayForToday();
        int count = 0;
        for (Customer customer : customers) {
            if (currentHoliday == Holiday.NEW_YEAR) {
                count++;
                System.out.println("С Новым Годом, " + customer.getName() + "!");
            } else if (currentHoliday == Holiday.March_8 && customer.getGender() == Gender.FEMALE) {
                count++;
                System.out.println("С Международным женским днём, " + customer.getName() + "!");
            } else if (currentHoliday == Holiday.February_23 && customer.getGender() == Gender.MALE) {
                count++;
                System.out.println("С Днем защитников Отечества, " + customer.getName() + "!");
            }
        }
        if (count == 0){
            System.out.println("Сегодня ни у кого нет праздника");
        }
    }

    private static Order placeOrder(Customer customer, Product product, int quantity) throws Exception {
        if (!customers.contains(customer))
            throw new CustomerException("Клиент не найден");
        if (!products.contains(product))
            throw new ProductException("Товар не найден");
        if (quantity < 0)
            throw new AmountException("Неправильная сумма " + quantity);
        return new Order(customer, product, quantity);
    }
}