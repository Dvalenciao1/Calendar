package ventanas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import clases.Registro;
import clases.Usuario;

public class ventanaCalendario extends javax.swing.JFrame implements Runnable {

    private String horas, amp;
    private int Horabtn;
    private Thread h1;
    private int xx, xy;
    private int xx1, xy1;

    public ventanaCalendario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png")).getImage());
        h1 = new Thread(this);
        h1.start();
        agregarTooltip();
        Disable();
        cargarActividades();

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
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        select1 = new javax.swing.JButton();
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
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/opciones.png");
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
        lbADD.setForeground(new java.awt.Color(255, 255, 255));
        lbADD.setText(bundle.getString("ventanaCalendario.lbADD.text")); // NOI18N
        Panelizq.add(lbADD);
        lbADD.setBounds(1260, 470, 120, 19);

        rSDateChooser1.setPlaceholder(bundle.getString("ventanaCalendario.rSDateChooser1.placeholder")); // NOI18N
        Panelizq.add(rSDateChooser1);
        rSDateChooser1.setBounds(150, 30, 330, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton00.setBackground(new java.awt.Color(238, 238, 238));
        jButton00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton00.setText(bundle.getString("ventanaCalendario.jButton00.text")); // NOI18N
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 490, 70));

        jButton01.setBackground(new java.awt.Color(238, 238, 238));
        jButton01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 490, 70));

        jButton02.setBackground(new java.awt.Color(238, 238, 238));
        jButton02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 490, 70));

        jButton03.setBackground(new java.awt.Color(238, 238, 238));
        jButton03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton03, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 490, 70));

        jButton04.setBackground(new java.awt.Color(238, 238, 238));
        jButton04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton04ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton04, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 490, 70));

        jButton05.setBackground(new java.awt.Color(238, 238, 238));
        jButton05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton05ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton05, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 490, 70));

        jButton06.setBackground(new java.awt.Color(238, 238, 238));
        jButton06.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton06ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton06, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 490, 70));

        jButton07.setBackground(new java.awt.Color(238, 238, 238));
        jButton07.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton07ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton07, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 490, 70));

        jButton08.setBackground(new java.awt.Color(238, 238, 238));
        jButton08.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton08ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton08, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 490, 70));

        jButton09.setBackground(new java.awt.Color(238, 238, 238));
        jButton09.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton09ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton09, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 490, 70));

        jButton10.setBackground(new java.awt.Color(238, 238, 238));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 490, 70));

        jButton11.setBackground(new java.awt.Color(238, 238, 238));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 490, 70));

        jButton12.setBackground(new java.awt.Color(238, 238, 238));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, 490, 70));

        jButton13.setBackground(new java.awt.Color(238, 238, 238));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 990, 490, 70));

        jButton14.setBackground(new java.awt.Color(238, 238, 238));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1060, 490, 70));

        jButton15.setBackground(new java.awt.Color(238, 238, 238));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1130, 490, 70));

        jButton16.setBackground(new java.awt.Color(238, 238, 238));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1200, 490, 70));

        jButton17.setBackground(new java.awt.Color(238, 238, 238));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1270, 490, 70));

        jButton18.setBackground(new java.awt.Color(238, 238, 238));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1340, 490, 70));

        jButton19.setBackground(new java.awt.Color(238, 238, 238));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1410, 490, 70));

        jButton20.setBackground(new java.awt.Color(238, 238, 238));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1480, 490, 70));

        jButton21.setBackground(new java.awt.Color(238, 238, 238));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1550, 490, 70));

        jButton22.setBackground(new java.awt.Color(238, 238, 238));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1620, 490, 70));

        jButton23.setBackground(new java.awt.Color(238, 238, 238));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jScrollPane1.setViewportView(jPanel2);

        Panelizq.add(jScrollPane1);
        jScrollPane1.setBounds(120, 90, 680, 560);

        select1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        select1.setText(bundle.getString("ventanaCalendario.select1.text")); // NOI18N
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });
        Panelizq.add(select1);
        select1.setBounds(530, 30, 190, 40);

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
        javax.swing.ImageIcon panelder = new javax.swing.ImageIcon("src/imagenes/fondodeari3.png");
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
        javax.swing.ImageIcon panelimg = new javax.swing.ImageIcon("src/imagenes/fondodeari2.png");
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
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/opciones.png");
        btnadd.setBounds(1210, 460, 41, 41);
        btnadd.setIcon(new javax.swing.ImageIcon(masimg.getImage().getScaledInstance(41, 41, java.awt.Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnaddMouseEntered

    private void btnaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseExited
        javax.swing.ImageIcon masimg = new javax.swing.ImageIcon("src/imagenes/opciones.png");
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

    //Recoge la fecha ingresada en el datechooser
    public String fecha() {
        String formato = "dd/MM/YYY";
        Date fecha = rSDateChooser1.getDatoFecha();
        SimpleDateFormat formatofecha = new SimpleDateFormat(formato);
        return formatofecha.format(fecha);
    }

    public void setHora(int Hora) {
        this.Horabtn = Hora;
    }

    private void botonActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActividadActionPerformed
        String text = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.btnAct");
        String tiltext = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.btnActTilt");
        String text1 = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.txtbtnAct");
        String tiltext1 = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.JOptionpane.txtbtnActMSG");
        String invittext = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.jbuton.txt");
        if (txtAct.isEditable() && txtDesc.isEditable() && btnadd.isEnabled()) {
            Registro reg = new Registro();
            Usuario user = new Usuario();
            user.setNameAct(txtAct.getText());
            user.setTextDesc(txtDesc.getText());
            user.setHora(Horabtn);
            user.setFecha(fecha());
            if (!atInvitado.getText().isEmpty()) {
                String[] cadena = atInvitado.getText().split("-");
                ArrayList<String> invited = new ArrayList<>();
                for (int i = 0; i < cadena.length; i++) {
                    if (!cadena[i].equals("\n")) {
                        invited.add(cadena[i].replace("\n", "").replace(" ", ""));
                    }
                }
                Usuario.enviarCorreo(reg.busquedadeCorreo(invited));
                user.setListaIdinvitados(reg.busquedaIdxUsuario(invited));
                if (!user.getListaIdinvitados().isEmpty()) {
                    reg.registrarActividad(user);
                    bloquearBoton("<" + "html" + ">" + user.getNameAct() + "<" + "br" + ">" + user.getTextDesc() + "<" + "br" + ">" + invittext + "" + invited + "<!--" + "html" + "-->", Horabtn, Color.GREEN);
                    txtAct.setText("");
                    txtDesc.setText("");
                    atInvitado.setText("");
                }
            }
        } else if (!txtAct.isEditable() && !txtDesc.isEditable() && !btnadd.isEnabled()) {
            JOptionPane.showMessageDialog(this, text, tiltext, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, text1, tiltext1, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonActividadActionPerformed

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        setHora(0);
        if (bot0 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        setHora(1);
        if (bot1 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        setHora(2);
        if (bot2 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        setHora(3);
        if (bot3 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton04ActionPerformed
        setHora(4);
        if (bot4 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton04ActionPerformed

    private void jButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton05ActionPerformed
        setHora(5);
        if (bot5 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton05ActionPerformed

    private void jButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton06ActionPerformed
        setHora(6);
        if (bot6 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton06ActionPerformed

    private void jButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton07ActionPerformed
        setHora(7);
        if (bot7 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton07ActionPerformed

    private void jButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton08ActionPerformed
        setHora(8);
        if (bot8 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton08ActionPerformed

    private void jButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton09ActionPerformed
        setHora(9);
        if (bot9 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton09ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setHora(10);
        if (bot10 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setHora(11);
        if (bot11 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        setHora(12);
        if (bot12 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        setHora(13);
        if (bot13 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        setHora(14);
        if (bot14 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        setHora(15);
        if (bot15 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        setHora(16);
        if (bot16 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        setHora(17);
        if (bot17 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        setHora(18);
        if (bot18 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        setHora(19);
        if (bot19 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        setHora(20);
        if (bot20 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        setHora(21);
        if (bot21 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        setHora(22);
        if (bot22 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        setHora(23);
        if (bot23 == false) {
            limpiarActividad();
            ActivarComp();
        } else {
            suprimirActividad();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        restablecer();
        cambiarFecha();
        returnFalsebtn();
    }//GEN-LAST:event_select1ActionPerformed

    public void limpiarActividad() {
        txtAct.setText("");
        txtDesc.setText("");
        atInvitado.setText("");
    }

    public void bloquearBoton(String titulo, int hor, Color color) {
        if (hor == 0) {
            jButton00.setText(titulo);
            jButton00.setBackground(color);
            bot0 = true;

        }
        if (hor == 1) {
            jButton01.setText(titulo);
            jButton01.setBackground(color);
            bot1 = true;
        }
        if (hor == 2) {
            jButton02.setText(titulo);
            jButton02.setBackground(color);
            bot2 = true;
        }
        if (hor == 3) {
            jButton03.setText(titulo);
            jButton03.setBackground(color);
            bot3 = true;
        }
        if (hor == 4) {
            jButton04.setText(titulo);
            jButton04.setBackground(color);
            bot4 = true;
        }
        if (hor == 5) {
            jButton05.setText(titulo);
            jButton05.setBackground(color);
            bot5 = true;
        }
        if (hor == 6) {
            jButton06.setText(titulo);
            jButton06.setBackground(color);
            bot6 = true;
        }
        if (hor == 7) {
            jButton07.setText(titulo);
            jButton07.setBackground(color);
            bot7 = true;
        }
        if (hor == 8) {
            jButton08.setText(titulo);
            jButton08.setBackground(color);
            bot8 = true;
        }
        if (hor == 9) {
            jButton09.setText(titulo);
            jButton09.setBackground(color);
            bot9 = true;
        }
        if (hor == 10) {
            jButton10.setText(titulo);
            jButton10.setBackground(color);
            bot10 = true;
        }
        if (hor == 11) {
            jButton11.setText(titulo);
            jButton11.setBackground(color);
            bot11 = true;
        }
        if (hor == 12) {
            jButton12.setText(titulo);
            jButton12.setBackground(color);
            bot12 = true;
        }
        if (hor == 13) {
            jButton13.setText(titulo);
            jButton13.setBackground(color);
            bot13 = true;
        }
        if (hor == 14) {
            jButton14.setText(titulo);
            jButton14.setBackground(color);
            bot14 = true;
        }
        if (hor == 15) {
            jButton15.setText(titulo);
            jButton15.setBackground(color);
            bot15 = true;
        }
        if (hor == 16) {
            jButton16.setText(titulo);
            jButton16.setBackground(color);
            bot16 = true;
        }
        if (hor == 17) {
            jButton17.setText(titulo);
            jButton17.setBackground(color);
            bot17 = true;
        }
        if (hor == 18) {
            jButton18.setText(titulo);
            jButton18.setBackground(color);
            bot18 = true;
        }
        if (hor == 19) {
            jButton19.setText(titulo);
            jButton19.setBackground(color);
            bot19 = true;
        }
        if (hor == 20) {
            jButton20.setText(titulo);
            jButton20.setBackground(color);
            bot20 = true;
        }
        if (hor == 21) {
            jButton21.setText(titulo);
            jButton21.setBackground(color);
            bot21 = true;
        }
        if (hor == 22) {
            jButton22.setText(titulo);
            jButton22.setBackground(color);
            bot22 = true;
        }
        if (hor == 23) {
            jButton23.setText(titulo);
            jButton23.setBackground(color);
            bot23 = true;
        }
    }

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbADD;
    private javax.swing.JLabel lbActividad;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbInvitado;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JButton select1;
    private LIB.JTexfieldPH_FielTex txtAct;
    private LIB.JTexfieldPH_FielTex txtDesc;
    // End of variables declaration//GEN-END:variables
    private invitados invpg = new invitados();
    private Boolean bot0 = false, bot1 = false, bot2 = false, bot3 = false, bot4 = false, bot5 = false, bot6 = false, bot7 = false, bot8 = false, bot9 = false, bot10 = false, bot11 = false, bot12 = false, bot13 = false, bot14 = false, bot15 = false, bot16 = false, bot17 = false, bot18 = false, bot19 = false, bot20 = false, bot21 = false, bot22 = false, bot23 = false;

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            if (notificar(horas) == true) {
                restablecer();
                cambiarFecha();
                returnFalsebtn();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public void agregarTooltip() {
        String add = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.tooltiptxt.Añadir");
        jButton00.setToolTipText(add);
        jButton01.setToolTipText(add);
        jButton02.setToolTipText(add);
        jButton03.setToolTipText(add);
        jButton05.setToolTipText(add);
        jButton06.setToolTipText(add);
        jButton07.setToolTipText(add);
        jButton08.setToolTipText(add);
        jButton09.setToolTipText(add);
        jButton10.setToolTipText(add);
        jButton11.setToolTipText(add);
        jButton12.setToolTipText(add);
        jButton13.setToolTipText(add);
        jButton14.setToolTipText(add);
        jButton15.setToolTipText(add);
        jButton16.setToolTipText(add);
        jButton17.setToolTipText(add);
        jButton18.setToolTipText(add);
        jButton19.setToolTipText(add);
        jButton20.setToolTipText(add);
        jButton21.setToolTipText(add);
        jButton22.setToolTipText(add);
        jButton23.setToolTipText(add);
    }

    public void cargarActividades() {
        String formato = "dd/MM/YYY";
        Date fechaActual = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat(formato);
        rSDateChooser1.setDatoFecha(fechaActual);
        String invittext = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.jbuton.txt");
        Registro reg = new Registro();
        String cantidadActividades = reg.countRow();//Cantidad de Actividades en la base de datos
        String cantidadusr;//Cantidad de usuarios
        String[][] nuevalista = reg.guardarAct(cantidadActividades);
        for (int i = 0; i < nuevalista.length; i++) {
            cantidadusr = reg.countRowReg(nuevalista[i][2]);
            String[][] nuevalistacorreo = reg.busquedaUsuariosxId(nuevalista[i][2], cantidadusr);
            String cadenainv = "";
            String[] arrayinvitados = new String[Integer.parseInt(cantidadusr)];
            if (i < nuevalistacorreo.length) {
                for (int j = 0; j < Integer.parseInt(cantidadusr); j++) {
                    if (nuevalistacorreo[j][0] != null) {
                        ArrayList<String> arreglofinal = new ArrayList<>();
                        cadenainv += nuevalistacorreo[j][0] + ",";
                        arrayinvitados = cadenainv.split(",");
                        for (int k = 0; k < arrayinvitados.length; k++) {
                            arreglofinal.add(arrayinvitados[k]);
                        }
                        for (int jm = 0; jm < nuevalista[i].length; jm++) {
                            if (nuevalista[i][3].equals(formatofecha.format(fechaActual))) {
                                bloquearBoton("<" + "html" + ">" + nuevalista[i][0] + "<" + "br" + ">" + nuevalista[i][1] + "<" + "br" + ">" + invittext + " " + arreglofinal.toString() + "<!--" + "html" + "-->", Integer.parseInt(nuevalista[i][4]), Color.GREEN);

                            }
                        }
                    }
                }
            }
        }
    }

    public void cambiarFecha() {
        Registro reg = new Registro();
        String cantidadActividades = reg.countRow();//Cantidad de Actividades en la base de datos
        String cantidadusr;//Cantidad de usuarios
        String[][] nuevalista = reg.guardarAct(cantidadActividades);
        String invittext = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.jbuton.txt");
        for (int i = 0; i < nuevalista.length; i++) {
            cantidadusr = reg.countRowReg(nuevalista[i][2]);
            String[][] nuevalistacorreo = reg.busquedaUsuariosxId(nuevalista[i][2], cantidadusr);
            String cadenainv = "";
            String[] arrayinvitados = new String[Integer.parseInt(cantidadusr)];
            if (i < nuevalistacorreo.length) {
                for (int j = 0; j < Integer.parseInt(cantidadusr); j++) {
                    if (nuevalistacorreo[j][0] != null) {
                        ArrayList<String> arreglofinal = new ArrayList<>();
                        cadenainv += nuevalistacorreo[j][0] + ",";
                        arrayinvitados = cadenainv.split(",");
                        for (int k = 0; k < arrayinvitados.length; k++) {
                            arreglofinal.add(arrayinvitados[k]);
                        }
                        for (int jm = 0; jm < nuevalista[i].length; jm++) {
                            if (nuevalista[i][3].equals(fecha())) {
                                bloquearBoton("<" + "html" + ">" + nuevalista[i][0] + "<" + "br" + ">" + nuevalista[i][1] + "<" + "br" + ">" + invittext + " " + arreglofinal.toString() + "<!--" + "html" + "-->", Integer.parseInt(nuevalista[i][4]), Color.GREEN);
                            }
                        }
                    }
                }
            }
        }
    }

    public void restablecer() {
        jButton00.setEnabled(true);
        jButton00.setText("");
        jButton00.setBackground(new Color(238, 238, 238));
        jButton01.setText("");
        jButton01.setBackground(new Color(238, 238, 238));
        jButton01.setEnabled(true);
        jButton02.setEnabled(true);
        jButton02.setText("");
        jButton02.setBackground(new Color(238, 238, 238));
        jButton03.setText("");
        jButton03.setBackground(new Color(238, 238, 238));
        jButton03.setEnabled(true);
        jButton04.setText("");
        jButton04.setBackground(new Color(238, 238, 238));
        jButton04.setEnabled(true);
        jButton05.setText("");
        jButton05.setBackground(new Color(238, 238, 238));
        jButton05.setEnabled(true);
        jButton06.setText("");
        jButton06.setBackground(new Color(238, 238, 238));
        jButton06.setEnabled(true);
        jButton07.setText("");
        jButton07.setBackground(new Color(238, 238, 238));
        jButton07.setEnabled(true);
        jButton08.setText("");
        jButton08.setBackground(new Color(238, 238, 238));
        jButton08.setEnabled(true);
        jButton09.setText("");
        jButton09.setBackground(new Color(238, 238, 238));
        jButton09.setEnabled(true);
        jButton10.setText("");
        jButton10.setBackground(new Color(238, 238, 238));
        jButton10.setEnabled(true);
        jButton11.setText("");
        jButton11.setBackground(new Color(238, 238, 238));
        jButton11.setEnabled(true);
        jButton12.setText("");
        jButton12.setBackground(new Color(238, 238, 238));
        jButton12.setEnabled(true);
        jButton13.setText("");
        jButton13.setBackground(new Color(238, 238, 238));
        jButton13.setEnabled(true);
        jButton14.setText("");
        jButton14.setBackground(new Color(238, 238, 238));
        jButton14.setEnabled(true);
        jButton15.setText("");
        jButton15.setBackground(new Color(238, 238, 238));
        jButton15.setEnabled(true);
        jButton16.setText("");
        jButton16.setBackground(new Color(238, 238, 238));
        jButton16.setEnabled(true);
        jButton17.setText("");
        jButton17.setBackground(new Color(238, 238, 238));
        jButton17.setEnabled(true);
        jButton18.setText("");
        jButton18.setBackground(new Color(238, 238, 238));
        jButton18.setEnabled(true);
        jButton19.setText("");
        jButton19.setBackground(new Color(238, 238, 238));
        jButton19.setEnabled(true);
        jButton20.setText("");
        jButton20.setBackground(new Color(238, 238, 238));
        jButton20.setEnabled(true);
        jButton21.setText("");
        jButton21.setBackground(new Color(238, 238, 238));
        jButton21.setEnabled(true);
        jButton22.setText("");
        jButton22.setBackground(new Color(238, 238, 238));
        jButton22.setEnabled(true);
        jButton23.setText("");
        jButton23.setBackground(new Color(238, 238, 238));
        jButton23.setEnabled(true);
    }

    public void suprimirActividad() {
        String txtdelete = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.txtDelete.JoptionPane");
        String txtconfirm = Usuario.idioma("ventanas/Bundle", "ventanaCalendario.txtconfirm.JoptionPane");
        int response = JOptionPane.showConfirmDialog(null, txtdelete, txtconfirm, JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            Registro reg = new Registro();
            reg.EliminarEvt(reg.idEvento(fecha(), Horabtn));
            restablecer();
            cambiarFecha();
            switch (Horabtn) {
                case 0:
                    bot0 = false;
                    break;
                case 1:
                    bot1 = false;
                    break;
                case 2:
                    bot2 = false;
                    break;
                case 3:
                    bot3 = false;
                    break;
                case 4:
                    bot4 = false;
                    break;
                case 5:
                    bot5 = false;
                    break;
                case 6:
                    bot6 = false;
                    break;
                case 7:
                    bot7 = false;
                    break;
                case 8:
                    bot8 = false;
                    break;
                case 9:
                    bot9 = false;
                    break;
                case 10:
                    bot10 = false;
                    break;
                case 11:
                    bot11 = false;
                    break;
                case 12:
                    bot12 = false;
                    break;
                case 13:
                    bot13 = false;
                    break;
                case 14:
                    bot14 = false;
                    break;
                case 15:
                    bot15 = false;
                    break;
                case 16:
                    bot16 = false;
                    break;
                case 17:
                    bot17 = false;
                    break;
                case 18:
                    bot18 = false;
                    break;
                case 19:
                    bot19 = false;
                    break;
                case 20:
                    bot20 = false;
                    break;
                case 21:
                    bot21 = false;
                    break;
                case 22:
                    bot22 = false;
                    break;
                case 23:
                    bot23 = false;
                    break;
                default:
                    System.out.println("La hora no esta definida");
                    break;
            }

        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechahoraactual = new Date();
        calendario.setTime(fechahoraactual);
        amp = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (amp.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);
            horas = h > 9 ? "" + h : "0" + h;
        } else {
            horas = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
    }

    public void returnFalsebtn() {
        if (jButton00.getText().isEmpty()) {
            bot0 = false;
        }
        if (jButton01.getText().isEmpty()) {
            bot1 = false;
        }
        if (jButton02.getText().isEmpty()) {
            bot2 = false;
        }
        if (jButton03.getText().isEmpty()) {
            bot3 = false;
        }
        if (jButton04.getText().isEmpty()) {
            bot4 = false;
        }
        if (jButton05.getText().isEmpty()) {
            bot5 = false;
        }
        if (jButton06.getText().isEmpty()) {
            bot6 = false;
        }
        if (jButton07.getText().isEmpty()) {
            bot7 = false;
        }
        if (jButton08.getText().isEmpty()) {
            bot8 = false;
        }
        if (jButton09.getText().isEmpty()) {
            bot9 = false;
        }
        if (jButton10.getText().isEmpty()) {
            bot10 = false;
        }
        if (jButton11.getText().isEmpty()) {
            bot11 = false;
        }
        if (jButton12.getText().isEmpty()) {
            bot12 = false;
        }
        if (jButton13.getText().isEmpty()) {
            bot13 = false;
        }
        if (jButton14.getText().isEmpty()) {
            bot14 = false;
        }
        if (jButton15.getText().isEmpty()) {
            bot15 = false;
        }
        if (jButton16.getText().isEmpty()) {
            bot16 = false;
        }
        if (jButton17.getText().isEmpty()) {
            bot17 = false;
        }
        if (jButton18.getText().isEmpty()) {
            bot18 = false;
        }
        if (jButton19.getText().isEmpty()) {
            bot19 = false;
        }
        if (jButton20.getText().isEmpty()) {
            bot20 = false;
        }
        if (jButton21.getText().isEmpty()) {
            bot21 = false;
        }
        if (jButton22.getText().isEmpty()) {
            bot22 = false;
        }
        if (jButton23.getText().isEmpty()) {
            bot23 = false;
        }
    }

    public boolean notificar(String hora) {
        String formato = "dd/MM/YYY";
        Date fechaActual = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat(formato);
        Registro reg = new Registro();
        int horaactual = Integer.parseInt(hora);
        if (reg.buscarEvt(formatofecha.format(fechaActual), horaactual)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void holamundo() {
        System.out.println("Hola"
                + "mundo"
                + "by daniel");
    }
}