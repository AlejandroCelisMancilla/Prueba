package bci.cl.prueba.pruebacreacionUsuarios.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static bci.cl.prueba.pruebacreacionUsuarios.constants.Constants.DATE_PATTERN;

public class Date {
    public static String dateNow() {
        return DateTimeFormatter.ofPattern(DATE_PATTERN)
                .withZone(ZoneOffset.UTC)
                .format(LocalDateTime.now());
    }

    public Date() {}
}
