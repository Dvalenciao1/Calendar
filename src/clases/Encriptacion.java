package clases;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Encriptacion {

    public static String code(String cadena) {
        String cadenaCode = "";
        try {
            cadenaCode = Base64.getEncoder().encodeToString(cadena.getBytes("UTF-8"));
            return cadenaCode;
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
