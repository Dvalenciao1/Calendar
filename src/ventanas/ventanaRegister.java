package ventanas;

import clases.Encriptacion;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.Registro;
import clases.Usuario;

public class ventanaRegister extends javax.swing.JFrame {

    public ventanaRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
        cajaUser.requestFocus();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        BotonRegister = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        BannerLogin = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        PassText = new javax.swing.JLabel();
        cajaEmail = new LIB.JTexfieldPH_FielTex();
        cajaPass = new LIB.JTexfieldPH_Password();
        cajaUser = new LIB.JTexfieldPH_FielTex();
        TextUser = new javax.swing.JLabel();
        PanelTransparente = new javax.swing.JLabel();
        FondoPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 800));

        PanelPrincipal.setLayout(null);

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
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ventanas/Bundle"); // NOI18N
        BotonRegister.setText(bundle.getString("ventanaRegister.BotonRegister.text")); // NOI18N
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
        BotonRegister.setBounds(220, 570, 250, 50);
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));

        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setRequestFocusEnabled(false);
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasMouseExited(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnAtras);
        btnAtras.setBounds(10, 10, 50, 50);
        ImageIcon backimg = new ImageIcon("src/imagenes/previous.png");
        btnAtras.setIcon(new ImageIcon(backimg.getImage().getScaledInstance(btnAtras.getWidth(),btnAtras.getHeight(), Image.SCALE_SMOOTH)));

        BannerLogin.setFont(new java.awt.Font("Elephant", 0, 60)); // NOI18N
        BannerLogin.setForeground(new java.awt.Color(0, 0, 0));
        BannerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLogin.setText(bundle.getString("ventanaRegister.BannerLogin.text")); // NOI18N
        BannerLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BannerLogin.setRequestFocusEnabled(false);
        PanelPrincipal.add(BannerLogin);
        BannerLogin.setBounds(140, 100, 440, 120);

        EmailText.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 0));
        EmailText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailText.setText(bundle.getString("ventanaRegister.EmailText.text")); // NOI18N
        EmailText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmailText.setRequestFocusEnabled(false);
        PanelPrincipal.add(EmailText);
        EmailText.setBounds(180, 330, 99, 24);

        PassText.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        PassText.setForeground(new java.awt.Color(0, 0, 0));
        PassText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassText.setText(bundle.getString("ventanaRegister.PassText.text")); // NOI18N
        PassText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PassText.setRequestFocusEnabled(false);
        PanelPrincipal.add(PassText);
        PassText.setBounds(180, 420, 170, 24);

        cajaEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cajaEmail.setPlaceholder(bundle.getString("ventanaRegister.cajaEmail.placeholder")); // NOI18N
        cajaEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaEmailKeyReleased(evt);
            }
        });
        PanelPrincipal.add(cajaEmail);
        cajaEmail.setBounds(190, 370, 320, 40);

        cajaPass.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cajaPass.setPlaceholder(bundle.getString("ventanaRegister.cajaPass.placeholder")); // NOI18N
        cajaPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaPassKeyReleased(evt);
            }
        });
        PanelPrincipal.add(cajaPass);
        cajaPass.setBounds(190, 460, 320, 40);

        cajaUser.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cajaUser.setPlaceholder(bundle.getString("ventanaRegister.cajaUser.placeholder")); // NOI18N
        cajaUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaUserKeyReleased(evt);
            }
        });
        PanelPrincipal.add(cajaUser);
        cajaUser.setBounds(190, 280, 320, 40);
        cajaUser.setFocusable(true);

        TextUser.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        TextUser.setForeground(new java.awt.Color(0, 0, 0));
        TextUser.setText(bundle.getString("ventanaRegister.TextUser.text")); // NOI18N
        TextUser.setRequestFocusEnabled(false);
        PanelPrincipal.add(TextUser);
        TextUser.setBounds(180, 240, 112, 24);

        PanelTransparente.setBackground(new java.awt.Color(255, 255, 255, 80));
        PanelTransparente.setOpaque(true);
        PanelTransparente.setRequestFocusEnabled(false);
        PanelPrincipal.add(PanelTransparente);
        PanelTransparente.setBounds(100, 70, 500, 650);

        ImageIcon imgfondo = new ImageIcon("src/imagenes/Login.png");
        FondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.png"))); // NOI18N
        FondoPanel.setOpaque(true);
        FondoPanel.setRequestFocusEnabled(false);
        PanelPrincipal.add(FondoPanel);
        FondoPanel.setBounds(0, 0, 700, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisterActionPerformed
        String exito = Usuario.idioma("ventanas/Bundle", "ventanaRegister.exito");
        String pregunta = Usuario.idioma("ventanas/Bundle", "ventanaRegister.pregunta");
        String botonconfirm = Usuario.idioma("ventanas/Bundle", "ventanaRegister.btnconfirm");
        String existeUsuario = Usuario.idioma("ventanas/Bundle", "ventanaRegister.existeusuario");
        String existeCorreo = Usuario.idioma("ventanas/Bundle", "ventanaRegister.existecorreo");
        String vacios = Usuario.idioma("ventanas/Bundle", "ventanalogin.vacios");
        if (!cajaUser.getText().isEmpty() && !cajaEmail.getText().isEmpty() && !cajaPass.getText().isEmpty()) {
            if (cajaEmail.getText().contains("@") && cajaEmail.getText().contains(".")) {
                String User = cajaUser.getText();
                String Email = cajaEmail.getText();
                String Pass = new String(cajaPass.getPassword());
                Registro EnterReg = new Registro();
                Usuario NewUser = new Usuario();
                String nuevopass = Encriptacion.code(Pass);
                NewUser.setUsuario(User);
                NewUser.setCorreo(Email);
                NewUser.setContraseña(nuevopass);
                int result = EnterReg.verificarUsuarioR(NewUser);
                if (result == -1) {
                    cajaEmail.setText("");
                    cajaPass.setText("");
                    cajaUser.setText("");
                    EnterReg.registrar(NewUser);
                    JOptionPane.showMessageDialog(this, exito);
                    int response = JOptionPane.showConfirmDialog(this, pregunta, botonconfirm, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response != JOptionPane.YES_OPTION) {
                        ventanaLogin log = new ventanaLogin();
                        log.setVisible(true);
                        this.dispose();
                    }
                } else if (result == 1) {
                    cajaEmail.setText("");
                    cajaPass.setText("");
                    cajaUser.setText("");
                    JOptionPane.showMessageDialog(null, existeUsuario);
                } else if (result == 2) {
                    cajaEmail.setText("");
                    cajaPass.setText("");
                    cajaUser.setText("");
                    JOptionPane.showMessageDialog(null, existeCorreo);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, vacios);
        }
    }//GEN-LAST:event_BotonRegisterActionPerformed

    private void BotonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegisterMouseEntered
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(258, 203, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BotonRegisterMouseEntered

    private void BotonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegisterMouseExited
        ImageIcon regimgb = new ImageIcon("src/imagenes/boton1.png");
        BotonRegister.setIcon(new ImageIcon(regimgb.getImage().getScaledInstance(255, 200, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BotonRegisterMouseExited

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        ImageIcon equisimg = new ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new ImageIcon(equisimg.getImage().getScaledInstance(53, 53, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        ImageIcon equisimg = new ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new ImageIcon(equisimg.getImage().getScaledInstance(botonCerrar.getWidth(), botonCerrar.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered
        ImageIcon backimg = new ImageIcon("src/imagenes/previous.png");
        btnAtras.setBounds(10, 10, 53, 53);
        btnAtras.setIcon(new ImageIcon(backimg.getImage().getScaledInstance(53, 53, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnAtrasMouseEntered

    private void btnAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseExited
        ImageIcon backimg = new ImageIcon("src/imagenes/previous.png");
        btnAtras.setBounds(10, 10, 53, 53);
        btnAtras.setIcon(new ImageIcon(backimg.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnAtrasMouseExited

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaLogin atras = new ventanaLogin();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cajaUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUserKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cajaEmail.requestFocus();
        }
    }//GEN-LAST:event_cajaUserKeyReleased

    private void cajaEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cajaPass.requestFocus();
        }
    }//GEN-LAST:event_cajaEmailKeyReleased

    private void cajaPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPassKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String exito = Usuario.idioma("ventanas/Bundle", "ventanaRegister.exito");
            String pregunta = Usuario.idioma("ventanas/Bundle", "ventanaRegister.pregunta");
            String botonconfirm = Usuario.idioma("ventanas/Bundle", "ventanaRegister.btnconfirm");
            String existeUsuario = Usuario.idioma("ventanas/Bundle", "ventanaRegister.existeusuario");
            String existeCorreo = Usuario.idioma("ventanas/Bundle", "ventanaRegister.existecorreo");
            String vacios = Usuario.idioma("ventanas/Bundle", "ventanalogin.vacios");
            if (!cajaUser.getText().isEmpty() && !cajaEmail.getText().isEmpty() && !cajaPass.getText().isEmpty()) {
                if (cajaEmail.getText().contains("@") && cajaEmail.getText().contains(".")) {
                    String User = cajaUser.getText();
                    String Email = cajaEmail.getText();
                    String Pass = new String(cajaPass.getPassword());
                    Registro EnterReg = new Registro();
                    Usuario NewUser = new Usuario();
                    String nuevopass = Encriptacion.code(Pass);
                    NewUser.setUsuario(User);
                    NewUser.setCorreo(Email);
                    NewUser.setContraseña(nuevopass);
                    int result = EnterReg.verificarUsuarioR(NewUser);
                    if (result == -1) {
                        cajaEmail.setText("");
                        cajaPass.setText("");
                        cajaUser.setText("");
                        EnterReg.registrar(NewUser);
                        JOptionPane.showMessageDialog(this, exito);
                        int response = JOptionPane.showConfirmDialog(this, pregunta, botonconfirm, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (response != JOptionPane.YES_OPTION) {
                            ventanaLogin log = new ventanaLogin();
                            log.setVisible(true);
                            this.dispose();
                        }
                    } else if (result == 1) {
                        cajaEmail.setText("");
                        cajaPass.setText("");
                        cajaUser.setText("");
                        JOptionPane.showMessageDialog(null, existeUsuario);
                    } else if (result == 2) {
                        cajaEmail.setText("");
                        cajaPass.setText("");
                        cajaUser.setText("");
                        JOptionPane.showMessageDialog(null, existeCorreo);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, vacios);
            }
        }
    }//GEN-LAST:event_cajaPassKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerLogin;
    private javax.swing.JButton BotonRegister;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel FondoPanel;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel PanelTransparente;
    private javax.swing.JLabel PassText;
    private javax.swing.JLabel TextUser;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton btnAtras;
    private LIB.JTexfieldPH_FielTex cajaEmail;
    private LIB.JTexfieldPH_Password cajaPass;
    private LIB.JTexfieldPH_FielTex cajaUser;
    // End of variables declaration//GEN-END:variables
}
