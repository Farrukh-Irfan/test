package com.codebind;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoginPage {
    public JPanel panel3;
    private JTextField TextfieldUser;
    private JPasswordField passwordField;
    private JButton Loginbutton;
    private JButton backButton;
    private String UsernameValue;



    public void open(){

        JFrame frame3= new JFrame();
        frame3 = new JFrame();
        frame3.setTitle("Teacher Evaluation");
        frame3.setBounds(100, 100, 250, 475);
        frame3.setContentPane(new LoginPage().panel3);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame3.setVisible(true);

    }


    public LoginPage() {


        Loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               new ProfileScreen().open();



            }



    });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new welcomeScreen().open();

            }
        });
    }
}
