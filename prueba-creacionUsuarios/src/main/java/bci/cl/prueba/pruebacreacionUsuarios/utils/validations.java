package bci.cl.prueba.pruebacreacionUsuarios.utils;

import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validations {
    private static final Pattern email_pattern = Pattern.compile(Constants.EMAIL_PATTERN);
    private static final Pattern password_pattern = Pattern.compile(Constants.PASSWORD_PATTERN);
    public static boolean validarEmail(String email) {
        Matcher matcher = email_pattern.matcher(email);
        return matcher.matches();
    }


    public static boolean validarPassword(String password){
       Matcher matcher = password_pattern.matcher(password);
       return matcher.matches();
    }
}
