package controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import modelos.Usuario;
import servicios.UsuarioServicio;

@Controller
@RequestMapping("/api/auth")
public class AuthController {

    private final UsuarioServicio usuarioServicio;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthController(UsuarioServicio usuarioServicio, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usuarioServicio = usuarioServicio;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/registro")
    public String registro(@RequestBody Usuario usuario) {
        // Verificamos si el correo electrónico ya está en uso
        if (usuarioServicio.cargarUsuarioPorEmail(usuario.getEmail()) != null) {
            return "Error: El correo electrónico ya está en uso";
        }

        // Codificamos la contraseña antes de guardarla en la base de datos
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));

        // Guardamos el usuario en la base de datos
        usuarioServicio.guardarUsuario(usuario);

        return "Usuario registrado exitosamente";
    }
}
