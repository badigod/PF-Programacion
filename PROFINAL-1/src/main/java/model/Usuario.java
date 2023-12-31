package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombreUsuario;
	    private String contraseña;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombreUsuario() {
			return nombreUsuario;
		}
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

}
