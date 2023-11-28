package application;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel {
    BufferedImage img;
    public GamePanel(){

        setBackground(Color.PINK);

        img = imgUtil.getImg("../imgs/bg.jpg");


    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(img, 0 , 0, null);
    }
}
