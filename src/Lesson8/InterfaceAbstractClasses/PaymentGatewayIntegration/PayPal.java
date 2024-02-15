package Lesson8.InterfaceAbstractClasses.PaymentGatewayIntegration;

class PayPal implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.println("Processing payment of RM" + amount + " through PayPal...");
        if (Math.random() < 0.9) { 
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please try again later.");
        }
    }

    @Override
    public boolean isPaymentSuccessful() {
        return Math.random() < 0.9;
    }
}
