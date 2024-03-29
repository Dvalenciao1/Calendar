package ventanas;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import clases.Registro;

public class invitados extends javax.swing.JFrame {
    
    //Personaliza el jtable para poder ingresar los datos correctamente
    public invitados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitar.png")).getImage());
        reg.tableUpdate(lista);
        addCheck(2, lista);
        lista.setAutoscrolls(true);
        lista.setOpaque(true);
        lista.getColumnModel().getColumn(0).setPreferredWidth(10);
        lista.getColumnModel().getColumn(0).setResizable(false);
        lista.getColumnModel().getColumn(1).setPreferredWidth(50);
        lista.getColumnModel().getColumn(1).setResizable(false);
        lista.getColumnModel().getColumn(2).setPreferredWidth(1);
        lista.getColumnModel().getColumn(2).setResizable(false);
        lista.setCellSelectionEnabled(true);
        lista.setRowHeight(22);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbEncabezado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));
        jPanel1.setLayout(null);

        LbEncabezado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LbEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ventanas/Bundle"); // NOI18N
        LbEncabezado.setText(bundle.getString("invitados.LbEncabezado.text")); // NOI18N
        jPanel1.add(LbEncabezado);
        LbEncabezado.setBounds(50, 40, 290, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText(bundle.getString("invitados.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 382, 120, 33);

        btncerrar.setToolTipText(bundle.getString("invitados.btncerrar.toolTipText")); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncerrarMouseExited(evt);
            }
        });
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar);
        btncerrar.setBounds(540, 10, 50, 50);
        javax.swing.ImageIcon cerrarimg = new javax.swing.ImageIcon("src/imagenes/cancelar.png");
        btncerrar.setIcon(new javax.swing.ImageIcon(cerrarimg.getImage().getScaledInstance(btncerrar.getWidth(),btncerrar.getHeight(),java.awt.Image.SCALE_SMOOTH)));

        lista = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex!=2 && colIndex!=4 && colIndex!=7){
                    return false;
                }else {
                    return true;
                }
            }
        };
        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        lista.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(lista);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 490, 160);

        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 600, 432);
        javax.swing.ImageIcon fondoprin = new javax.swing.ImageIcon("src/imagenes/fondodeari1.png");
        fondo.setIcon(new javax.swing.ImageIcon(fondoprin.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),java.awt.Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cierra solo la ventana sin detener el programa y desmarca los checkbox
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();
        for (int i = 0; i < lista.getRowCount(); i++) {
            lista.setValueAt(false, i, 2);
        }
        lista.clearSelection();
    }//GEN-LAST:event_btncerrarActionPerformed

    //guarda en una lista los usuarios para agregarlos al textarea de la ventana de calendario
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < lista.getRowCount(); i++) {
            if (isSelect(i, 2, lista) == true) {
                String name = column(i, 0, lista);
                names.add("- " + name);
            }
        }
        String cadenafinal = String.join("\n", names);
        ventanaCalendario.atInvitado.setText("\n" + cadenafinal);
        for (int i = 0; i < lista.getRowCount(); i++) {
            lista.setValueAt(false, i, 2);
        }
        lista.clearSelection();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //permite mover la ventana manteniendo presionado
    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            xx = evt.getX();
            yy = evt.getY();
        }
    }//GEN-LAST:event_fondoMousePressed

    //permite reubicar la ventana 
    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            int x, y;
            x = evt.getXOnScreen();
            y = evt.getYOnScreen();
            this.setLocation(x - xx, y - yy);
        }
    }//GEN-LAST:event_fondoMouseDragged

    //Efecto hover entered
    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered
        ImageIcon closeimg = new ImageIcon("src/imagenes/cancelar.png");
        btncerrar.setBounds(540, 10, 53, 53);
        btncerrar.setIcon(new ImageIcon(closeimg.getImage().getScaledInstance(btncerrar.getWidth(), btncerrar.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btncerrarMouseEntered

    //Efecto hover exited
    private void btncerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseExited
        ImageIcon closeimg = new ImageIcon("src/imagenes/cancelar.png");
        btncerrar.setBounds(540, 10, 50, 50);
        btncerrar.setIcon(new ImageIcon(closeimg.getImage().getScaledInstance(btncerrar.getWidth(), btncerrar.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btncerrarMouseExited

    //Añade checkbox en el jtable
    public void addCheck(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }

    //valida si los checkbox estan seleccionados si ese es el caso devuelve como valor true
    public boolean isSelect(int row, int colum, JTable table) {
        if (table.getValueAt(row, colum) != null) {
            boolean s = Boolean.parseBoolean(table.getValueAt(row, colum).toString());
            return s;
        } else {
            return false;
        }
    }
    
    //junto al metodo addcheckbox añaden al jtable un checkbox en cierta columna y cierta fila especificando la variable del jtable
    public String column(int row, int colum, JTable table) {
        String name = table.getValueAt(row, colum).toString();
        return name;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel LbEncabezado;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    // End of variables declaration//GEN-END:variables
    private Registro reg = new Registro();
    int xx, yy;
}
