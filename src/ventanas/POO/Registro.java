package ventanas.POO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro extends SQL {

    //Cambiar de idioma el metodo buscarEvt
    //Crear un metodo para Enviar correo
    //Cambiar el icono de la app
    public boolean buscarEvt(String fecha, int hora) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        try {
            PreparedStatement ps = conexion.prepareStatement("Select * FROM actividad where fecha='" + fecha + "' and hora = " + hora);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String fechaEvt = rs.getString(6);
                String horaEvt = rs.getString(7);
                String horas = String.valueOf(hora);
                if (fecha.equals(fechaEvt) && horas.equals(horaEvt)) {
                    String nameEvt = rs.getString(2);
                    String descEvt = rs.getString(3);
                    String idevt = rs.getString(1);
                    JOptionPane.showMessageDialog(null, "Titulo: " + nameEvt +"\nDescripcion: "+descEvt+"\nFecha: "+fechaEvt+", "+horas);
                    EliminarEvt(idevt);
                    return true;
                }else{
                    return false;
                }
            }
            conexion.close();
            return false;
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);
            return false;
        }
    }

    public void EliminarEvt(String idEvt) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql = "DELETE FROM actividad where id_event=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idEvt));
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public String idEvento(String fecha, int hora) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String idevento = "";
        try {
            PreparedStatement ps = conexion.prepareStatement("Select * FROM actividad where fecha='" + fecha + "' and hora = " + hora);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idevento = rs.getString(1);
            }
            conexion.close();
            return idevento;
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);
            return idevento;
        }
    }

    public String countRow() {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql1 = "select count(*) from actividad where idusuario = " + Usuario.getIduser();
        Statement st;
        String cantidad = "";
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                cantidad = rs.getString(1);
            }
            rs.close();
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e);
            return cantidad;
        }
    }

    public String countRowReg(String cadena) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String[] cadenasplit = cadena.split(",");
        String cadenafinal = String.join(" or idregistro= ", cadenasplit);
        String cantidad = "";
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT count(*) FROM registro where idregistro =" + cadenafinal.replace("[", "").replace("]", ""));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cantidad = rs.getString(1);
            }
            rs.close();
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e);
            return cantidad;
        }
    }

    public String[][] guardarAct(String cantidad) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql1 = "select * from actividad where idusuario = " + Usuario.getIduser();
        Statement st;
        String[][] listaAct = new String[Integer.parseInt(cantidad)][5];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            int i = 0;
            while (rs.next() && i < listaAct.length) {
                listaAct[i][0] = rs.getString(2);
                listaAct[i][1] = rs.getString(4);
                listaAct[i][2] = rs.getString(5);
                listaAct[i][3] = rs.getString(6);
                listaAct[i][4] = rs.getString(7);
                i++;
            }
            rs.close();
            return listaAct;
        } catch (SQLException e) {
            System.out.println(e);
            return listaAct;
        }
    }

    public String[][] busquedaUsuariosxId(String cadena, String cantidad) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String[] cadenasplit = cadena.split(",");
        String cadenafinal = String.join(" or idregistro= ", cadenasplit);
        String[][] listacorreo = new String[Integer.parseInt(cantidad + 1)][2];
        try {
            PreparedStatement psts = conexion.prepareStatement("SELECT * FROM registro where idregistro =" + cadenafinal.replace("[", "").replace("]", ""));
            ResultSet rss = psts.executeQuery();
            int i = 0;
            while (rss.next() && i < listacorreo.length) {
                listacorreo[i][0] = rss.getString(2);
                listacorreo[i][1] = rss.getString(3);
                i++;
            }
            conexion.close();
            return listacorreo;
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);
            return listacorreo;
        }
    }

    public ArrayList busquedaIdxUsuario(ArrayList<String> list) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        ArrayList<String> listaid = new ArrayList<>();
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String userid = rs.getString(1);
                String user = rs.getString(2);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(user)) {
                        listaid.add(userid);
                        continue;
                    }
                }
            }
            conexion.close();
            return listaid;
        } catch (SQLException e) {
            System.out.println("[ERROR]" + e);
        }
        return listaid;
    }

    public boolean registrarActividad(Usuario usr) {
        PreparedStatement ps = null;
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String ids = usr.getListaIdinvitados().toString();
        String sql = "INSERT INTO actividad(activity, idusuario, descripcion, idinvitados, fecha, hora)values(?,?,?,?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usr.getNameAct());
            ps.setString(2, Usuario.getIduser());
            ps.setString(3, usr.getTextDesc());
            ps.setString(4, ids);
            ps.setString(5, usr.getFecha());
            ps.setInt(6, usr.getHora());
            ps.execute();
            conexion.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

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
            JOptionPane.showMessageDialog(null, bienvenida + " " + usr.getUsuario());
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
