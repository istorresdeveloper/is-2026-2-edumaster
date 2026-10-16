package com.edumaster.auth;

public class AuthService {

    public boolean correoValido(String correo) {
        return correo != null && correo.matches("^[\\w.+-]+@[\\w-]+\\.[\\w.]+$");
    }

    public boolean contrasenaValida(String contrasena) {
        return contrasena != null && contrasena.length() >= 8;
    }

    public boolean registroValido(String correo, String contrasena) {
        return correoValido(correo) && contrasenaValida(contrasena);
    }
}
