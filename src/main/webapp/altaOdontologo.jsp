<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Odontologos</h1>
<p>Aqui podras rellenar campos y dar de alta un Odontologo</p>
<form class="user" action="SvOdontologo" method="POST">
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
            <input type="text" class="form-control form-control" id="especialidad" name="especialidad"
                   placeholder="Especialidad">
        </div>

        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Odontologo
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>
