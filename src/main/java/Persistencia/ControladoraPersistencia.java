/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuario;
import java.util.List;

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

}
