package Logica;

import Logica.Odontologo;
import Logica.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-07-19T19:40:49")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> afeccion;
    public static volatile SingularAttribute<Turno, Paciente> pacient;
    public static volatile SingularAttribute<Turno, Odontologo> odont;
    public static volatile SingularAttribute<Turno, Integer> idTurno;
    public static volatile SingularAttribute<Turno, Date> fechaTurno;
    public static volatile SingularAttribute<Turno, String> horaTurno;

}