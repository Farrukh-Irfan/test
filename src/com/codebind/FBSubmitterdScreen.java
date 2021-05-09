package com.codebind;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;



public class FBSubmitterdScreen {
    public JPanel panel8;

public void open(){


    JFrame frame8 = new JFrame();
    //frame8 = new JFrame();
    frame8.setTitle("Teacher Evaluation");
    frame8.setBounds(100, 100, 250, 475);

    JMenuBar menubar= new JMenuBar();
    frame8.setJMenuBar(menubar);
    JMenu help = new JMenu("help");

    JMenuItem about = new JMenuItem("About");
    help.add(about);
    menubar.add(help);

    //frame8.setContentPane(new FBSubmitterdScreen().panel8);

    JLabel FbsummittedLabel = new JLabel(SubmitScreen.yn);
    FbsummittedLabel.setHorizontalAlignment(SwingConstants.CENTER);
    frame8.add(FbsummittedLabel);
    frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.pack();
    frame8.setVisible(true);

    about.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,"created by abc");

        }
    });


        }



}




