/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successfulbrothers;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sql.*;
/**
 *
 * @author Spas
 */
public class SuccessfulBrothers extends JFrame implements ActionListener{
    
    public static final String JDBC = "jdbc:mysql://";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST_NAME = "localhost:3306/";
    public static final String DB_NAME = "successful_brothers";
    
    public String tryy(){
        return JDBC + HOST_NAME + DB_NAME;
    }
    static void main(String asd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void actionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private JButton myBtn1;
    private JButton myBtn2;
    public SuccessfulBrothers(){
        setTitle("Title");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        myBtn1 = new JButton("Click1");
        myBtn2 = new JButton("Click2");
        myBtn1.addActionListener(this);
        myBtn2.addActionListener(this);        
        c.add(myBtn1);
        c.add(myBtn2);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Click1")){
            System.out.println("1");
        }else if(e.getActionCommand().equals("Click2")){
            
            System.out.println("2");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SuccessfulBrothers myWindow = new SuccessfulBrothers();
        myWindow.setSize(400,400);
        myWindow.show();
        System.out.println("main method");
    }
    
}
