package strategy;

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println(amount + " TL kredi kartı ile ödendi. Kart: " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println(amount + " TL PayPal ile ödendi. Email: " + email);
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment cardPayment = new CreditCardPayment("123456789");
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(cardPayment);
        paymentContext.executePayment(798);
    }
}