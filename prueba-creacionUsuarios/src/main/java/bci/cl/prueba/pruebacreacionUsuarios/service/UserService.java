package bci.cl.prueba.pruebacreacionUsuarios.service;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.exception.CustomException;

import java.util.UUID;

public interface UserService {
    public User getUser(String email) throws CustomException;

    boolean isTokenValid(String email, String token);
}
