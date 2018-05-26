package drawRectangle;

import java.awt.FlowLayout;

import java.util.Objects;

import java.awt.*;

import javax.swing.*;



import javax.swing.JFrame;

import javax.swing.JPanel;  // this needs to extend JPanel for the fram.add to work..

public class Tile extends JPanel {

    public boolean matches(Tile other)

    {

        if (this.getClass() != other.getClass())

        {

            return false;

        }

        return true;

    }

    private static final Dimension SIZE = new Dimension(148,148);

    private Color color;







    public Tile()

    {

        this(Color.WHITE);

    }

    public Tile(Color color)

    {

        this.color = color;

        setPreferredSize(SIZE);

    }

    public void paintComponent(Graphics g)

    {

        super.paintComponent(g);
        g.setColor(color);
//        g.drawRect(0,0,48,48);
        g.drawRect(100,100,48,48);
//        g.fillRect(0,0,48,48);
        g.fillRect(100,100,48,48);



    }



    public static void main(String[] args) {

        final Tile tile[] = new Tile[40];

        JFrame f = new JFrame();

        f.setSize(200,200);

        f.setLayout(new FlowLayout());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tile[0] = new Tile(Color.ORANGE);

        f.add(tile[0]);

        tile[1] = new Tile(Color.RED);

        f.add(tile[1]);

        tile[2] = new Tile(Color.CYAN);

        f.add(tile[2]);

        tile[3] = new Tile(Color.BLACK);

        f.add(tile[3]);

        tile[4] = new Tile(Color.GREEN);

        f.add(tile[4]);

        tile[5] = new Tile(Color.BLUE);

        f.add(tile[5]);

        f.pack();

        f.setVisible(true);



    }



}