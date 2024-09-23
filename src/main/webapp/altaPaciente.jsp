<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Paciente</h1>
<p>Esto es una prueba</p>
<form class="user" action="SvPaciente" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                   placeholder="Teléfono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechNac" name="fechNac"
                   placeholder="Fecha Nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad" name="tipoSangre"
                   placeholder="tipoSangre">
        </div>
        <div class="col-sm-6 mb-3">
            <label>Posee Obra Social</label>
            <br>
            &nbsp&nbsp
            <input type="radio" name="option" value="si" onclick="uncheckOthers(this)"> Si
            &nbsp&nbsp
            <input type="radio" name="option" value="no" onclick="uncheckOthers(this)"> No
        </div>
        
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Paciente
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>