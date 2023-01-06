import javax.swing.JOptionPane;

public class carculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        strNotification = "Thank you \n" + "Sum is: " + sum + "\n" +
                "Difference is: " + difference + "\n" +
                "Product is: " + product + "\n" +
                "Quotient is: " + quotient + "\n";

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
