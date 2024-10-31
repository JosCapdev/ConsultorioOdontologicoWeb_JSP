package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Controladora {

    ControladoraPersistencia controlPers = new ControladoraPersistencia();

    public void crearUsuario(String nombre, String pass, String rol) {
        Usuario user = new Usuario(nombre, pass, rol);
        controlPers.crearUser(user);
    }

    public List<Usuario> getUsuarios() {
        return controlPers.listarUsuarios();
    }

    public void eliminarUser(int id) {
        controlPers.eliminarUser(id);
    }

    public Usuario traerUser(int id) {
        return controlPers.traerUser(id);
    }

    public void editarUser(Usuario usu) {
        controlPers.editarUser(usu);
    }

    public boolean comprobarIngreso(String user, String pass) {
        boolean ingreso = false;
        List<Usuario> listaUser = new ArrayList<Usuario>();
        listaUser = controlPers.listarUsuarios();
        for (Usuario usuario : listaUser) {
            if (usuario.getNombreUsuario().equals(user)) {
                if (usuario.getContrasenia().equals(pass)) {
                    ingreso = true;
                } else {
                    ingreso = false;
                }
            }
        }
        return ingreso;
    }

    public boolean EsAdmin(String user, String pass) {
        boolean adm = false;
        List<Usuario> listaUser = new ArrayList<Usuario>();
        listaUser = controlPers.listarUsuarios();
        for (Usuario usuario : listaUser) {
            if (usuario.getNombreUsuario().equals(user)) {
                if (usuario.getContrasenia().equals(pass)) {
                    if (usuario.getRol().equals("Administrador")) {
                        adm = true;
                    }
                }
            }
        }
        return adm;
    }

    public void crearOdonto(Odontologo odonto) {
        controlPers.crearOdonto(odonto);
    }

    public List<Odontologo> getOdontologos() {
        return controlPers.listarOdontologos();
    }

    public Odontologo traerOdonto(int id) {
        return controlPers.traerOdonto(id);
    }

    public void editarOdonto(Odontologo odonto) {
        controlPers.editarOdonto(odonto);
    }

    public void eliminarOdonto(int id) {
        controlPers.eliminarOdonto(id);
    }

    public void crearPacient(Paciente pac) {
        controlPers.crearPacient(pac);
    }

    public List<Paciente> getPacientes() {
        return controlPers.listarPacientes();
    }

    public Paciente traerPacient(int id) {
        return controlPers.traerPaciente(id);
    }

    public void editarPacient(Paciente pac) {
        controlPers.editarPacient(pac);
    }

    public void eliminarPacient(int id) {
        controlPers.eliminarPacient(id);
    }

    public List<Turno> getTurnos() {
        return controlPers.listarTurnos();
    }

    public void crearTurno(Turno turn) {
        controlPers.crearTurno(turn);
    }
    
    public void eliminarTurno(int id) {
        controlPers.eliminarTurno(id);
    }

    public List<Secretario> getSecretarios() {
        return controlPers.listarSecretarios();
    }

    public void crearSec(Secretario sec) {
        controlPers.crearSecretario(sec);
    }

    public Secretario traerSec(int id) {
        return controlPers.traerSec(id);
    }

    public void editarSec(Secretario sec) {
        controlPers.editarSec(sec);
    }

    public void eliminarSec(int id) {
        controlPers.eliminarSec(id);
    }

    public Responsable traerResponsable(int id) {
         return controlPers.traerResponsable(id);
    }

    public List<Responsable> getResponsables() {
        return controlPers.listarResponsables();
    }

    public void crearResp(Responsable resp) {
        controlPers.crearResponsable(resp);
    }

    public void eliminarResp(int id) {
        controlPers.eliminarResp(id);
    }

    public void editarResp(Responsable resp) {
        controlPers.editarResp(resp);
    }

}
