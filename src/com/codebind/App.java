package com.codebind;
import com.codebind.welcomeScreen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class App {


    public JPanel panelMain;
    private JButton buttonGo;
    public JPanel panel1;
    public JLabel logoLabel;
    JFrame frame1= new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();
    public JPanel panel2;

    /*public App() {
        buttonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                //JOptionPane.showMessageDialog(null,"Hello World");
            }
        });





    }*/
    public static void main(String[] args) throws InterruptedException {

    // new X();
        JFrame frame1= new JFrame();
        //JFrame frame2 = new JFrame();
        //JFrame frame = new JFrame("Teacher Evaluation");
        frame1.setTitle("Teacher Evaluation");
        frame1.setBounds(100,100,250,475);


        JPanel panel1 = new JPanel();
        panel1.setBounds(100,100,50,50);




        //for image

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("E://farrukh study/software/src/com/codebind/loading1.jpg"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        JLabel label = new JLabel(new ImageIcon(image));
        //label.setBounds(1,1,100,100);

        //ew ProfileScreen().panel6.add(label);
        panel1.add(label);
        //frame4.add(container);
        //frame4.add(panel4);
        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame1.add(panel1);


        //frame1.setContentPane(new App().panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame1.setVisible(true);







//dealay for splash screen

        Thread.sleep(2000);


        frame1.dispose();

        new welcomeScreen().open();


    }


    /*public static class X {
        //private  Component panel1;
        JFrame frame1,frame2;
        //private Component panel2;

        public X(){

            frame1 = new JFrame("Teacher Evaluation");
            //frame.setTitle("Teacher Evaluation");
            frame1.setBounds(100,100,250,475);
            frame1.setContentPane(new JPanel());
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.pack();
            frame1.setVisible(true);
            JButton b1 = new JButton("click");
            JLabel label = new JLabel("text abc");
            //JPanel panel1 = new JPanel();
            /*new App().panel1.add(b1);
            new App().panel1.add(label);
            frame1.add( new App().panel1);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame1.dispose();
                    frame2 = new JFrame("Teacher Evaluation");
                    //frame.setTitle("Teacher Evaluation");
                    frame2.setBounds(100,100,250,475);
                    frame2.setContentPane(new JPanel());
                    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    //frame.pack();
                    frame2.setVisible(true);
                    //panel2 = new JPanel();
                    JTextField t1 = new JTextField();
                    JTextField t2 = new JTextField();
                    new App().panel2.add(t1);
                    new App().panel2.add(t2);
                    frame2.add( new App().panel2);

                    /*JButton b1 = new JButton("click");
                    JLabel label = new JLabel("text abc");

                    panel.add(b1);
                    panel.add(label);
                    frame1.add(panel);



                }
            });
        }

    }*/
}
