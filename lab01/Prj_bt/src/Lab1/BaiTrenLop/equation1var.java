import javax.swing.JOptionPane;

public class equation1var {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        double num1;
        do {
            strNum1 = JOptionPane.showInputDialog(null, "Please input the a: ",
                    "Input your first number",
                    JOptionPane.INFORMATION_MESSAGE);
            num1 = Double.parseDouble(strNum1);
        } while (num1 == 0);

        strNum2 = JOptionPane.showInputDialog(null, "Please input b: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        double result = 0 - num2 / num1;
        strNotification = "Thank you \n" + "Result is: " + result;

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
