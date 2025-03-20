package persistencia;

import com.mycompany.clinicaodontologica.logica.Usuario;

public class ControladoraP {
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        usuarioJpaController.create(usuario);
    }
    
    
}
