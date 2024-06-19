
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Paciente extends Persona implements Serializable{
//    private int idPaciente;
    private boolean tieneOS;
    private String tipoSangre;
    @OneToOne
    private Responsable unResposable;
    @OneToMany(mappedBy="pacient")
    private List<Turno>listaTurnos;
    
    public Paciente() {
    }

    public Paciente(boolean tieneOS, String tipoSangre, Responsable unResposable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tieneOS = tieneOS;
        this.tipoSangre = tipoSangre;
        this.unResposable = unResposable;
        this.listaTurnos = listaTurnos;
    }

    



//    public int getIdPaciente() {
//        return idPaciente;
//    }
//
//    public void setIdPaciente(int idPaciente) {
//        this.idPaciente = idPaciente;
//    }

    public boolean isTieneOS() {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResposable() {
        return unResposable;
    }

    public void setUnResposable(Responsable unResposable) {
        this.unResposable = unResposable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }


}
