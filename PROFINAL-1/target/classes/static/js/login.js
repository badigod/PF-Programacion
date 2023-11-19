function validarRegistro() {
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var contrasena = document.getElementById("contrasena").value;
    var confirmarContrasena = document.getElementById("confirmarContrasena").value;

    // Validar que los campos no estén vacíos
    if (nombre === "" || email === "" || contrasena === "" || confirmarContrasena === "") {
        alert("Todos los campos son obligatorios.");
        return false;
    }

    // Validar formato de correo electrónico
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Por favor, introduce una dirección de correo electrónico válida.");
        return false;
    }

    // Validar longitud de la contraseña
    if (contrasena.length < 10) {
        alert("La contraseña debe tener al menos 6 caracteres.");
        return false;
    }

    // Validar que las contraseñas coincidan
    if (contrasena !== confirmarContrasena) {
        alert("Las contraseñas no coinciden. Por favor, inténtalo de nuevo.");
        return false;
    }

    // Si todas las validaciones son exitosas, el formulario se enviará
    return true;
}

