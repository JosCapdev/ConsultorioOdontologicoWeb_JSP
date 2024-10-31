/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Odontologo;
import Logica.Paciente;
import Logica.Responsable;
import Logica.Secretario;
import Logica.Turno;
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

    public List<Paciente> listarPacientes() {
        return pacientJpa.findPacienteEntities();
    }

    public void crearPacient(Paciente pac) {
        pacientJpa.create(pac);
    }

    public Paciente traerPaciente(int id) {
        return pacientJpa.findPaciente(id);
    }

    public void editarPacient(Paciente pac) {
        try {
            pacientJpa.edit(pac);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPacient(int id) {
        try {
            pacientJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Turno> listarTurnos() {
        return turnoJpa.findTurnoEntities();
    }

    public void crearTurno(Turno turn) {
        turnoJpa.create(turn);
    }

    public void eliminarTurno(int id) {
        try {
            turnoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Secretario> listarSecretarios() {
        return secretarioJpa.findSecretarioEntities();
    }

    public void crearSecretario(Secretario sec) {
        secretarioJpa.create(sec);
    }

    public Secretario traerSec(int id) {
        return secretarioJpa.findSecretario(id);
    }

    public void editarSec(Secretario sec) {
        try {
            secretarioJpa.edit(sec);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSec(int id) {
        try {
            secretarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Responsable traerResponsable(int id) {
        return respJpa.findResponsable(id);
    }

    public List<Responsable> listarResponsables() {
        return respJpa.findResponsableEntities();
    }

    public void crearResponsable(Responsable resp) {
        respJpa.create(resp);
    }

    public void eliminarResp(int id) {
        try {
            respJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarResp(Responsable resp) {
        try {
            respJpa.edit(resp);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

}
