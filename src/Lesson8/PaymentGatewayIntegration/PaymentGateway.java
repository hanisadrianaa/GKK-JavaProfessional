package Lesson8.PaymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount);

    boolean isPaymentSuccessful();
}
