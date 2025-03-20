package com.mycompany.clinicaodontologica.logica;

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
 
}
