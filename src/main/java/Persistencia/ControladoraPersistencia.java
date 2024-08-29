/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Odontologo;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class ControladoraPersistencia {
    HorarioJpaController horaJpa = new HorarioJpaController();
    OdontologoJpaController odontJpa = new OdontologoJpaController();
    PacienteJpaController pacientJpa = new PacienteJpaController();
    PersonaJpaController persJpa = new PersonaJpaController();
    ResponsableJpaController respJpa = new ResponsableJpaController();
    SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController userJpa = new UsuarioJpaController();

    public ControladoraPersistencia() {
    }
    
    public void crearUser(Usuario user) {
        userJpa.create(user);
    }

    public List<Usuario> listarUsuarios() {
        return userJpa.findUsuarioEntities();
    }

    public void eliminarUser(int id) {
        try {
            userJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUser(int id) {   
        return userJpa.findUsuario(id);
    }

    public void editarUser(Usuario usu) {
        try {
            userJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearOdonto(Odontologo odonto) {
        odontJpa.create(odonto);
    }

    public List<Odontologo> listarOdontologos() {
        return odontJpa.findOdontologoEntities();
    }

    public Odontologo traerOdonto(int id) {
        return odontJpa.findOdontologo(id);
    }

    public void editarOdonto(Odontologo odonto) {
        try {
            odontJpa.edit(odonto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarOdonto(int id) {
        try {
            odontJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
