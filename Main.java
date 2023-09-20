import javax.swing.*;

/**
 * 
 * @author Muhammad Asad Naveed
 * UID: 3035957848
 * COMP 2396
 * Assignment 3
 * 
 * This is the main class it creates the SetGame object and also makes the frame 
 * for which the size is set, close button is added, title is added and the menubar is added
 * 
 */
  

public class Main {

    public static void main(String[] args) {

        SetGame gameob = new SetGame();
    
        JFrame Frame = new JFrame();
    
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.getContentPane().add(gameob.mainpanel);
        Frame.setTitle("A Simple Card Game");
        Frame.setJMenuBar(gameob.menuBar);
        Frame.setSize(500, 700);
        Frame.setVisible(true);
        }
    
    
}
