
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idHorario;
    private String horarioInic;
    private String horarioFin;

    public Horario() {
    }

    public Horario(int idHorario, String horarioInic, String horarioFin) {
        this.idHorario = idHorario;
        this.horarioInic = horarioInic;
        this.horarioFin = horarioFin;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioInic() {
        return horarioInic;
    }

    public void setHorarioInic(String horarioInic) {
        this.horarioInic = horarioInic;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }
    
   
}
