<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Crear Turno</h1>
<p>Esto es una prueba</p>
<form class="user" action="SvPaciente" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechaTurn" name="fechaTurn" 
                   placeholder="Fecha del Turno YYYY-MM-DD">
        </div>
        <div class="col-sm-6 mb-3">
            <select class="form-control form-control" name="horarios" id="horarios">>
                <option value="" disabled selected>Horarios</option>
                <option value="08:00">08:00 AM</option>
                <option value="09:00">09:00 AM</option>
                <option value="10:00">10:00 AM</option>
                <option value="11:00">11:00 AM</option>
                <option value="12:00">12:00 PM</option>
                <option value="13:00">01:00 PM</option>
                <option value="14:00">02:00 PM</option>
                <option value="15:00">03:00 PM</option>
                <option value="16:00">04:00 PM</option>
                <option value="17:00">05:00 PM</option>
            </select>
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="afeccion" name="afeccion"
                   placeholder="Afección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                   placeholder="Teléfono">
        </div>

        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Turno
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>
