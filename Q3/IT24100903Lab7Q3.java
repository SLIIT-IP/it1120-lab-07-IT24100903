import java.util.Scanner;

public class IT24100903Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            // Input total bill amount
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            // Input payment mode (C/c for Cash, O/o for Other)
            System.out.print("Enter mode of payment: ");
            char paymentMode = input.next().charAt(0);

            // Validate payment mode and calculate discount if applicable
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05; // 5% discount
                double amountToPay = billAmount - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payment modes
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();  // Newline between customers
        }

        input.close();
    }
}
