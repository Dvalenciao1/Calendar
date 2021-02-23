package ventanas;

import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import ventanas.POO.Usuario;

public class ventanaCalendario extends javax.swing.JFrame {

    private int xx, xy;
    private int xx1, xy1;

    public ventanaCalendario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date fechaActual = new Date();
        rSDateChooser1.setDatoFecha(fechaActual);
        Disable();
    }

    public void Disable() {
        txtAct.setEditable(false);
        txtDesc.setEditable(false);
        btnadd.setEnabled(false);
    }

    public void ActivarComp() {
        txtAct.setEditable(true);
        txtDesc.setEditable(true);
        btnadd.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelizq = new javax.swing.JPanel();
        btnback = new javax.swing.JButton();
        txtDesc = new LIB.JTexfieldPH_FielTex();
        btnadd = new javax.swing.JButton();
        ScrollatInvitado = new javax.swing.JScrollPane();
        atInvitado = new javax.swing.JTextArea();
        botonActividad = new javax.swing.JButton();
        lbInvitado = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        txtAct = new LIB.JTexfieldPH_FielTex();
        botonCerrar = new javax.swing.JButton();
        lbActividad = new javax.swing.JLabel();
        lbADD = new javax.swing.JLabel();
        registroAct = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton04 = new javax.swing.JButton();
        jButton05 = new javax.swing.JButton();
        jButton06 = new javax.swing.JButton();
        jButton07 = new javax.swing.JButton();
        jButton08 = new javax.swing.JButton();
        jButton09 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabelFI = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabel23H = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel0H = new javax.swing.JLabel();
        jLabel1H = new javax.swing.JLabel();
        jLabel2H = new javax.swing.JLabel();
        jLabel3H = new javax.swing.JLabel();
        jLabel4H = new javax.swing.JLabel();
        jLabel5H = new javax.swing.JLabel();
        jLabel6H = new javax.swing.JLabel();
        jLabel7H = new javax.swing.JLabel();
        jLabel8H = new javax.swing.JLabel();
        jLabel9H = new javax.swing.JLabel();
        jLabel10H = new javax.swing.JLabel();
        jLabel11H = new javax.swing.JLabel();
        jLabel12H = new javax.swing.JLabel();
        jLabel13H = new javax.swing.JLabel();
        jLabel14H = new javax.swing.JLabel();
        jLabel15H = new javax.swing.JLabel();
        jLabel16H = new javax.swing.JLabel();
        jLabel17H = new javax.swing.JLabel();
        jLabel18H = new javax.swing.JLabel();
        jLabel19H = new javax.swing.JLabel();
        jLabel20H = new javax.swing.JLabel();
        jLabel21H = new javax.swing.JLabel();
        jLabel22H = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jButton1 = new javax.swing.JButton();
        fondopanelder = new javax.swing.JLabel();
        fondopanelizq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Panelizq.setPreferredSize(new java.awt.Dimension(1400, 700));
        Panelizq.setLayout(null);

        btnback.setBorderPainted(false);
        btnback.setContentAreaFilled(false);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        Panelizq.add(btnback);
        btnback.setBounds(10, 10, 50, 50);
        javax.swing.ImageIcon backimg = new javax.swing.ImageIcon("src/imagenes/cerrar-sesion.png");
        btnback.setIcon(new javax.swing.ImageIcon(backimg.getImage().getScaledInstance(btnback.getWidth(), btnback.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        txtDesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ventanas/Bundle"); // NOI18N
        txtDesc.setPlaceholder(bundle.getString("ventanaCalendario.txtDesc.placeholder")); // NOI18N
        Panelizq.add(txtDesc);
        txtDesc.setBounds(980, 270, 340, 40);

        btnadd.setBorderPainted(false);
        btnadd.setContentAreaFilled(false);
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaddMouseExited(evt);
            }
        });
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        Panelizq.add(btnadd);
        btnadd.setBounds(1210, 460, 40, 40);
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/invitados.png");
        btnadd.setIcon(new javax.swing.ImageIcon(masimg.getImage().getScaledInstance(btnadd.getWidth(),btnadd.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        ScrollatInvitado.setPreferredSize(new java.awt.Dimension(280, 110));

        atInvitado.setEditable(false);
        atInvitado.setColumns(20);
        atInvitado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        atInvitado.setRows(5);
        atInvitado.setAutoscrolls(false);
        atInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        atInvitado.setPreferredSize(new java.awt.Dimension(200, 100));
        ScrollatInvitado.setViewportView(atInvitado);

        Panelizq.add(ScrollatInvitado);
        ScrollatInvitado.setBounds(980, 400, 200, 170);

        botonActividad.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        botonActividad.setForeground(new java.awt.Color(51, 51, 51));
        botonActividad.setText(bundle.getString("ventanaCalendario.botonActividad.text")); // NOI18N
        botonActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActividadActionPerformed(evt);
            }
        });
        Panelizq.add(botonActividad);
        botonActividad.setBounds(990, 600, 370, 70);

        lbInvitado.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbInvitado.setText(bundle.getString("ventanaCalendario.lbInvitado.text")); // NOI18N
        Panelizq.add(lbInvitado);
        lbInvitado.setBounds(980, 340, 130, 32);

        lbDesc.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbDesc.setForeground(new java.awt.Color(255, 255, 255));
        lbDesc.setText(bundle.getString("ventanaCalendario.lbDesc.text")); // NOI18N
        Panelizq.add(lbDesc);
        lbDesc.setBounds(980, 210, 180, 32);

        txtAct.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAct.setPlaceholder(bundle.getString("ventanaCalendario.txtAct.placeholder")); // NOI18N
        Panelizq.add(txtAct);
        txtAct.setBounds(980, 140, 340, 40);

        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Panelizq.add(botonCerrar);
        botonCerrar.setBounds(1340, 10, 50, 50);
        javax.swing.ImageIcon imgequis = new javax.swing.ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new javax.swing.ImageIcon(imgequis.getImage().getScaledInstance(botonCerrar.getWidth(), botonCerrar.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        lbActividad.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbActividad.setForeground(new java.awt.Color(255, 255, 255));
        lbActividad.setText(bundle.getString("ventanaCalendario.lbActividad.text")); // NOI18N
        Panelizq.add(lbActividad);
        lbActividad.setBounds(980, 80, 130, 32);

        lbADD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbADD.setForeground(new java.awt.Color(0, 0, 0));
        lbADD.setText(bundle.getString("ventanaCalendario.lbADD.text")); // NOI18N
        Panelizq.add(lbADD);
        lbADD.setBounds(1260, 470, 120, 19);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 490, 70));

        jButton01.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 490, 70));

        jButton02.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 490, 70));

        jButton03.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 490, 70));

        jButton04.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton04ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 490, 70));

        jButton05.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton05ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton05, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 490, 70));

        jButton06.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton06ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton06, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 490, 70));

        jButton07.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton07ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton07, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 490, 70));

        jButton08.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton08ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton08, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 490, 70));

        jButton09.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton09ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton09, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 490, 70));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 490, 70));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 490, 70));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 490, 70));

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 490, 70));

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 490, 70));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 490, 70));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, 490, 70));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 990, 490, 70));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1060, 490, 70));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1130, 490, 70));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1200, 490, 70));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1270, 490, 70));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1340, 490, 70));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1410, 490, 70));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1480, 490, 70));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1550, 490, 70));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1620, 490, 70));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1690, 490, 70));

        jLabelFI.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        jLabelFI.setForeground(new java.awt.Color(114, 50, 50));
        jLabelFI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFI.setToolTipText(bundle.getString("ventanaCalendario.jLabelFI.toolTipText")); // NOI18N
        jPanel2.add(jLabelFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 360, 60));

        jLabelDia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(114, 50, 50));
        jLabelDia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDia.setText(bundle.getString("ventanaCalendario.jLabelDia.text")); // NOI18N
        jLabelDia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 490, 70));

        jLabel23H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel23H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23H.setText(bundle.getString("ventanaCalendario.jLabel23H.text")); // NOI18N
        jLabel23H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel23H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1690, 150, 70));

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(114, 50, 50));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setText(bundle.getString("ventanaCalendario.jLabelHora.text")); // NOI18N
        jLabelHora.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 70));

        jLabel0H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel0H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel0H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0H.setText(bundle.getString("ventanaCalendario.jLabel0H.text")); // NOI18N
        jLabel0H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel0H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 70));

        jLabel1H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel1H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1H.setText(bundle.getString("ventanaCalendario.jLabel1H.text")); // NOI18N
        jLabel1H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel1H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 70));

        jLabel2H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel2H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2H.setText(bundle.getString("ventanaCalendario.jLabel2H.text")); // NOI18N
        jLabel2H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel2H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 70));

        jLabel3H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel3H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3H.setText(bundle.getString("ventanaCalendario.jLabel3H.text")); // NOI18N
        jLabel3H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel3H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 70));

        jLabel4H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel4H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4H.setText(bundle.getString("ventanaCalendario.jLabel4H.text")); // NOI18N
        jLabel4H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel4H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 70));

        jLabel5H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel5H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5H.setText(bundle.getString("ventanaCalendario.jLabel5H.text")); // NOI18N
        jLabel5H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel5H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 70));

        jLabel6H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel6H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6H.setText(bundle.getString("ventanaCalendario.jLabel6H.text")); // NOI18N
        jLabel6H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel6H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 70));

        jLabel7H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel7H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7H.setText(bundle.getString("ventanaCalendario.jLabel7H.text")); // NOI18N
        jLabel7H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel7H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 70));

        jLabel8H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel8H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8H.setText(bundle.getString("ventanaCalendario.jLabel8H.text")); // NOI18N
        jLabel8H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel8H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 150, 70));

        jLabel9H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel9H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9H.setText(bundle.getString("ventanaCalendario.jLabel9H.text")); // NOI18N
        jLabel9H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel9H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 150, 70));

        jLabel10H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel10H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10H.setText(bundle.getString("ventanaCalendario.jLabel10H.text")); // NOI18N
        jLabel10H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel10H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, 150, 70));

        jLabel11H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel11H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11H.setText(bundle.getString("ventanaCalendario.jLabel11H.text")); // NOI18N
        jLabel11H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel11H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 150, 70));

        jLabel12H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel12H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12H.setText(bundle.getString("ventanaCalendario.jLabel12H.text")); // NOI18N
        jLabel12H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel12H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 150, 70));

        jLabel13H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel13H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13H.setText(bundle.getString("ventanaCalendario.jLabel13H.text")); // NOI18N
        jLabel13H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel13H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 990, 150, 70));

        jLabel14H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel14H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14H.setText(bundle.getString("ventanaCalendario.jLabel14H.text")); // NOI18N
        jLabel14H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel14H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1060, 150, 70));

        jLabel15H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel15H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15H.setText(bundle.getString("ventanaCalendario.jLabel15H.text")); // NOI18N
        jLabel15H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel15H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1130, 150, 70));

        jLabel16H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel16H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16H.setText(bundle.getString("ventanaCalendario.jLabel16H.text")); // NOI18N
        jLabel16H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel16H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1200, 150, 70));

        jLabel17H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel17H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17H.setText(bundle.getString("ventanaCalendario.jLabel17H.text")); // NOI18N
        jLabel17H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel17H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1270, 150, 70));

        jLabel18H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel18H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18H.setText(bundle.getString("ventanaCalendario.jLabel18H.text")); // NOI18N
        jLabel18H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel18H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1340, 150, 70));

        jLabel19H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel19H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19H.setText(bundle.getString("ventanaCalendario.jLabel19H.text")); // NOI18N
        jLabel19H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel19H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1410, 150, 70));

        jLabel20H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel20H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20H.setText(bundle.getString("ventanaCalendario.jLabel20H.text")); // NOI18N
        jLabel20H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel20H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1480, 150, 70));

        jLabel21H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel21H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21H.setText(bundle.getString("ventanaCalendario.jLabel21H.text")); // NOI18N
        jLabel21H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel21H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1550, 150, 70));

        jLabel22H.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22H.setForeground(new java.awt.Color(114, 50, 50));
        jLabel22H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22H.setText(bundle.getString("ventanaCalendario.jLabel22H.text")); // NOI18N
        jLabel22H.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.add(jLabel22H, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1620, 150, 70));

        registroAct.setViewportView(jPanel2);

        Panelizq.add(registroAct);
        registroAct.setBounds(110, 90, 680, 580);

        rSDateChooser1.setPlaceholder(bundle.getString("ventanaCalendario.rSDateChooser1.placeholder")); // NOI18N
        Panelizq.add(rSDateChooser1);
        rSDateChooser1.setBounds(150, 30, 330, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButton1.setText(bundle.getString("ventanaCalendario.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panelizq.add(jButton1);
        jButton1.setBounds(530, 30, 190, 40);

        fondopanelder.setOpaque(true);
        fondopanelder.setPreferredSize(new java.awt.Dimension(950, 0));
        fondopanelder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondopanelderMouseDragged(evt);
            }
        });
        fondopanelder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondopanelderMousePressed(evt);
            }
        });
        Panelizq.add(fondopanelder);
        fondopanelder.setBounds(950, 0, 450, 700);
        javax.swing.ImageIcon panelder = new javax.swing.ImageIcon("src/imagenes/fondo3.png");
        fondopanelder.setIcon(new javax.swing.ImageIcon(panelder.getImage().getScaledInstance(fondopanelder.getWidth(), fondopanelder.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        fondopanelizq.setOpaque(true);
        fondopanelizq.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondopanelizqMouseDragged(evt);
            }
        });
        fondopanelizq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondopanelizqMousePressed(evt);
            }
        });
        Panelizq.add(fondopanelizq);
        fondopanelizq.setBounds(0, 0, 950, 700);
        javax.swing.ImageIcon panelimg = new javax.swing.ImageIcon("src/imagenes/fondo4.png");
        fondopanelizq.setIcon(new javax.swing.ImageIcon(panelimg.getImage().getScaledInstance(fondopanelizq.getWidth(),fondopanelizq.getHeight(), java.awt.Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelizq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelizq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        ventanaLogin lgon = new ventanaLogin();
        lgon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        btnback.setBounds(10, 10, 53, 53);
        javax.swing.ImageIcon backimg = new javax.swing.ImageIcon("src/imagenes/cerrar-sesion.png");
        btnback.setIcon(new javax.swing.ImageIcon(backimg.getImage().getScaledInstance(53, 53, java.awt.Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        btnback.setBounds(10, 10, 50, 50);
        javax.swing.ImageIcon backimg = new javax.swing.ImageIcon("src/imagenes/cerrar-sesion.png");
        btnback.setIcon(new javax.swing.ImageIcon(backimg.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_btnbackMouseExited

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        botonCerrar.setBounds(1340, 10, 53, 53);
        javax.swing.ImageIcon imgequis = new javax.swing.ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new javax.swing.ImageIcon(imgequis.getImage().getScaledInstance(53, 53, java.awt.Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        botonCerrar.setBounds(1340, 10, 50, 50);
        javax.swing.ImageIcon imgequis = new javax.swing.ImageIcon("src/imagenes/cancelar.png");
        botonCerrar.setIcon(new javax.swing.ImageIcon(imgequis.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_botonCerrarMouseExited

    private void fondopanelizqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondopanelizqMousePressed
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            Disable();
            xx = evt.getX();
            xy = evt.getY();
        }
    }//GEN-LAST:event_fondopanelizqMousePressed

    private void fondopanelizqMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondopanelizqMouseDragged
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xx, y - xy);
        }
    }//GEN-LAST:event_fondopanelizqMouseDragged

    private void btnaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseEntered
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/invitados.png");
        btnadd.setBounds(1210, 460, 41, 41);
        btnadd.setIcon(new javax.swing.ImageIcon(masimg.getImage().getScaledInstance(41, 41, java.awt.Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnaddMouseEntered

    private void btnaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseExited
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/invitados.png");
        btnadd.setBounds(1210, 460, 40, 40);
        btnadd.setIcon(new javax.swing.ImageIcon(masimg.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnaddMouseExited
   
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        boolean resultpg = invpg.isShowing();
        if (resultpg == true) {
            String text1 = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.btnAdd");
            JOptionPane.showMessageDialog(this, text1);
        } else {
            invpg.setVisible(true);
            String text = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.setText.invitado");
            invpg.LbEncabezado.setText(text);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void fondopanelderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondopanelderMousePressed
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            Disable();
            xx1 = evt.getX() + 950;
            xy1 = evt.getY();
        }


    }//GEN-LAST:event_fondopanelderMousePressed

    private void fondopanelderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondopanelderMouseDragged
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xx1, y - xy1);
        }
    }//GEN-LAST:event_fondopanelderMouseDragged

    public String fecha() {
        String formato = "dd/MM/YYY";
        Date fecha = rSDateChooser1.getDatoFecha();
        SimpleDateFormat formatofecha = new SimpleDateFormat(formato);
        return formatofecha.format(fecha);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String formato = "dd MMM YYY";
        Date fecha = rSDateChooser1.getDatoFecha();
        SimpleDateFormat formatofecha = new SimpleDateFormat(formato);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton00ActionPerformed

    public void btnesHora() {
        if (fecha() != null) {
            ActivarComp();
        }
    }
    private void botonActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActividadActionPerformed
        String text = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.btnAct");
        String tiltext = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.btnActTilt");
        String text1 = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.txtbtnAct");
        String tiltext1 = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.txtbtnActMSG");
        if (txtAct.isEditable() && txtDesc.isEditable() && btnadd.isEnabled()) {
            Usuario user = new Usuario();
            user.setNameAct(txtAct.getText());
            user.setTextDesc(txtDesc.getText());
            user.setFecha(fecha());
            if (!atInvitado.getText().isEmpty()) {
                String[] cadena = atInvitado.getText().split("-");
                ArrayList<String> invited = new ArrayList<>();
                for (int i = 0; i < cadena.length; i++) {
                    if (!cadena[i].equals("\n")) {
                        invited.add(cadena[i].replace("\n", ""));
                    }
                }
                user.setListaIdinvitados(invited);
            }
        } else if (!txtAct.isEditable() && !txtDesc.isEditable() && !btnadd.isEnabled()) {
            JOptionPane.showMessageDialog(this, text, tiltext, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, text1, tiltext1, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonActividadActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton04ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton04ActionPerformed

    private void jButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton05ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton05ActionPerformed

    private void jButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton06ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton06ActionPerformed

    private void jButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton07ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton07ActionPerformed

    private void jButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton08ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton08ActionPerformed

    private void jButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton09ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton09ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        btnesHora();
    }//GEN-LAST:event_jButton23ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelizq;
    private javax.swing.JScrollPane ScrollatInvitado;
    public static javax.swing.JTextArea atInvitado;
    private javax.swing.JButton botonActividad;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel fondopanelder;
    private javax.swing.JLabel fondopanelizq;
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;
    private javax.swing.JButton jButton05;
    private javax.swing.JButton jButton06;
    private javax.swing.JButton jButton07;
    private javax.swing.JButton jButton08;
    private javax.swing.JButton jButton09;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel0H;
    private javax.swing.JLabel jLabel10H;
    private javax.swing.JLabel jLabel11H;
    private javax.swing.JLabel jLabel12H;
    private javax.swing.JLabel jLabel13H;
    private javax.swing.JLabel jLabel14H;
    private javax.swing.JLabel jLabel15H;
    private javax.swing.JLabel jLabel16H;
    private javax.swing.JLabel jLabel17H;
    private javax.swing.JLabel jLabel18H;
    private javax.swing.JLabel jLabel19H;
    private javax.swing.JLabel jLabel1H;
    private javax.swing.JLabel jLabel20H;
    private javax.swing.JLabel jLabel21H;
    private javax.swing.JLabel jLabel22H;
    private javax.swing.JLabel jLabel23H;
    private javax.swing.JLabel jLabel2H;
    private javax.swing.JLabel jLabel3H;
    private javax.swing.JLabel jLabel4H;
    private javax.swing.JLabel jLabel5H;
    private javax.swing.JLabel jLabel6H;
    private javax.swing.JLabel jLabel7H;
    private javax.swing.JLabel jLabel8H;
    private javax.swing.JLabel jLabel9H;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFI;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbADD;
    private javax.swing.JLabel lbActividad;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbInvitado;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JScrollPane registroAct;
    private LIB.JTexfieldPH_FielTex txtAct;
    private LIB.JTexfieldPH_FielTex txtDesc;
    // End of variables declaration//GEN-END:variables
     private invitados invpg = new invitados();
}
