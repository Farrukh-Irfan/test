package com.codebind;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CoursesScreen {
    public JPanel panel5;
    private JButton course1Button;
    private JButton course5Button;
    private JButton course2Button;
    private JButton course4Button;
    private JButton course3Button;
    private JTextField searchCoursesTextField;
    private JButton SearchButton;
    private JScrollPane scrollPane;
    private JButton backButton;
    private Container panel6;
    /*= new JButton(SearchButton.setPreferredSize(40,40));
     */

    public void openjava(){

        //frame4.dispose();

        JFrame frame5 = new JFrame();
        //frame5 = new JFrame();


        frame5.setTitle("Teacher Evaluation");
        frame5.setBounds(100, 100, 250, 475);
        frame5.setContentPane(new CoursesScreen().panel5);



        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame5.setVisible(true);



    }

    public void open(){


        JFrame frame5 = new JFrame();
        //frame5 = new JFrame();


        frame5.setTitle("Teacher Evaluation");
        frame5.setBounds(100, 100, 250, 475);
        frame5.setContentPane(new CoursesScreen().panel5);



        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame5.setVisible(true);




    }







    public CoursesScreen() {
        SearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FeedbackScreen().open();

                //JFrame frame6 = new JFrame();
               /* JFrame frame6 = new JFrame("available courses");
                frame6 = new JFrame();
                frame6.setTitle("Teacher Evaluation");
                frame6.setBounds(100, 100, 250, 475);
                frame6.setContentPane(new CoursesScreen().panel6);
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("E://farrukh study/software/src/com/codebind/java.jpg"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                JLabel label = new JLabel(new ImageIcon(image));
                panel6.add(label);
                JFrame.setDefaultLookAndFeelDecorated(true);

                frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // add the Jpanel to the main window
                frame6.add(panel6);
                //

                frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.pack();
                frame6.setVisible(true);*/


            }
        });
        course1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });

        course2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });



        course3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });



        course4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });



        course4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });



        course5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame4 = new JFrame();

                //frame4.dispose();
                buttonClicked();




            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ProfileScreen().open();

            }
        });
    }

    void buttonClicked(){

        //new FeedbackScreen().open();
    new FeedbackScreen().open();

    }


}