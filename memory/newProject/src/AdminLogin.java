import javax.swing.*;

public class AdminLogin extends Menu {

    JOptionPane jop = new JOptionPane();
    String password = "1234"; // Passwort im Code nicht ausschreiben

    public AdminLogin() {
        String input = JOptionPane.showInputDialog("Enter password");
        if (input.equals(password)) {
           JMenu adminMenu = new JMenu("Admin");
            menuBar.add(adminMenu);

            JMenuItem adminOptionsItem = new JMenuItem("Admin Options");
            adminOptionsItem.addActionListener(e -> new AdminOptions());
            adminMenu.add(adminOptionsItem);


        } else {
            JOptionPane.showMessageDialog(null, "Wrong password");
            new Menu();
        }
    }

}

