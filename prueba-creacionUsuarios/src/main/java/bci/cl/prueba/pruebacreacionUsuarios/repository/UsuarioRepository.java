package bci.cl.prueba.pruebacreacionUsuarios.repository;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<User, String> {

    @Query(value = Constants.FIND_USER_EMAIL, nativeQuery = true)
    public User findUser(String email);



}
