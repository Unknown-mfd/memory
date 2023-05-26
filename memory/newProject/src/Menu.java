import javax.swing.*;
import java.awt.*;

public class Menu {
    public JFrame frame = new JFrame("Memory Game");;

    public Menu() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new java.awt.Color(0,191,255));
        frame.setLayout(null);
      

        addComponents();
        addMenuBar();

        frame.setVisible(true);
    }

    public void addComponents() {

        JLabel welcomeLabel = new JLabel("Welcome to Memory!");
        welcomeLabel.setBounds(100, 0, 300, 100);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 30));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.getVerticalTextPosition();
        frame.add(welcomeLabel);

        JButton startButton = new JButton("Start");
        startButton.setBounds(175, 150, 150, 40);
        startButton.addActionListener(e -> new Board());
        startButton.addActionListener(e -> frame.dispose());
        frame.add(startButton);

        JButton optionsButton = new JButton("Options");
        optionsButton.setBounds(175, 200, 150, 40);
        frame.add(optionsButton);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBounds(175, 250, 150, 40);
        frame.add(exitButton);

    }

    public JMenuBar menuBar = new JMenuBar();

    public void addMenuBar(){

        
        frame.setJMenuBar(menuBar);

        //--------------------//

        JMenu gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);

        JMenuItem newGameItem = new JMenuItem("New Game");
        newGameItem.addActionListener(e -> new Board());
        newGameItem.addActionListener(e -> frame.dispose());
        gameMenu.add(newGameItem);

        JMenuItem menuItem = new JMenuItem("Back to Menu");
        menuItem.addActionListener(e -> new Menu());
        menuItem.addActionListener(e -> frame.dispose());
        gameMenu.add(menuItem);


        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        gameMenu.add(exitItem);

        JMenuItem optionsItem = new JMenuItem("Options");
        gameMenu.add(optionsItem);

        //--------------------//

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        JMenuItem rulesItem = new JMenuItem("Rules");
        helpMenu.add(rulesItem);


        //--------------------//

        JMenu userMenu = new JMenu("User");
        userMenu.addActionListener(e -> new User());
        menuBar.add(userMenu);

        JMenuItem adminItem = new JMenuItem("Admin");
        adminItem.addActionListener(e -> new AdminLogin());
        userMenu.add(adminItem);

        JMenuItem guestItem = new JMenuItem("Guest");
        userMenu.add(guestItem);


    }
}

