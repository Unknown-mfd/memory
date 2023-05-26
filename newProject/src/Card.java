import javax.swing.*;

public class Card{

    public Card(JButton button) {

        Icon picture1 = new ImageIcon("picture1.jpg");
        Icon picture2 = new ImageIcon("picture2.jpg");
        Icon picture3 = new ImageIcon("picture3.jpg");
        Icon picture4 = new ImageIcon("picture4.jpg");
        Icon picture5 = new ImageIcon("picture5.jpg");
        Icon picture6 = new ImageIcon("picture6.jpg");
        Icon picture7 = new ImageIcon("picture7.jpg");
        Icon picture8 = new ImageIcon("picture8.jpg");

        Icon picture[] = {picture1, picture2, picture3, picture4, picture5, picture6, picture7, picture8};
        int array[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};

        for(int i = 0; i < 16; i++){
            int random = (int) (Math.random() * 16);
            if(i == 0){
                i--;
                continue;
            }else{
                button.setIcon(picture[array[random]]);
                array[random] = 0;
            } 
         } 
    }
}