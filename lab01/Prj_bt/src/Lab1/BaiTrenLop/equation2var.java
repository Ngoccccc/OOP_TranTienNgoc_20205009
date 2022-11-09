import javax.swing.JOptionPane;

public class equation2var {
    public static void main(String[] args) {
        String a11, a12, b1;
        String a21, a22, b2;
        String strNotification = "You've just entered: ";

        a11 = JOptionPane.showInputDialog(null, "Please input the a11: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa11 = Double.parseDouble(a11);

        a12 = JOptionPane.showInputDialog(null, "Please input a12: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa12 = Double.parseDouble(a12);

        b1 = JOptionPane.showInputDialog(null, "Please input b1: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numb1 = Double.parseDouble(b1);
        /////
        a21 = JOptionPane.showInputDialog(null, "Please input the a21: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa21 = Double.parseDouble(a21);

        a22 = JOptionPane.showInputDialog(null, "Please input a22: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa22 = Double.parseDouble(a22);

        b2 = JOptionPane.showInputDialog(null, "Please input b2: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numb2 = Double.parseDouble(b2);

        double D = numa11 * numa22 - numa21 * numa12;
        double D1 = numb1 * numa22 - numb2 * numa12;
        double D2 = numa11 * numb2 - numa21 * numb1;
        strNotification = "Thank you \n" + "x1 = " + (D1 / D) + "\n" +
                "x2 = " + (D2 / D);

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
