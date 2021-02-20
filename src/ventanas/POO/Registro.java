package ventanas.POO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro extends SQL {

    public boolean registrar(Usuario usr) {
        PreparedStatement ps = null;
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql = "INSERT INTO registro(User, Email, Pass)values(?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getCorreo());
            ps.setString(3, usr.getContraseña());
            ps.execute();
            conexion.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public int verificarUsuarioR(Usuario usr) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String user = rs.getString(2);
                String correo = rs.getString(3);
                if (usr.getUsuario().equals(user)) {
                    conexion.close();
                    return 1;
                } else if (usr.getCorreo().equals(correo)) {
                    conexion.close();
                    return 2;
                }
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);
        }
        return -1;
    }

    public int verificarUsuarioL(Usuario usr) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String userid = rs.getString(1);
                String user = rs.getString(2);
                String correo = rs.getString(3);
                String contraseña = rs.getString(4);
                if (usr.getCorreo().equals(correo) && usr.getContraseña().equals(contraseña)) {
                    usr.setUsuario(user);
                    usr.setIduser(userid);
                    conexion.close();
                    return 1;
                } else if (usr.getCorreo().equals(correo) && !usr.getContraseña().equals(contraseña)) {
                    conexion.close();
                    return 2;
                }
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);

        }
        return -1;
    }

    public int Loguearse(Usuario usr, int result) {
        String bienvenida = Usuario.idioma("ventanas/Bundle", "class.register.binvenida");
        String contrainco = Usuario.idioma("ventanas/Bundle", "class.register.contrainco");
        String noexiste = Usuario.idioma("ventanas/Bundle", "class.register.noexist");
        if (result == 1) {
            JOptionPane.showMessageDialog(null, bienvenida+" "+ usr.getUsuario());
        } else if (result == 2) {
            JOptionPane.showMessageDialog(null, contrainco);
        } else {
            JOptionPane.showMessageDialog(null, noexiste);
        }
        return 1;
    }

    public void tableUpdate(javax.swing.JTable table) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String user = Usuario.idioma("ventanas/Bundle", "ventanainvitados.setText.jTable.usuario");
        String correo = Usuario.idioma("ventanas/Bundle", "ventanainvitados.setText.jTable.correo");
        String select = Usuario.idioma("ventanas/Bundle", "ventanainvitados.setText.jTable.seleccion");
        String sql = "SELECT * FROM registro";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(user);
        model.addColumn(correo);
        model.addColumn(select);
        table.setModel(model);
        String[] dato = new String[2];
        try {
            st = conexion.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(2);
                dato[1] = result.getString(3);
                if (!dato[0].equals(Usuario.getUsuario())) {
                    model.addRow(dato);
                }
            }
        } catch (Exception e) {
        }
    }
}
