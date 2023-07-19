package bci.cl.prueba.pruebacreacionUsuarios.model;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {

    private HttpStatus httpStatus;
    private String mensaje;

    public ExceptionResponse(HttpStatus httpStatus, String mensaje) {

        this.httpStatus = httpStatus;
        this.mensaje = mensaje;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMensaje() {
        return mensaje;
    }
}
