package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SubmitScreen {
    public JPanel panel8;
    private JButton noButton;
    private JButton yesButton;
    public static String yn;


    public void open(){
        JFrame frame8 = new JFrame();
        frame8 = new JFrame();
        frame8.setTitle("Teacher Evaluation");
        frame8.setBounds(100, 100, 250, 475);
        frame8.setContentPane(new SubmitScreen().panel8);
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame8.setVisible(true);



    }




    public SubmitScreen() {

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               yn = "Submitted anonymously";
            new FBSubmitterdScreen().open();

            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               yn = "Submitted with your Name";
                new FBSubmitterdScreen().open();
            }
        });
    }
}
