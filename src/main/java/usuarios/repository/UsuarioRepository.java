package usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usuarios.model.Usuario;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, Long> {

}
