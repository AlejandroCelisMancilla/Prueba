package bci.cl.prueba.pruebacreacionUsuarios.service.impl;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;
import bci.cl.prueba.pruebacreacionUsuarios.exception.CustomException;
import bci.cl.prueba.pruebacreacionUsuarios.repository.ObtenerTokenEmailRepository;
import bci.cl.prueba.pruebacreacionUsuarios.repository.UsuarioRepository;
import bci.cl.prueba.pruebacreacionUsuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserImpl implements UserService {

    @Autowired
    UsuarioRepository repo;

    @Autowired
    ObtenerTokenEmailRepository repository;

    @Override
    public User getUser(String email) throws CustomException {


        User emailExist = repo.findUser(email);


        if(emailExist != null){
            User llave = repo.findUser(email);
            User mail = repo.findUser(email);

            String correo = mail.getEmail().toString();
            String token =  llave.getToken().toString();

           if(!isTokenValid(correo,token)){
               throw new CustomException(Constants.CORREO_TOKEN_INCORRECTO, HttpStatus.BAD_REQUEST);
           }
            return repo.findUser(email);

        }else throw new CustomException(Constants.CORREO_NO_EXISTENTE, HttpStatus.CONFLICT);
    }

    @Override
    public boolean isTokenValid(String email, String token){

        if(token == null || email == null){
            return false;
        }
        User user = repository.findTokenAndEmail(email,token);

            return user !=null;

    }

}
