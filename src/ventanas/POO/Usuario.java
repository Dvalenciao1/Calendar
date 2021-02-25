package ventanas.POO;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class Usuario {

    private String Correo;
    private String Contraseña;
    private String nameAct;
    private String textDesc;
    private String fecha;
    private int hora;
    private static String iduser;
    private static String Usuario;
    private ArrayList<String> listaIdinvitados = new ArrayList<>();

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public ArrayList<String> getListaIdinvitados() {
        return listaIdinvitados;
    }

    public void setListaIdinvitados(ArrayList<String> listaIdinvitados) {
        this.listaIdinvitados = listaIdinvitados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNameAct() {
        return nameAct;
    }

    public void setNameAct(String nameAct) {
        this.nameAct = nameAct;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }
    
    
    public static String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public static String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public static String idioma(String url, String key) {
        ResourceBundle res = ResourceBundle.getBundle(url);
        return res.getString(key);
    }
}
