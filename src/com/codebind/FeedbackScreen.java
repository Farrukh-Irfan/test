package com.codebind;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import com.codebind.SubmitScreen;
public class FeedbackScreen {
    public JPanel panel7;
    private JButton backButton;
    private JTextField instructorNameTextField;
    private JTextField ddMmYyyyTextField;
    private JTextArea feedBackTextArea;
    private JButton attachFileButton;
    private JTextField classActivityAssignmentTextField;
    private JButton submitButton;
    private JRadioButton radioButton1;
    private JButton profileButton;
    //private JScrollBar scrollBar1;

public void open(){


    JFrame frame7 = new JFrame();
    frame7 = new JFrame();
    frame7.setTitle("Teacher Evaluation");
    frame7.setBounds(100, 100, 250, 475);
    frame7.setContentPane(new FeedbackScreen().panel7);
    frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.pack();
    frame7.setVisible(true);



}



    public void openjava(){


//        frame5.dispose();


        JPanel panel6 = new JPanel();

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("E://farrukh study/software/src/com/codebind/java.jpg"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        JLabel label = new JLabel(new ImageIcon(image));
        JButton backButton = new JButton("Back");
        panel6.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CoursesScreen().open();




            }
        });

        // main window


        //ew ProfileScreen().panel6.add(label);
        panel6.add(label);
        //frame4.add(container);
        //frame4.add(panel4);
        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);





        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame6 = new JFrame("JPanel Example");
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setTitle("Teacher Evaluation");
        frame6.setBounds(100, 100, 250, 475);
        //frame6.setContentPane(new CoursesScreen().panel6);
        // add the Jpanel to the main window
        frame6.add(panel6);

        //frame.pack();
        frame6.setVisible(true);

    }

    public FeedbackScreen() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new SubmitScreen().open();




            }
        });
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radioButton1.isSelected()){
                    JOptionPane.showMessageDialog(null,"selected");


                }
            }
        });


        attachFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Using this process to invoke the constructor,
// JFileChooser points to user's default directory
                JFileChooser j = new JFileChooser();

// Open the save dialog
                j.showSaveDialog(null);



            }
        });
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ProfileScreen().open();

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new CoursesScreen().open();

            }
        });
    }
}
