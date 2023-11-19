document.addEventListener('DOMContentLoaded', () => {
    // Realizar solicitud a la API del backend
    fetch('http://localhost:5500/BORRADORES%20PF/mainfinal.html', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            // Añadir más cabeceras si son necesarias
        },
    })
    .then(response => response.json())
    .then(data => {
        // Manejar la respuesta del backend
        console.log('Datos del backend:', data);
        // Actualizar tu interfaz de usuario con estos datos
    })
    .catch(error => console.error('Error al realizar la solicitud:', error));
});