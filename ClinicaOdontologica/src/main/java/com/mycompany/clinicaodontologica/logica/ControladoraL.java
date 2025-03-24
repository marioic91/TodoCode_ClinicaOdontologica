package com.mycompany.clinicaodontologica.logica;

import java.util.List;
import persistencia.ControladoraP;

public class ControladoraL {
    ControladoraP controladoraP = new ControladoraP();

    public void crearUsuario(String nombre, String contrasenia, String rol) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setContrasenia(contrasenia);
        usuario.setRol(rol);
        
        controladoraP.crearUsuario(usuario);
    }

    public List<Usuario> consultarUsuarios() {
        return controladoraP.consultarUsuarios();
    }

    public void borrarUsuario(int id) {
        controladoraP.borrarUsuario(id);
    }

    public Usuario buscarUsuario(int id) {
        return controladoraP.buscarUsuario(id);
    }

    public void editarUsuario(Usuario usuario) {
        controladoraP.editarUsuario(usuario);
    }

    public boolean validacion(String nombreUsuario, String contrasenia) {
        boolean encontrado = false;
        List<Usuario> lista = controladoraP.consultarUsuarios();
        
        for(Usuario i: lista){
            if(i.getNombre().equals(nombreUsuario)){
                if(i.getContrasenia().equals(contrasenia)){
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }
 
}
