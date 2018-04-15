/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successfulbrothers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.*;

/**
 *
 * @author Spas
 */
public class ServiceTechnician extends javax.swing.JFrame   implements ActionListener  {
    public ServiceTechnician() {
        
        initComponents();
        setTitle("SuccessfulBrothers");
        carB1.addActionListener(this);
        carB1.setActionCommand("b1");
        carB2.addActionListener(this);
        carB2.setActionCommand("b2");
        carB3.addActionListener(this);
        carB3.setActionCommand("b3");
        carB4.addActionListener(this);
        carB4.setActionCommand("b4");
        carB5.addActionListener(this);
        carB5.setActionCommand("b5");
        carB6.addActionListener(this);
        carB6.setActionCommand("b6");
        carB7.addActionListener(this);
        carB7.setActionCommand("b7");
        carB8.addActionListener(this);
        carB8.setActionCommand("b8");
        carB9.addActionListener(this);
        carB9.setActionCommand("b9");
        carB10.addActionListener(this);
        carB10.setActionCommand("b10");
        carB11.addActionListener(this);
        carB11.setActionCommand("b11");
        carB12.addActionListener(this);
        carB12.setActionCommand("b12");
        carB13.addActionListener(this);
        carB13.setActionCommand("b13");
        carB14.addActionListener(this);
        carB14.setActionCommand("b14");
        carB15.addActionListener(this);
        carB15.setActionCommand("b15");
        fixed.addActionListener(this);
        fixed.setActionCommand("fixed");
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        hideorshow(getinfo("SELECT * FROM services WHERE done =0"));
    }
    
