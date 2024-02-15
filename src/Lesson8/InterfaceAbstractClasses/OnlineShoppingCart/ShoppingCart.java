package Lesson8.InterfaceAbstractClasses.OnlineShoppingCart;

public interface ShoppingCart {
    void addItem(Item item); // add item to cart
    void removeItem(Item item); // remove item from cart
    double calculateTotal(); // calculate total cost in cart
}
