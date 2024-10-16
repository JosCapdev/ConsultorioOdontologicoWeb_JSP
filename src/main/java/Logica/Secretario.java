
package Logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona{
    private String sector;
    @OneToOne
    private Usuario user;

    public Secretario() {
    }

    public Secretario(String sector, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(dni, nombre, apellido, telefono, direccion, fechaNac);
        this.sector = sector;
    }
    
    public Secretario(String sector, Usuario user, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.sector = sector;
        this.user = user;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    
}