    private void hideorshow(ArrayList<String> data){
        
        jLabel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        fixed.setVisible(false);
        car1.setVisible(false);
        carB1.setVisible(false);
        car2.setVisible(false);
        carB2.setVisible(false);
        car3.setVisible(false);
        carB3.setVisible(false);
        car4.setVisible(false);
        carB4.setVisible(false);
        car5.setVisible(false);
        carB5.setVisible(false);
        car6.setVisible(false);
        carB6.setVisible(false);
        car7.setVisible(false);
        carB7.setVisible(false);
        car8.setVisible(false);
        carB8.setVisible(false);
        car9.setVisible(false);
        carB9.setVisible(false);
        car10.setVisible(false);
        carB10.setVisible(false);
        car11.setVisible(false);
        carB11.setVisible(false);
        car12.setVisible(false);
        carB12.setVisible(false);
        car13.setVisible(false);
        carB13.setVisible(false);
        car14.setVisible(false);
        carB14.setVisible(false);
        car15.setVisible(false);
        carB15.setVisible(false);
        if(data.size() > 0){
            jLabel1.setVisible(false);
            jPanel3.setVisible(true);
            System.out.println(data.size());
            if(data.size()>=1*7){
                car1.setVisible(true);
                car1.setText(data.get(1));
                carB1.setVisible(true);
                if(data.size()>=2*7){
                    car2.setVisible(true);
                    car2.setText(data.get(8));
                    carB2.setVisible(true);
                    if(data.size()>=3*7){
                        car3.setVisible(true);
                        car3.setText(data.get(15));
                        carB3.setVisible(true);
                        if(data.size()>=4*7){
                            car4.setVisible(true);
                            car4.setText(data.get(22));
                            carB4.setVisible(true);
                            if(data.size()>=5*7){
                                car5.setVisible(true);
                                car5.setText(data.get(29));
                                carB5.setVisible(true);
                                if(data.size()>=6*7){
                                    car6.setVisible(true);
                                    car6.setText(data.get(36));
                                    carB6.setVisible(true);
                                    if(data.size()>=7*7){
                                        car7.setVisible(true);
                                        car7.setText(data.get(43));
                                        carB7.setVisible(true);
                                        if(data.size()>=8*7){
                                            car8.setVisible(true);
                                            car8.setText(data.get(50));
                                            carB8.setVisible(true);
                                            if(data.size()>=9*7){
                                                car9.setVisible(true);
                                                car9.setText(data.get(57));
                                                carB9.setVisible(true);
                                                if(data.size()>=10*7){
                                                    car10.setVisible(true);
                                                    car10.setText(data.get(64));
                                                    carB10.setVisible(true);
                                                    if(data.size()>=11*7){
                                                        car11.setVisible(true);
                                                        car11.setText(data.get(71));
                                                        carB11.setVisible(true);
                                                        if(data.size()>=12*7){
                                                            car12.setVisible(true);
                                                            car12.setText(data.get(78));
                                                            carB12.setVisible(true);
                                                            if(data.size()>=13*7){
                                                                car13.setVisible(true);
                                                                car13.setText(data.get(85));
                                                                carB13.setVisible(true);
                                                                if(data.size()>=14*7){
                                                                    car14.setVisible(true);
                                                                    car14.setText(data.get(92));
                                                                    carB14.setVisible(true);
                                                                    if(data.size()>=15*7){
                                                                        car15.setVisible(true);
                                                                        car15.setText(data.get(99));
                                                                        carB15.setVisible(true);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }else{                
            jLabel1.setVisible(true);
            jPanel3.setVisible(false);
        }
          
    }
    
    private void hideorshow2(ArrayList<String> data){
        ns.setVisible(false);
        ns1.setVisible(false);
        fixed.setVisible(true);
        jPanel2.setVisible(true);
        id.setText(data.get(0));
        car_reg.setText(data.get(1));
        car_det.setText(data.get(2));
        desc.setText(data.get(3));
        price.setText(data.get(4));
        parts.setText(data.get(6));
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("b1")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car1.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b2")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car2.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b3")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car3.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b4")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car4.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b5")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car5.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b6")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car6.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b7")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car7.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b8")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car8.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b9")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car9.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b10")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car10.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b11")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car11.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b12")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car12.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b13")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car13.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b14")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car14.getText()+"'"));
        }else
        if(e.getActionCommand().equals("b15")){
            hideorshow2(getinfo("SELECT * FROM services WHERE car_reg ='"+car15.getText()+"'"));
        }else
        if(e.getActionCommand().equals("fixed")){
            update("UPDATE services SET done=1 WHERE id="+Integer.parseInt(id.getText()));
            hideorshow(getinfo("SELECT * FROM services WHERE done =0"));
            jPanel2.setVisible(false);
            fixed.setVisible(false);
            ns.setVisible(true);
            ns1.setVisible(true);
            
        }
   
    }
    
    private ArrayList<String> getinfo(String x){
            SuccessfulBrothers tryy = new SuccessfulBrothers();
            Connection conn = null;
            ArrayList<String> data =  new ArrayList<String>();
            try{
                boolean found = false;
                conn = DriverManager.getConnection(tryy.tryy(),tryy.USER_NAME, tryy.PASSWORD);
                Statement stmt = (Statement) conn.createStatement();
                String sql = x;
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    found = true;                    
                    data.add(rs.getString("id"));     
                    data.add(rs.getString("car_reg"));     
                    data.add(rs.getString("car_info"));     
                    data.add(rs.getString("info"));     
                    data.add(rs.getString("price"));
                    data.add(rs.getString("done"));
                    data.add(rs.getString("parts_ids"));
                }
            }catch (SQLException ee){
                System.err.println(ee);
            }
        
        return data;
    }    
    
    private void update(String x){
            SuccessfulBrothers tryy = new SuccessfulBrothers();
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(tryy.tryy(),tryy.USER_NAME, tryy.PASSWORD);
                Statement stmt = (Statement) conn.createStatement();
                String sql = x;
                stmt.executeUpdate(sql);
            }catch (SQLException ee){
                System.err.println(ee);
            }
        
    }
    
    
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        fixed = new javax.swing.JButton();
        ns1 = new javax.swing.JLabel();
        ns2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        parts = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        car_det = new javax.swing.JLabel();
        car_reg = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ns = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        car1 = new javax.swing.JLabel();
        carB1 = new javax.swing.JButton();
        car2 = new javax.swing.JLabel();
        carB2 = new javax.swing.JButton();
        car3 = new javax.swing.JLabel();
        carB3 = new javax.swing.JButton();
        car4 = new javax.swing.JLabel();
        carB4 = new javax.swing.JButton();
        car5 = new javax.swing.JLabel();
        carB5 = new javax.swing.JButton();
        car6 = new javax.swing.JLabel();
        carB6 = new javax.swing.JButton();
        car7 = new javax.swing.JLabel();
        carB7 = new javax.swing.JButton();
        car8 = new javax.swing.JLabel();
        carB8 = new javax.swing.JButton();
        car9 = new javax.swing.JLabel();
        carB9 = new javax.swing.JButton();
        car10 = new javax.swing.JLabel();
        carB10 = new javax.swing.JButton();
        car11 = new javax.swing.JLabel();
        carB11 = new javax.swing.JButton();
        car12 = new javax.swing.JLabel();
        carB12 = new javax.swing.JButton();
        car13 = new javax.swing.JLabel();
        carB13 = new javax.swing.JButton();
        car14 = new javax.swing.JLabel();
        carB14 = new javax.swing.JButton();
        car15 = new javax.swing.JLabel();
        carB15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mark car as fixed", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        fixed.setText("Fixed");

        ns1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ns1.setForeground(new java.awt.Color(204, 0, 0));
        ns1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ns1.setText("No car selected!");

        ns2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ns2.setForeground(new java.awt.Color(204, 0, 0));
        ns2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fixed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ns1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(ns2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ns1)
                .addGap(18, 18, 18)
                .addComponent(fixed)
                .addContainerGap(908, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(ns2)
                    .addContainerGap(939, Short.MAX_VALUE)))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Working on", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        parts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parts.setText("jLabel2");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Parts");

        price.setText("jLabel2");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Price");

        desc.setText("jLabel2");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Car Details");

        car_det.setText("jLabel2");

        car_reg.setText("jLabel2");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Car Registration");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("ID");

        id.setText("jLabel2");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Description");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_det)
                            .addComponent(desc)
                            .addComponent(price)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parts, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car_det, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parts, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        ns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ns.setForeground(new java.awt.Color(204, 0, 0));
        ns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ns.setText("No car selected!");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Services to be done", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        car1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car1.setText("Mercedes S Class VR2550AS");

        carB1.setText("Select");

        car2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car2.setText("Mercedes S Class VR2550AS");

        carB2.setText("Select");

        car3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car3.setText("Mercedes S Class VR2550AS");

        carB3.setText("Select");

        car4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car4.setText("Mercedes S Class VR2550AS");

        carB4.setText("Select");

        car5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car5.setText("Mercedes S Class VR2550AS");

        carB5.setText("Select");

        car6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car6.setText("Mercedes S Class VR2550AS");

        carB6.setText("Select");

        car7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car7.setText("Mercedes S Class VR2550AS");

        carB7.setText("Select");

        car8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car8.setText("Mercedes S Class VR2550AS");

        carB8.setText("Select");

        car9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car9.setText("Mercedes S Class VR2550AS");

        carB9.setText("Select");

        car10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car10.setText("Mercedes S Class VR2550AS");

        carB10.setText("Select");

        car11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car11.setText("Mercedes S Class VR2550AS");

        carB11.setText("Select");

        car12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car12.setText("Mercedes S Class VR2550AS");

        carB12.setText("Select");

        car13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car13.setText("Mercedes S Class VR2550AS");

        carB13.setText("Select");

        car14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car14.setText("Mercedes S Class VR2550AS");

        carB14.setText("Select");

        car15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        car15.setText("Mercedes S Class VR2550AS");

        carB15.setText("Select");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(car1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carB1)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car1)
                    .addComponent(carB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car2)
                    .addComponent(carB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car3)
                    .addComponent(carB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car4)
                    .addComponent(carB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car5)
                    .addComponent(carB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car6)
                    .addComponent(carB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car7)
                    .addComponent(carB7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car8)
                    .addComponent(carB8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car9)
                    .addComponent(carB9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car10)
                    .addComponent(carB10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car11)
                    .addComponent(carB11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car12)
                    .addComponent(carB12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car13)
                    .addComponent(carB13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car14)
                    .addComponent(carB14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(car15)
                    .addComponent(carB15))
                .addContainerGap(466, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No Services Found!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1)
                    .addContainerGap(934, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Services", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServiceTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceTechnician().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel car1;
    private javax.swing.JLabel car10;
    private javax.swing.JLabel car11;
    private javax.swing.JLabel car12;
    private javax.swing.JLabel car13;
    private javax.swing.JLabel car14;
    private javax.swing.JLabel car15;
    private javax.swing.JLabel car2;
    private javax.swing.JLabel car3;
    private javax.swing.JLabel car4;
    private javax.swing.JLabel car5;
    private javax.swing.JLabel car6;
    private javax.swing.JLabel car7;
    private javax.swing.JLabel car8;
    private javax.swing.JLabel car9;
    private javax.swing.JButton carB1;
    private javax.swing.JButton carB10;
    private javax.swing.JButton carB11;
    private javax.swing.JButton carB12;
    private javax.swing.JButton carB13;
    private javax.swing.JButton carB14;
    private javax.swing.JButton carB15;
    private javax.swing.JButton carB2;
    private javax.swing.JButton carB3;
    private javax.swing.JButton carB4;
    private javax.swing.JButton carB5;
    private javax.swing.JButton carB6;
    private javax.swing.JButton carB7;
    private javax.swing.JButton carB8;
    private javax.swing.JButton carB9;
    private javax.swing.JLabel car_det;
    private javax.swing.JLabel car_reg;
    private javax.swing.JLabel desc;
    private javax.swing.JButton fixed;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel ns;
    private javax.swing.JLabel ns1;
    private javax.swing.JLabel ns2;
    private javax.swing.JLabel parts;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables

   
}
