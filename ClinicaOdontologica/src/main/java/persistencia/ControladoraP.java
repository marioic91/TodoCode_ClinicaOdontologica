package persistencia;

import com.mycompany.clinicaodontologica.logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraP {
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        usuarioJpaController.create(usuario);
    }

    public List<Usuario> consultarUsuarios() {
        return usuarioJpaController.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuarioJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(int id) {
        return usuarioJpaController.findUsuario(id);
    }

    public void editarUsuario(Usuario usuario) {
        try {
            usuarioJpaController.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
