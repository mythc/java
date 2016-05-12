package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @version 1.0     2016-05-12
 * @author Colin
 */
public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(2000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        t.stop();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}



class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
