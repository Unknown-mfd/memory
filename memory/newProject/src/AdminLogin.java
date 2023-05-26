import javax.swing.*;

public class AdminLogin extends Menu {

    JOptionPane jop = new JOptionPane();
    String password = "1234"; // Passwort im Code nicht ausschreiben

    public AdminLogin() {
        String input = JOptionPane.showInputDialog("Enter password");
        if (input.equals(password)) {
            JMenuItem adminOptionsItem = new JMenuItem("Admin Options");
            adminOptionsItem.addActionListener(e -> new AdminOptions());
            userMenu.add(adminOptionsItem);

            JMenuItem adminViewItem = new JMenuItem("Admin View");
            adminViewItem.addActionListener(e -> new AdminOptions());
            userMenu.add(adminViewItem);


        } else {
            JOptionPane.showMessageDialog(null, "Wrong password");
            new Menu();
        }
    }

}
