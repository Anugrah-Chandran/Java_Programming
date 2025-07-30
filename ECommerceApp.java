package java_lab;
class PaymentGateway{
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println(" Credit Card Payment Sucessful");
	}
	public void makePayment(String upiId) {
		System.out.println("UPI Payment Successful");
	}
	public void makePayment(double amount) {
		System.out.println("Cash on Delivery successful");
	}
}
public class ECommerceApp {
	public static void main(String [] args) {
		PaymentGateway payment = new PaymentGateway();
		payment.makePayment("45677888254","30|07|25","123");
		payment.makePayment("anugrah@123");
		payment.makePayment(100000000);
	}

}
