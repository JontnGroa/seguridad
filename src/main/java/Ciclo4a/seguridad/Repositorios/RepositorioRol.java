package Ciclo4a.seguridad.Repositorios;

import Ciclo4a.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
