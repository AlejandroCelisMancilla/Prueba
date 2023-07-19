package bci.cl.prueba.pruebacreacionUsuarios.exception;

import bci.cl.prueba.pruebacreacionUsuarios.model.ExceptionResponse;
import org.springframework.http.HttpStatus;


public class CustomException extends RuntimeException{
    private final ExceptionResponse exceptionResponse;

    public CustomException(String mensaje, HttpStatus httpStatus){
        super(mensaje);
        this.exceptionResponse = new ExceptionResponse(httpStatus, mensaje);
    }

    public ExceptionResponse getExceptionResponse(){
        return exceptionResponse;
    }

}
