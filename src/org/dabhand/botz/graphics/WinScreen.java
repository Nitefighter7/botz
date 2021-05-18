package org.dabhand.botz.graphics;

import org.dabhand.botz.connect4.Board;
import org.dabhand.botz.connect4.Connect4;
import org.dabhand.botz.game.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A victory screen for when there are 4 in a row
 */
public class WinScreen extends JFrame implements ActionListener {
    private JFrame f = new JFrame();
    private Grid grid;
    public WinScreen(Grid g)
    {

        // create a frame
        this.grid=g;
        f.setSize(400,200);

        // create a button
        JButton exit = new JButton("Exit");
        JButton restart= new JButton("Restart");


        // add action listener
        exit.addActionListener(this);
        restart.addActionListener(this::actionPerformed2);

        // create a panel
        JPanel p1 = new JPanel();

        p1.add(restart);
        p1.add(exit);
        f.add(p1);
        f.show();
    }
    public JFrame getf(){

        return f;
    }


    // if the button is pressed
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    public void actionPerformed2(ActionEvent e) {
            this.getf().hide();
        }
    }

