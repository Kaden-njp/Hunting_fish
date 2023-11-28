package application;

import javax.swing.*;

public class app extends JFrame {

    public final String title = "Fish_Hunter";
    public final Integer Height = 480;
    public final Integer Width = 800;

    public app(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // WITHOUT this, window closed, function remains running
        setTitle(title);
        setSize(Width, Height); setResizable(false); setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        app a = new app();

        GamePanel panel = new GamePanel();
        a.add(panel);

        a.setVisible(true);

    }
}
