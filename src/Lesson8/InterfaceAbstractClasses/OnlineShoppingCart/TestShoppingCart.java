package Lesson8.InterfaceAbstractClasses.OnlineShoppingCart;

import java.util.Scanner;

public class TestShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose shopping cart type (1 for online, 2 for in-store): ");
        int cartType = scanner.nextInt();

        ShoppingCart cart;
        if (cartType == 1) {
            cart = new OnlineShoppingCart();
        } else {
            cart = new InStoreShoppingCart();
        }

        while (true) {
            System.out.print("Enter item name (or 'quit' to finish): ");
            String itemName = scanner.next();
            if (itemName.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();

            cart.addItem(new Item(itemName, itemPrice));
        }

        System.out.println("Total cost: " + cart.calculateTotal());
        scanner.close();
    }
}
