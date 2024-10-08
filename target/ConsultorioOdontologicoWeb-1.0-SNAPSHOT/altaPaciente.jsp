<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Paciente</h1>
<p>Esto es una prueba</p>
<form class="user" action="SvPaciente" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control" id="dni" name="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control" id="nombre" name="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control" id="apellido" name="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control" id="telefono" name="telefono"
                   placeholder="Teléfono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control" id="direccion" name="direccion"
                   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control" id="fechNac" name="fechNac"
                   placeholder="Fecha Nacimiento" onfocus="(this.type='date')" onblur="if(this.value==''){this.type='text'}">
        </div>
        <div class="col-sm-6 mb-3">
            <select class="form-control form-control" name="tipoSangre" id="tipoSangre">
                <option value="" disabled selected>Tipo de Sangre</option>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>
                <option value="O+">O+</option>
                <option value="O-">O-</option>
            </select>
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
