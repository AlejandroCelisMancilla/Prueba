package bci.cl.prueba.pruebacreacionUsuarios.service;


import bci.cl.prueba.pruebacreacionUsuarios.exception.CustomException;
import bci.cl.prueba.pruebacreacionUsuarios.model.Usuario;

public interface CreateUserService {

    public Object crear(Usuario usuario) throws CustomException;



}
