import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import javax.swing.*;


public class GradesGUI {

    JLabel labs, p1, midterm, p2, fin, finGrade;

    JTextField labsText, p1Text, midtermText, p2Text, finText;

    JButton calcGrade;

    JTextArea txtArea;

    JFrame gradeFrame;

    JPanel gradePanel;

    //I made changes here
    double x = 0.0;



    public GradesGUI() {

        gradeFrame = new JFrame("Calculate Grade");

        gradePanel = new JPanel();



        calcGrade = new JButton("Calculate Grade");



        labs = new JLabel("Labs Weight.2");

        p1 = new JLabel("Project 1 Weight .125");

        midterm = new JLabel("Midterm Weight .25");

        p2 = new JLabel("Project 2 Weight .125");

        fin = new JLabel("Final Weight .25");

        finGrade = new JLabel("Final Grad: " + x);



        labsText = new JTextField(5);

        p1Text = new JTextField(5);

        midtermText = new JTextField(5);

        p2Text = new JTextField(5);

        finText = new JTextField(5);



// Add

        JPanel jp1 = new JPanel();
        jp1.add(labs);
        jp1.add(labsText);

        gradePanel.add(jp1);

        JPanel jp2 = new JPanel();
        jp2.add(p1);
        jp2.add(p1Text);

        gradePanel.add(jp2);


        JPanel jp3 = new JPanel();
        jp3.add(midterm);
        jp3.add(midtermText);

        gradePanel.add(jp3);


        JPanel jp4 = new JPanel();
        jp4.add(p2);
        jp4.add(p2Text);

        gradePanel.add(jp4);

        JPanel jp5 = new JPanel();
        jp5.add(fin);
        jp5.add(finText);

        gradePanel.add(jp5);


        gradePanel.add(calcGrade);

        gradePanel.add(finGrade);
        gradePanel.setLayout(new BoxLayout(gradePanel, BoxLayout.Y_AXIS));

        gradePanel.setVisible(true);

        gradeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create grades

// Action Listener

        calcGrade.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                //I made changes here
                double labsGrade, p1Grade, midtermGrade, p2Grade, finalGrade;

                labsGrade = Integer.parseInt(labsText.getText());

                p1Grade = Integer.parseInt(p1Text.getText());

                midtermGrade = Integer.parseInt(midtermText.getText());

                p2Grade = Integer.parseInt(p2Text.getText());

                finalGrade = Integer.parseInt(finText.getText());



//Calculations

                labsGrade = (double) (labsGrade * .2);

                p1Grade = (double) (p1Grade * .125);

                midtermGrade = (double) (midtermGrade * .25);

                p2Grade = (double) (p2Grade * .125);

                finalGrade = (double) (finalGrade * .25);

                x = labsGrade + p1Grade + midtermGrade + p2Grade + finalGrade;

                //I made changes here
                finGrade.setText("Final Grad: " + x);
                gradePanel.setVisible(true);
                gradeFrame.pack();
                gradeFrame.setVisible(true);

            }


        });
        //I made changes here
        gradeFrame.add(gradePanel);
        gradeFrame.setSize(700, 500);
        gradeFrame.pack();
        gradeFrame.setVisible(true);

    }

    //I made changes here
    public static void main(String[] args) {
        GradesGUI GradesGUI = new GradesGUI();
    }

}