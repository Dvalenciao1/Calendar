package ventanas;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ventanas.POO.Registro;
import ventanas.POO.Usuario;

public class ventanaLogin extends javax.swing.JFrame {

    public ventanaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        cajaEmail.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        benditoPan = new javax.swing.JLabel();
        cajaEmail = new LIB.JTexfieldPH_FielTex();
        cajaPass = new LIB.JTexfieldPH_Password();
        BotonLogin = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        BotonRegister = new javax.swing.JButton();
        BannerLogin = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        PassText = new javax.swing.JLabel();
        PanelTransparente = new javax.swing.JLabel();
        FondoPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 800));

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(700, 800));
        PanelPrincipal.setLayout(null);
        PanelPrincipal.add(benditoPan);
        benditoPan.setBounds(500, 80, 80, 80);
        javax.swing.ImageIcon pancito = new javax.swing.ImageIcon("src/imagenes/pazinto.png");
        benditoPan.setIcon(new javax.swing.ImageIcon(pancito.getImage().getScaledInstance(benditoPan.getWidth(), benditoPan.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        cajaEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ventanas/Bundle"); // NOI18N
        cajaEmail.setPlaceholder(bundle.getString("ventanaLogin.cajaEmail.placeholder")); // NOI18N
        cajaEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaEmailKeyReleased(evt);
            }
        });
        PanelPrincipal.add(cajaEmail);
        cajaEmail.setBounds(190, 340, 320, 40);

        cajaPass.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cajaPass.setPlaceholder(bundle.getString("ventanaLogin.cajaPass.placeholder")); // NOI18N
        cajaPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaPassKeyReleased(evt);
            }
        });
        PanelPrincipal.add(cajaPass);
        cajaPass.setBounds(190, 430, 320, 40);

        BotonLogin.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ImageIcon botonimg = new ImageIcon("src/imagenes/boton1.png");
        BotonLogin.setIcon(new ImageIcon(botonimg.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));
        BotonLogin.setText(bundle.getString("ventanaLogin.BotonLogin.text")); // NOI18N
        BotonLogin.setBorderPainted(false);
        BotonLogin.setContentAreaFilled(false);
        BotonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLoginMouseExited(evt);
            }
        });
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonLogin);
        BotonLogin.setBounds(220, 530, 250, 50);

        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarMouseExited(evt);
            }
        });
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(botonCerrar);
        botonCerrar.setBounds(640, 10, 50, 50);
        ImageIcon equisimg = new ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new ImageIcon(equisimg.getImage().getScaledInstance(botonCerrar.getWidth(),botonCerrar.getHeight(), Image.SCALE_SMOOTH)));

        BotonRegister.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        BotonRegister.setText(bundle.getString("ventanaLogin.BotonRegister.text")); // NOI18N
        BotonRegister.setBorderPainted(false);
        BotonRegister.setContentAreaFilled(false);
        BotonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegisterMouseExited(evt);
            }
        });
        BotonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisterActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonRegister);
        BotonRegister.setBounds(220, 610, 250, 50);
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));

        BannerLogin.setFont(new java.awt.Font("Elephant", 0, 60)); // NOI18N
        BannerLogin.setForeground(new java.awt.Color(0, 0, 0));
        BannerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLogin.setText(bundle.getString("ventanaLogin.BannerLogin.text")); // NOI18N
        BannerLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(BannerLogin);
        BannerLogin.setBounds(120, 130, 460, 160);

        EmailText.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 0));
        EmailText.setText(bundle.getString("ventanaLogin.EmailText.text")); // NOI18N
        EmailText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(EmailText);
        EmailText.setBounds(180, 300, 120, 24);

        PassText.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        PassText.setForeground(new java.awt.Color(0, 0, 0));
        PassText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassText.setText(bundle.getString("ventanaLogin.PassText.text")); // NOI18N
        PassText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(PassText);
        PassText.setBounds(180, 390, 170, 24);

        PanelTransparente.setBackground(new java.awt.Color(255, 255, 255, 80));
        PanelTransparente.setOpaque(true);
        PanelPrincipal.add(PanelTransparente);
        PanelTransparente.setBounds(100, 70, 500, 650);

        ImageIcon imgfondo = new ImageIcon("src/imagenes/Login.png");
        FondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.png"))); // NOI18N
        FondoPanel.setDisabledIcon(null);
        FondoPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        FondoPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        FondoPanel.setOpaque(true);
        FondoPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        PanelPrincipal.add(FondoPanel);
        FondoPanel.setBounds(0, 0, 700, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        String vacios = Usuario.idioma("ventanas/Bundle", "ventanalogin.vacios");
        if (!cajaEmail.getText().isEmpty() || !cajaPass.getText().isEmpty()) {
            if (cajaEmail.getText().contains("@") && cajaEmail.getText().contains(".")) {
                String email = cajaEmail.getText();
                String pass = cajaPass.getText();
                Usuario NewUser = new Usuario();
                Registro reg = new Registro();
                NewUser.setCorreo(email);
                NewUser.setContraseña(pass);
                int result = reg.verificarUsuarioL(NewUser);
                if (result == 1) {
                    reg.Loguearse(NewUser, result);
                    ventanaCalendario calendario = new ventanaCalendario();
                    calendario.setVisible(true);
                    this.dispose();
                } else if (result == 2) {
                    reg.Loguearse(NewUser, result);
                } else {
                    reg.Loguearse(NewUser, result);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, vacios);
        }
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void BotonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisterActionPerformed
        ventanaRegister reg = new ventanaRegister();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegisterActionPerformed

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        ImageIcon equisimg = new ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new ImageIcon(equisimg.getImage().getScaledInstance(53, 53, Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        ImageIcon equisimg = new ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new ImageIcon(equisimg.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void BotonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLoginMouseEntered
        ImageIcon botonimg = new ImageIcon("src/imagenes/boton1.png");
        BotonLogin.setIcon(new ImageIcon(botonimg.getImage().getScaledInstance(258, 203, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BotonLoginMouseEntered

    private void BotonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLoginMouseExited
        ImageIcon botonimg = new ImageIcon("src/imagenes/boton1.png");
        BotonLogin.setIcon(new ImageIcon(botonimg.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));    }//GEN-LAST:event_BotonLoginMouseExited

    private void BotonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegisterMouseEntered
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(258, 203, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BotonRegisterMouseEntered

    private void BotonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegisterMouseExited
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BotonRegisterMouseExited

    private void cajaEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cajaPass.requestFocus();
        }
    }//GEN-LAST:event_cajaEmailKeyReleased

    private void cajaPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPassKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String vacios = Usuario.idioma("ventanas/Bundle", "ventanalogin.vacios");
            if (!cajaEmail.getText().isEmpty() || !cajaPass.getText().isEmpty()) {
                String email = cajaEmail.getText();
                String pass = cajaPass.getText();
                Usuario NewUser = new Usuario();
                Registro reg = new Registro();
                NewUser.setCorreo(email);
                NewUser.setContraseña(pass);
                int result = reg.verificarUsuarioL(NewUser);
                if (result == 1) {
                    reg.Loguearse(NewUser, result);
                    ventanaCalendario calendario = new ventanaCalendario();
                    calendario.setVisible(true);
                    this.dispose();
                } else if (result == 2) {
                    reg.Loguearse(NewUser, result);
                } else {
                    reg.Loguearse(NewUser, result);
                }
            } else {
                JOptionPane.showMessageDialog(this, vacios);
            }
        }
    }//GEN-LAST:event_cajaPassKeyReleased

    private int xx, yy;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerLogin;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonRegister;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel FondoPanel;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel PanelTransparente;
    private javax.swing.JLabel PassText;
    private javax.swing.JLabel benditoPan;
    private javax.swing.JButton botonCerrar;
    private LIB.JTexfieldPH_FielTex cajaEmail;
    private LIB.JTexfieldPH_Password cajaPass;
    // End of variables declaration//GEN-END:variables

}
