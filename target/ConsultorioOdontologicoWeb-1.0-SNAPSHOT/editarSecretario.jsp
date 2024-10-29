<%@page import="Logica.Secretario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Editar datos del Sscretario</h1>
<p>Este es el apartado para editar datos de un secretario en el sistema</p>
<% Secretario sec =(Secretario)request.getSession().getAttribute("secEditar"); %>
<form class="user" action="SvEditSec" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" 
                   placeholder="Dni" value="<%=sec.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
                   placeholder="Nombre" value="<%=sec.getNombre()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apell" name="apell" 
                   placeholder="Apellido" value="<%=sec.getApellido()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telf" name="telf"
                   placeholder="Telefono" value="<%=sec.getTelefono()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direc" name="direc" 
                   placeholder="Dirección" value="<%=sec.getDireccion()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechaNac" name="fechNac" 
                   placeholder="Fecha de Nac YYYY-MM-DD" value="<%=sec.getFechaNac()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="espec" name="espec" 
                   placeholder="Especialidad" value="<%=sec.getSector()%>">
        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Modificar Secretario
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>