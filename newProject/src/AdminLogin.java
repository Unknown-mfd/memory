import javax.swing.JOptionPane;

public class AdminLogin {

    JOptionPane jop = new JOptionPane();
    String password = "1234";

    public AdminLogin() {
        String input = JOptionPane.showInputDialog("Enter password");
        if (input.equals(password)) {
            new AdminOptions();
        } else {
            JOptionPane.showMessageDialog(null, "Wrong password");
            new Menu();
        }
    }

}
