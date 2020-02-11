import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class barChart extends JFrame {

    //Frame
    static JFrame f;

    //Label
    static JLabel l;

    //Constructor
    barChart()
    {}

    //MAIN
    public static void main(String[] args)
    {


        /*
        *   The way Jframe, Jpanel, and Jlabel works is that you first create a frame for your window.
        *   Within that window you include a panel
        *   And within that panel you include a label
        *
        *   Think of frame as the tab name when you open an internet browser window, and the panel (with text) as the text on the website
        * */
        //Creating a new frame
        f = new JFrame("Random Bar Chart");

        //Creating a new label
        l = new JLabel("PRETEND I'M A GRAPH");


        //CREATING THE PANEL OBJECT
        JPanel p = new JPanel();

        //Add label to panel
        p.add(l);

        //Add panel to frame
        f.add(p);

        //Setting size of the frame
        f.setSize(300,300);

        f.show();

    }



}
