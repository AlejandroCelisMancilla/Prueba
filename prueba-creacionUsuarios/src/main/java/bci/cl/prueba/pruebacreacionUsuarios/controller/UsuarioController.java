package bci.cl.prueba.pruebacreacionUsuarios.controller;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;
import bci.cl.prueba.pruebacreacionUsuarios.exception.CustomException;
import bci.cl.prueba.pruebacreacionUsuarios.model.Usuario;
import bci.cl.prueba.pruebacreacionUsuarios.service.CreateUserService;
import bci.cl.prueba.pruebacreacionUsuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UsuarioController {

    @Autowired
    CreateUserService createUserService;

    @Autowired
    UserService userService;


    @PostMapping(value = "/usuario/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Object> create(@RequestBody Usuario usuario) throws CustomException {
        try {
            return new ResponseEntity<Object>(createUserService.crear(usuario), HttpStatus.OK);
        } catch (CustomException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/usuario/{email}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> obtenerUsuarios(@PathVariable("email") String email) throws CustomException {
    try {
        User resp = userService.getUser(email);
        return ResponseEntity.ok(resp);
    }catch (CustomException e){
        return new ResponseEntity(Constants.CORREO_INCORRECTO_INEXISTENTE,HttpStatus.BAD_REQUEST);
    }


    }

}
