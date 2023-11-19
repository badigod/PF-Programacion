package repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);

}
