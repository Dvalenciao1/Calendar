package clases;

import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Usuario {

    private static String Correo;
    private String Contraseña;
    private static String nameAct;
    private static String textDesc;
    private static String fecha;
    private static int hora;
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

    public static boolean enviarCorreo(ArrayList<String> invitado) {
        String title = idioma("ventanas/Bundle", "claseusuario.titulo.msg");
        String remitente = idioma("ventanas/Bundle", "claseusuario.remitente.msg");
        String fechaidiom = idioma("ventanas/Bundle", "claseusuario.fecha.msg");
        String nombre = idioma("ventanas/Bundle", "claseusuario.nombre.msg");
        String desc = idioma("ventanas/Bundle", "claseusuario.desc.msg");
        invitado.add("danielvalencia-2000@hotmail.com");
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        propiedad.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session sesion = Session.getDefaultInstance(propiedad);
        String correo = "davop454@gmail.com";
        String passwod = "Peeter69";
        String asunto = "Invitacion de " + getUsuario();
        String mensaje = "<h1>" + title + "</h1> " + remitente + " " + getUsuario() + ", <b>" + Correo + "</b><br>"
                + "<br><b>" + fechaidiom + " </b>" + fecha + ", " + hora
                + "<br><b>" + nombre + " </b> " + nameAct
                + "<br><b>" + desc + " </b> " + textDesc;
        try {
            for (int i = 0; i < invitado.size() - 1; i++) {
                MimeMessage mail = new MimeMessage(sesion);
                String destino = invitado.get(i);
                mail.setFrom(new InternetAddress(correo));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
                mail.setSubject(asunto);
                mail.setText(mensaje, "ISO-8859-1", "html");

                Transport trasnporte = sesion.getTransport("smtp");
                trasnporte.connect(correo, passwod);
                trasnporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                trasnporte.close();
            }
            System.out.println("Enviado");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
