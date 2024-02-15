package Lesson8.InterfaceAbstractClasses.PaymentGatewayIntegration;

public interface PaymentGateway {
    void processPayment(double amount);

    boolean isPaymentSuccessful();
}
