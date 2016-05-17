package sizedFrame;

import java.awt.*;
import javax.swing.*;

/**
 * Created by lihuaf on 2016/5/17.
 */
public class SizedFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new SizedFrame();
                frame.setTitle("SizedFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}


class SizedFrame extends JFrame{
    public SizedFrame(){
        // get screen dimensions
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // set frame width, height and let platform pick screen location
        setSize(screenWidth/3, screenHeight/2);
        setLocationByPlatform(true);

        // set frame icon
        Image img = new ImageIcon("./src/icon.jpg").getImage();
        setIconImage(img);
    }
}