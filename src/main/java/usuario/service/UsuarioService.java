package usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usuario.model.Usuario;
import usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario datosNuevos) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNombre(datosNuevos.getNombre());
            usuario.setApellido(datosNuevos.getApellido());
            usuario.setEmail(datosNuevos.getEmail());
            usuario.setPassword(datosNuevos.getPassword());
            usuario.setRol(datosNuevos.getRol());
            return usuarioRepository.save(usuario);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
