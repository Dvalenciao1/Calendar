package clases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Registro extends SQL {
    
    //Busca en la base de datos los eventos de los usuarios para mostrarlo en pantalla al iniciar sesion
    public boolean buscarEvt(String fecha, int hora) {
        String title = Usuario.idioma("ventanas/Bundle", "claseregistro.title");
        String description = Usuario.idioma("ventanas/Bundle", "claseregistro.description");
        String date = Usuario.idioma("ventanas/Bundle", "claseregistro.fecha");
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        try {
            PreparedStatement ps = conexion.prepareStatement("Select * FROM actividad where fecha='" + fecha + "' and hora = " + hora);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String fechaEvt = rs.getString(5);
                String horaEvt = rs.getString(6);
                String horas = String.valueOf(hora);
                if (fecha.equals(fechaEvt) && horas.equals(horaEvt)) {
                    Registro.sonido("src/musicNotify/notificacion.wav");
                    String nameEvt = rs.getString(2);
                    String descEvt = rs.getString(4);
                    String idevt = rs.getString(1);
                    JOptionPane.showMessageDialog(null, title + " " + nameEvt + "\n" + description + " " + descEvt + "\n" + date + " " + fechaEvt + ", " + horas);
                    EliminarEvt(idevt);
                    return true;
                } else {
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

    //Elimina los eventos de la base de datos
    public void EliminarEvt(String idEvt) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql = "DELETE FROM actividad where id_event=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idEvt));
            ps.executeUpdate();
        } catch (NumberFormatException | SQLException e) {
        }
    }

    //Busca el id del evento en la base de datos para mostralo
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

    //Cuenta las lineas encontradas de la base de datos
    public String countRow() {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql1 = "select count(*) from actividad where idusuario = " + Usuario.getIduser();
        Statement st;
        String cantidad = "";
        try {
            st = conexion.createStatement();
            try (ResultSet rs = st.executeQuery(sql1)) {
                while (rs.next()) {
                    cantidad = rs.getString(1);
                }
            }
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e);
            return cantidad;
        }
    }

    //Cuenta las lineas encontradas en la base de datos de una diferente busqueda
    public String countRowReg(String cadena) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String[] cadenasplit = cadena.split(",");
        String cadenafinal = String.join(" or idregistro= ", cadenasplit);
        String cantidad = "";
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT count(*) FROM registro where idregistro =" + cadenafinal.replace("[", "").replace("]", ""));
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    cantidad = rs.getString(1);
                }
            }
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e);
            return cantidad;
        }
    }

    //busca la id del usuario en la tabla de actividad para buscar las actividades guardadas por el
    public String[][] Busquedaid(String cantidad) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql1 = "select * from actividad where idusuario = " + Usuario.getIduser();
        Statement st;
        String[][] listaAct = new String[Integer.parseInt(cantidad)][5];
        try {
            st = conexion.createStatement();
            try (ResultSet rs = st.executeQuery(sql1)) {
                int i = 0;
                while (rs.next() && i < listaAct.length) {
                    listaAct[i][0] = rs.getString(2);
                    listaAct[i][1] = rs.getString(4);
                    listaAct[i][2] = rs.getString(7);
                    listaAct[i][3] = rs.getString(5);
                    listaAct[i][4] = rs.getString(6);
                    i++;
                }
            }
            return listaAct;
        } catch (SQLException e) {
            System.out.println(e);
            return listaAct;
        }
    }

    //Busca al usuario por la id para presentar sus datos
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

    //Busca la id del usuario para presentar sus datos en otra consulta
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

    //Busca el correo del usuario de los invitados para enviar el mensaje atraves de la id
    public ArrayList busquedadeCorreo(ArrayList<String> list) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        ArrayList<String> listaid = new ArrayList<>();
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String useremail = rs.getString(3);
                String user = rs.getString(2);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(user)) {
                        listaid.add(useremail);
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

    //Guarda la activida en la base de datos en la tabla actividad
    public boolean registrarActividad(Usuario usr) {
        PreparedStatement ps;
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

    //Guarda o registra los datos del usuario
    public boolean registrar(Usuario usr) {
        PreparedStatement ps;
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        String sql = "INSERT INTO registro(User, Email, Pass)values(?,?,?)";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, Usuario.getUsuario());
            ps.setString(2, usr.getCorreo());
            ps.setString(3, usr.getContraseña());
            ps.execute();
            conexion.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //verifica si el usuario no existe para registrarlo
    public int verificarUsuarioR(Usuario usr) {
        SQL con = new SQL();
        Connection conexion = con.getConexion();
        try {
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM registro");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String user = rs.getString(2);
                String correo = rs.getString(3);
                if (Usuario.getUsuario().equals(user)) {
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

    //verifica si el usuario existe para loguearlo
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

    //nos mustra si se loguea el usuario de forma correcta
    public int Loguearse(Usuario usr, int result) {
        String bienvenida = Usuario.idioma("ventanas/Bundle", "class.register.binvenida");
        String contrainco = Usuario.idioma("ventanas/Bundle", "class.register.contrainco");
        String noexiste = Usuario.idioma("ventanas/Bundle", "class.register.noexist");
        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(null, bienvenida + " " + Usuario.getUsuario());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, contrainco);
                break;
            default:
                JOptionPane.showMessageDialog(null, noexiste);
                break;
        }
        return 1;
    }

    //LLena la tabla con los correos y usuarios para invitarlos
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
        } catch (SQLException e) {
        }
    }

    public static void sonido(String ruta) {
        String sound = ruta;
        try {
            InputStream in = new FileInputStream(sound);
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
