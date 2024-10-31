package Logica;

import Logica.Responsable;
import Logica.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-10-30T17:36:25")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, String> tipoSangre;
    public static volatile SingularAttribute<Paciente, Boolean> tieneOS;
    public static volatile ListAttribute<Paciente, Turno> listaTurnos;
    public static volatile SingularAttribute<Paciente, Responsable> unResposable;

}