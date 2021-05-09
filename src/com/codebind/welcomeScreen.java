package com.codebind;
import com.codebind.LoginPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import com.codebind.App;




public class welcomeScreen {
    public JPanel panel2;
    private JButton loginButton;
    private JLabel WelcomeLabel; //new JLabel("<html>Hello World!<br/>blahblahblah</html>", SwingConstants.CENTER);
    private JButton privacyPolicyButton;
    JFrame frame2= new JFrame();
    public void open(){

        frame2.setTitle("Teacher Evaluation");
        frame2.setBounds(100,100,250,475);
        frame2.setContentPane(new welcomeScreen().panel2);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.pack();
        frame2.setVisible(true);


    }

    public welcomeScreen() {




        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JFrame frame2 = new JFrame();

                frame2.setVisible(false);
               new LoginPage().open();


            }
        });
        privacyPolicyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"The teacher would have a separate account where they would be able to get the evaluation\n from the students. If the student has chosen to be Anonymus then their identity wouldn’t be \nshown otherwise it would be shown. \nThe Teacher could study the evaluation in deep and improve accordingly.");
            }
        });
    }
}
