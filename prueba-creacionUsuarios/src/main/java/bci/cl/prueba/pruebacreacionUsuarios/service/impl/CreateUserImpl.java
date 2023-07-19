package bci.cl.prueba.pruebacreacionUsuarios.service.impl;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;
import bci.cl.prueba.pruebacreacionUsuarios.exception.CustomException;
import bci.cl.prueba.pruebacreacionUsuarios.Entity.Phone;
import bci.cl.prueba.pruebacreacionUsuarios.model.PhoneResponse;
import bci.cl.prueba.pruebacreacionUsuarios.model.UserResponse;
import bci.cl.prueba.pruebacreacionUsuarios.model.Usuario;
import bci.cl.prueba.pruebacreacionUsuarios.repository.UsuarioRepository;
import bci.cl.prueba.pruebacreacionUsuarios.service.CreateUserService;
import bci.cl.prueba.pruebacreacionUsuarios.utils.Date;
import bci.cl.prueba.pruebacreacionUsuarios.utils.validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class CreateUserImpl implements CreateUserService {

    @Autowired
    UsuarioRepository repo;

    @Override
    public Object crear(Usuario usuario) throws CustomException {
        UserResponse data = new UserResponse();
        PhoneResponse dataPhone = new PhoneResponse();

        List<PhoneResponse> ph = new ArrayList<>();

        //valida si el Email existe en la bd de datos
        User emailValid = repo.findUser(usuario.getEmail());
        if (emailValid == null) {

            User user = new User();
            List<Phone> phones = new ArrayList<>();
            Phone phone = new Phone();


                //valida si el Email tiene un formato correcto
            if (validations.validarEmail(usuario.getEmail())) {

                user.setName(usuario.getName());
                user.setEmail((usuario.getEmail()));

                //valida la contraseña con rango digitos y signos
                if (validations.validarPassword(usuario.getPassword())) {

                    user.setPassword(usuario.getPassword());
                    phone.setNumber(usuario.getPhones().get(0).getNumber());
                    phone.setCityCode(usuario.getPhones().get(0).getCityCode());
                    phone.setContryCode(usuario.getPhones().get(0).getContryCode());
                    phones.add(phone);
                    user.setPhones(phones);
                    user.setCreate(Date.dateNow());
                    user.setModified(Date.dateNow());
                    user.setLastLogin(Date.dateNow());
                    user.setToken(UUID.randomUUID());
                    user.setActive(false);


                    User response = repo.save(user);



                    data.setId(response.getId().toString());
                    data.setName(response.getName());
                    data.setEmail(response.getEmail());
                    data.setPassword(response.getPassword());

                    dataPhone.setNumber(response.getPhones().get(0).getNumber());
                    dataPhone.setCityCode(response.getPhones().get(0).getCityCode());
                    dataPhone.setContryCode(response.getPhones().get(0).getContryCode());
                    ph.add(dataPhone);
                    data.setPhoneResponses(ph);

                    data.setCreate(response.getCreate());
                    data.setModified(response.getModified());
                    data.setLastLogin(response.getLastLogin());
                    data.setToken(response.getToken());

                    return data;
                }
                throw new CustomException(Constants.CONTRASEÑA_NO_VALIDA, HttpStatus.BAD_REQUEST);

            }
            throw new CustomException(Constants.CORREO_INCORRECTO, HttpStatus.BAD_REQUEST);
        }
        throw new CustomException(Constants.CORREO_EXISTENTE, HttpStatus.CONFLICT);


    }

}
