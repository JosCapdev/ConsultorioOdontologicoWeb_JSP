
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Odontologo extends Persona implements Serializable {
//    private int idOdontologo;
    private String especialidad;
    @OneToMany(mappedBy="odont")
    private List<Turno>listaTurnos;
    @OneToOne
    private Usuario user;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario user, Horario horario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.user = user;
        this.horario = horario;
    } 

    public Odontologo(String especialidad, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(dni, nombre, apellido, telefono, direccion, fechaNac);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
