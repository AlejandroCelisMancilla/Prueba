package bci.cl.prueba.pruebacreacionUsuarios.constants;

public class Constants {


    public static final String DATE_PATTERN = "dd-MM-yyyy HH:mm:ss";
    public static final String CORREO_EXISTENTE = "El correo ya está registrado";
    public static final String CORREO_NO_EXISTENTE = "El correo NO está registrado";
    public static final String CORREO_INCORRECTO = "El correo no tiene el formato adecuado ej: (aaaaaaa@dominio.cl)";

    public static final String CORREO_INCORRECTO_INEXISTENTE = "El correo NO existe o tiene mal el formato ej: (aaaaaaa@dominio.cl)";
    public static final String CORREO_TOKEN_INCORRECTO = "El correo o el token no existen";

    public static final String CONTRASEÑA_NO_VALIDA = "La contraseña no es valida";

    public static final String EMAIL_PATTERN = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    public static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,30}$";
    public static final int MIN_LENGTH = 8;
    public static final int MAX_LENGTH = 30;

    public static final String FIND_USER_EMAIL = "SELECT id, last_login, modified, create, email, is_active, name, password,token FROM usuarios where email = ?";
    public static final String FIND_EMAIL_TOKEN = "SELECT id, last_login, modified, create, email, is_active, name, password, token FROM usuarios where email = ? and token = ?";

    public Constants() {
    }
}
