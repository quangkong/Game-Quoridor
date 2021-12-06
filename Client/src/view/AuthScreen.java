/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ObjectWrapper;
import static model.ObjectWrapper.REGISTER_USER;
import model.User;

/**
 *
 * @author ASUS
 */
public class AuthScreen extends javax.swing.JFrame {

    /**
     * Creates new form AuthScreen
     */
    ObjectInputStream reveiveStream;
    ObjectOutputStream sendStream;
    boolean isLogin = true;

    public AuthScreen(ObjectInputStream reveiveStream, ObjectOutputStream sendStream) {
        super("Quoridor Board Games");
        this.reveiveStream = reveiveStream;
        this.sendStream = sendStream;

        //////////khoi tao form //////////////
        initComponents();
        setVisible(true);

        emailLabel.setIcon(new ImageIcon("src/image_assets/user_ic.png"));
        usernameLabel.setIcon(new ImageIcon("src/image_assets/display_ic.png"));
        passwordLabel.setIcon(new ImageIcon("src/image_assets/pass_ic.png"));
        jLabel1.setIcon
        (new ImageIcon("src/image_assets/auth_bg.png"));

        setIsLogin(true);
        /////////////////////////////////////
    }

    void setIsLogin(boolean isLogin) {
        jTextField2.setVisible(!isLogin);
        usernameLabel.setVisible(!isLogin);
        jSeparator3.setVisible(!isLogin);
        if (isLogin) {
            button1.setText("Log in");
            button2.setText("Register");
        } else {
            button1.setText("Cancel");
            button2.setText("Confirm");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        button2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(99, 104, 168));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(133, 93, 180));
        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 215, 193));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO QUORIDOR");

        jLabel3.setBackground(new java.awt.Color(133, 93, 180));
        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 215, 193));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOARD GAMES");

        jTextField1.setBackground(new java.awt.Color(99, 104, 168));
        jTextField1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(236, 215, 193));
        jTextField1.setToolTipText("Username");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(99, 104, 168));
        jPasswordField1.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(236, 215, 193));
        jPasswordField1.setToolTipText("Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(236, 215, 193));
        jSeparator1.setForeground(new java.awt.Color(236, 215, 193));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(236, 215, 193));
        jSeparator2.setForeground(new java.awt.Color(236, 215, 193));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        passwordLabel.setBackground(new java.awt.Color(236, 215, 193));
        passwordLabel.setForeground(new java.awt.Color(236, 215, 193));

        emailLabel.setBackground(new java.awt.Color(236, 215, 193));
        emailLabel.setForeground(new java.awt.Color(236, 215, 193));

        jPanel3.setBackground(new java.awt.Color(99, 104, 168));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 215, 193)));

        button2.setBackground(new java.awt.Color(99, 104, 168));
        button2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(236, 215, 193));
        button2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button2.setText("Register");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(99, 104, 168));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 215, 193)));

        button1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(236, 215, 193));
        button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button1.setText("Log in");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField2.setBackground(new java.awt.Color(99, 104, 168));
        jTextField2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(236, 215, 193));
        jTextField2.setToolTipText("In-game Nickname");
        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        usernameLabel.setBackground(new java.awt.Color(236, 215, 193));
        usernameLabel.setForeground(new java.awt.Color(236, 215, 193));

        jSeparator3.setBackground(new java.awt.Color(236, 215, 193));
        jSeparator3.setForeground(new java.awt.Color(236, 215, 193));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_assets/logo_ic.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

    }//GEN-LAST:event_jTextField1FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained

    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained

    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    //nut dang ki
    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        if (isLogin) {
            setIsLogin(false);
            isLogin = !isLogin;
            //chuyen sang trang thai dang ky

        } else if (!isLogin) {
            try {
                if (jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please, Enter all your required info");
                    return;
                }
                InetAddress ip = null;
                try {
                    ip = InetAddress.getLocalHost();
                } catch (UnknownHostException ex) {
                    Logger.getLogger(AuthScreen.class.getName()).log(Level.SEVERE, null, ex);
                }    
                User user = new User();
                user.setUsername(jTextField1.getText().trim());
                user.setPassword(jPasswordField1.getText().trim());
                user.setName(jTextField2.getText().trim());
                user.setIpAddress(ip.getHostAddress().toString());
                System.out.println("register user: " + user.toString());
                //gửi dữ liệu
                try {
                    sendStream.writeObject(new ObjectWrapper(REGISTER_USER, user, null));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

                //nhận phản hồi
                User respond;

                respond = (User) reveiveStream.readObject();
                System.out.println(respond);
                if (respond != null) {
                    JOptionPane.showMessageDialog(this, "Register Successfull");
                    setIsLogin(true);
                    isLogin = !isLogin;
                } else {
                    JOptionPane.showMessageDialog(this, "Register failed");
                }

            } catch (IOException ex) {
                Logger.getLogger(AuthScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AuthScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_button2MouseClicked
    //nut dang nhap/ nut cancel
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

        if (isLogin) {
            if (jTextField1.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, Enter all your required info");
                return;
            }

            User user = new User();
            user.setUsername(jTextField1.getText().trim());
            user.setPassword(jPasswordField1.getText().trim());
            System.out.println(user.toString());
            try {
                //Gửi dữ liệu
                ObjectWrapper ow = new ObjectWrapper(ObjectWrapper.LOGIN_USER, user, null);
                sendStream.writeObject(ow);

                //Nhận đáp trả
                User userData = (User) reveiveStream.readObject();
                System.out.println(userData.toString());

                if (userData.getId() != 0) {
                    //dang nhap thanh cong
//                    LoginSuccess loginSuccess = new LoginSuccess(reveiveStream, sendStream, "Cong");
//                    setVisible(false);

                    System.out.println("Dang nhap thanh cong");
                    MainScreen mainScreen = new MainScreen(reveiveStream, sendStream, userData);
                    setVisible(false);
                } else {
                    //dang nhap that bai
                    int userChoice = JOptionPane.showConfirmDialog(
                            this,
                            "This account does not exist. Do you want to create a new account",
                            "LOGIN FAILED!",
                            JOptionPane.YES_NO_OPTION);
                    if (userChoice == 0) {
                        System.out.println("set login");
                        setIsLogin(false);
                        isLogin = !isLogin;

                    } else {
                        return;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (!isLogin) {
            setIsLogin(true);
            isLogin = !isLogin;
            //cancel dang ki -> chuyen ve trang thai dang nhap
        }
    }//GEN-LAST:event_button1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}