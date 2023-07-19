package bci.cl.prueba.pruebacreacionUsuarios.exception;

import bci.cl.prueba.pruebacreacionUsuarios.model.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionAdvice {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionResponse> handlerException(CustomException exc){
        return  ResponseEntity.status(exc.getExceptionResponse().getHttpStatus()).body(exc.getExceptionResponse());

    }



}

