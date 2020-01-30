package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "java";
        String description = "Murach's Android Programming";
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        double taxPercent = .075;
        double taxAmount = total * taxPercent;
        double grandTotal = total + taxAmount;
        
        String message = 
            "Code:     " + productCode + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n" +
            "Tax Percent: " + taxPercent * 100 + "\n" +
            "Tax Amount: "  + taxAmount + "\n" +
            "Grand Total: " + grandTotal + "\n" ;
        
        System.out.println(message);

        // display your name        
        // TODO: add code here
        String FirstName = "Derek";
        String LastName = "Clothier";
        System.out.println("Name: " + LastName + " , " + FirstName + "\n");
        
        // calculate and display an average        
        // TODO: add code here
        double sum = 301.75;
        sum = 200.12;
        int count = 6;
        double average = sum / count;
        System.out.println("Sum:    " + sum);
        System.out.println("Count:   " + sum);
        System.out.println("Average:  " + average + "\n");
        

        // display a goodbye message
        System.out.println("Bye!");
    }
}
