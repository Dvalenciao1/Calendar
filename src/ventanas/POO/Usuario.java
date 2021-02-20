package ventanas.POO;

import java.util.ResourceBundle;

public class Usuario {

    private String Correo;
    private static String Usuario;
    private String Contraseña;
    private static String iduser;

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
