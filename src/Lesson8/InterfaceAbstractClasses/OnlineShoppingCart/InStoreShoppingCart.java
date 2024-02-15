package Lesson8.InterfaceAbstractClasses.OnlineShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class InStoreShoppingCart implements ShoppingCart {
    private Map<Item, Integer> itemsWithQuantity; // store item in shopping cart with it quantities    

    public InStoreShoppingCart() {
        this.itemsWithQuantity = new HashMap<>();
        // HashMap does not allow duplicate
        // if same item is added many time, the quantity will increase
    }

    @Override
    public void addItem(Item item) {
        if (itemsWithQuantity.containsKey(item)) {
            int quantity = itemsWithQuantity.get(item) + 1;
            itemsWithQuantity.put(item, quantity);
        } else {
            // if item already in Map, quantity of item will increase
            itemsWithQuantity.put(item, 1);
        }
    }

    @Override
    public void removeItem(Item item) {
        if (itemsWithQuantity.containsKey(item)) {
            int quantity = itemsWithQuantity.get(item) - 1;
            if (quantity > 0) {
                itemsWithQuantity.put(item, quantity);
            } else {
                // if quantity of item reach 0, item is remove from Map
                itemsWithQuantity.remove(item);
            }
        }
    }

    @Override
    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<Item, Integer> entry : itemsWithQuantity.entrySet()) {
            double itemPrice = entry.getKey().getPrice();
            int quantity = entry.getValue();
            total += (itemPrice * quantity);
        }
        return total;
    }

}
