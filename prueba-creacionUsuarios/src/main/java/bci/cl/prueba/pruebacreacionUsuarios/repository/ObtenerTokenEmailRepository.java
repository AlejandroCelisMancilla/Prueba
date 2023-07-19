package bci.cl.prueba.pruebacreacionUsuarios.repository;

import bci.cl.prueba.pruebacreacionUsuarios.Entity.User;
import bci.cl.prueba.pruebacreacionUsuarios.constants.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ObtenerTokenEmailRepository extends JpaRepository<User, String> {

    @Query(value = Constants.FIND_EMAIL_TOKEN, nativeQuery = true)
    public User findTokenAndEmail(String email, String Token);



}
