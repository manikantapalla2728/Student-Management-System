import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management System");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Department:");
        JLabel l3 = new JLabel("Email:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b1 = new JButton("Add Student");

        l1.setBounds(50,50,100,30);
        t1.setBounds(150,50,200,30);

        l2.setBounds(50,100,100,30);
        t2.setBounds(150,100,200,30);

        l3.setBounds(50,150,100,30);
        t3.setBounds(150,150,200,30);

        b1.setBounds(150,200,150,40);

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(l3); frame.add(t3);
        frame.add(b1);

        frame.setSize(450,350);
        frame.setLayout(null);
        frame.setVisible(true);

        b1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Student Added Successfully!");
        });
    }
}
