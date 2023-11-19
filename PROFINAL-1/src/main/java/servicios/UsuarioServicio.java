package servicios;

import org.springframework.security.core.userdetails.UserDetails;

import modelos.Usuario;

public interface UsuarioServicio {
	 Usuario guardarUsuario(Usuario usuario);
	    UserDetails cargarUsuarioPorEmail(String email);

}
