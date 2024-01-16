package sem4;

import sem4.Exceptions.AmountException;
import sem4.Exceptions.CustomerException;
import sem4.Exceptions.ProductException;

import java.util.ArrayList;
import java.util.Objects;

public class Problem1 {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Item> items = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();
    static ArrayList<Order> draft = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        customers.add(new Customer("customer1", 20, 123));
        customers.add(new Customer("customer2", 21, 345));
        items.add(new Item("item1", 10));
        items.add(new Item("item2", 20));
        items.add(new Item("item3", 30));
        items.add(new Item("item4", 40));
        items.add(new Item("item5", 50));


        try {
            orders.add(placeOrder(customers.get(0),items.get(0), 5));
            orders.add(placeOrder(customers.get(1),items.get(1), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), 5));
            orders.add(placeOrder(new Customer("new cust", 50, 456),items.get(0), 5));
            orders.add(placeOrder(customers.get(0),new Item("new item", 15), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), -5));
        }
        catch (CustomerException e){
            System.out.println(e.getMessage());
        }
        catch (ProductException e){
            System.out.println(e.getMessage());
        }
        catch (AmountException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Orders length: " + orders.size());
        }

    }
    public static Order placeOrder(Customer customer, Item item, int quantity) throws Exception {
        if (!customers.contains(customer))
            throw new CustomerException("Customer not found");
        if(!items.contains(item))
            throw new ProductException("Item not found");
        if(quantity < 0)
            throw new AmountException("Incorrect amount " + quantity);
        return new Order(customer, item, quantity);
    }
}