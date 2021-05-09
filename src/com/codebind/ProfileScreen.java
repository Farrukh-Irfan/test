package com.codebind;
import com.codebind.CoursesScreen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ProfileScreen {
    public JPanel panel4;
    private JButton CoursesButton;
    public JPanel panel6 ;
    private JButton backButton;
    JFrame frame4 = new JFrame();

    public void open(){



        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        //JPanel panel6 = new JPanel();
        JPanel panel4 =new JPanel();
        JPanel panelL = new JPanel();
        panelL.setBounds(100,100,50,50);




       //for image

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("E://farrukh study/software/src/com/codebind/dp1.jpg"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        JLabel label = new JLabel(new ImageIcon(image));
        //label.setBounds(1,1,100,100);

        //ew ProfileScreen().panel6.add(label);
        panelL.add(label);
        //frame4.add(container);
        //frame4.add(panel4);
        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        //frame4.setContentPane(new ProfileScreen().panel4);
        JFrame frame6 = new JFrame("JPanel Example");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setTitle("Teacher Evaluation");
        frame4.setBounds(100, 100, 250, 475);
        frame6.setContentPane(container);
        container.add(new pic().panel6);
        container.add(panelL);
        container.add(new ProfileScreen().panel4);

        // add the Jpanel to the main window
        frame4.add(container);
        //frame.pack();
        frame4.setVisible(true);



    }

    public ProfileScreen() {
        CoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             new CoursesScreen().open();


            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new LoginPage().open();


            }
        });
    }
}
