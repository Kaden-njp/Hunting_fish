package application;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class imgUtil {

    public static BufferedImage getImg(String path){
        try {
            BufferedImage img = ImageIO.read(imgUtil.class.getResource(path)); return img;
        } catch (IOException e) {
            System.out.println("CAN NOT FIND IMAGE");
        }
        return null;

    }
}
