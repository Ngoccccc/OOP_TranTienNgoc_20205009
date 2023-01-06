package Lab1.BaiVeNha;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "You're chosen: " +
                (option == JOptionPane.YES_OPTION ? "yes" : "no"));
        System.exit(0);
    }
}
