/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Controladora {
    
    ControladoraPersistencia controlPers = new ControladoraPersistencia();
    
    public void crearUsuario(String nombre,String pass,String rol){
        Usuario user = new Usuario(nombre,pass,rol);
        controlPers.crearUser(user);
    }

    public List<Usuario> getUsuarios() {
        return controlPers.listarUsuarios();
    }
}
