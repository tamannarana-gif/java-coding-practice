// Interface
interface PaymentService {

    void pay(double amount);
}


// Abstract class for shared/common logic
abstract class PaymentBase implements PaymentService {

    void paymentSuccess(double amount) {
        System.out.println("Payment of ₹" + amount + " successful");
    }
}


// UPI Payment Implementation
class UpiPayment extends PaymentBase {

    @Override
    public void pay(double amount) {

        System.out.println("Processing UPI Payment...");
        paymentSuccess(amount);
    }
}


// Card Payment Implementation
class CardPayment extends PaymentBase {

    @Override
    public void pay(double amount) {

        System.out.println("Processing Card Payment...");
        paymentSuccess(amount);
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {
        PaymentService p1 = new UpiPayment();
        PaymentService p2 = new CardPayment();
        p1.pay(500);

        p2.pay(1000);
    }
}