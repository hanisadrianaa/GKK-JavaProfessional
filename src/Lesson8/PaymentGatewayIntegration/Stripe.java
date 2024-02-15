package Lesson8.PaymentGatewayIntegration;

class Stripe implements PaymentGateway {

    public void processPayment(double amount) {
        // Simulate processing without API key
        System.out.println("Processing payment of $" + amount + " through Stripe...");
        if (Math.random() < 0.85) { // Simulate success rate
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please try again later.");
        }
    }

    @Override
    public boolean isPaymentSuccessful() {
        // Simulate checking payment status without API
        return Math.random() < 0.85; // Simulate success rate
    }
}
