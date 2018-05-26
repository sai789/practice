package directorypicker;

import javax.swing.*;
import java.awt.*;


class TestJFilePicker extends JFrame
{
    JPanel panel;
    // constructor
    TestJFilePicker(String title)
    {
        super(title);                      // invoke the JFrame constructor
        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize(600,500);
        setLayout(new FlowLayout());       // set the layout manager
    }

}