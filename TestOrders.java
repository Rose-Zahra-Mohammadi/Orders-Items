import java.util.ArrayList;

public class TestOrders {

  public static void main(String[] args) {
    // Menu items
    Item item1 = new Item();
    item1.name = "mocha";
    item1.price = 5;

    Item item2 = new Item();
    item2.name = "latte";
    item2.price = 3;

    Item item3 = new Item();
    item3.name = "drip coffee";
    item3.price = 3.6;

    Item item4 = new Item();
    item4.name = "capuccino";
    item4.price = 3.5;

    // Order variables -- order1, order2 etc.

    Order order1 = new Order();
    order1.name = "Cindhuri";
    order1.total = 4;
    order1.ready = true;

    Order order2 = new Order();
    order2.name = "Jimmy";
    order2.total = 2.5;
    order2.ready = true;
    order2.items.add(item1);
    order2.total += item1.price;

    Order order3 = new Order();
    order3.name = "Noah";
    order3.total = 4;
    order3.ready = false;

    Order order4 = new Order();
    order4.name = "Sam";
    order4.total = 4;
    order4.ready = false;
    order4.items.add(item2);
    order4.items.add(item2);
    order4.total += item2.price * 2;
    // Application Simulations
    // Use this example code to test various orders' updates

    System.out.printf("Name: %s\n", order1.name);
    System.out.printf("Total: %s\n", order1.total);
    System.out.printf("Ready: %s\n", order1.ready);
    System.out.printf("Total: %s\n", order2.total);
  }
}
