package Lesson8.InterfaceAbstractClasses.PaymentGatewayIntegration;

public class TestPaymentGateway {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        Stripe stripe = new Stripe();

        double amount = 100.00;

        paypal.processPayment(amount);
        if (paypal.isPaymentSuccessful()) {
            System.out.println("Payment through PayPal successful!");
        } else {
            System.out.println("Payment through PayPal failed.");
        }

        stripe.processPayment(amount);
        if (stripe.isPaymentSuccessful()) {
            System.out.println("Payment through Stripe successful!");
        } else {
            System.out.println("Payment through Stripe failed.");
        }
    }
}
