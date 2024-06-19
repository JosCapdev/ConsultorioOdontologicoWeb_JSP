
package Logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
//    private int idResponsable;
    private String tipoResp;

    public Responsable() {
    }

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tipoResp = tipoResp;
    }

   
//    public int getIdResponsable() {
//        return idResponsable;
//    }
//
//    public void setIdResponsable(int idResponsable) {
//        this.idResponsable = idResponsable;
//    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }
    
    
}
