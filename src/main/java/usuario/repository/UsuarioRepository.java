package usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usuario.model.Usuario;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, Long> {

}
