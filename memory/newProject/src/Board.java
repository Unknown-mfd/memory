import javax.swing.*;

public class Board extends Menu{
    
    public Board() {
        super();
        addComponents();
    }

    public void addComponents() {
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                JButton button = new JButton();
                button.setBounds(50+ (i * 100), 25 + (j * 100), 80, 80);
                button.addActionListener(e -> new Card(button));
                frame.add(button);
            }
        }
    }
}
    