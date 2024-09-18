<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Editar datos del Odontologo</h1>
<p>Este es el apartado para editar datos de un odontologo en el sistema</p>
<% Odontologo odonto =(Odontologo)request.getSession().getAttribute("odontoEditar"); %>
<form class="user" action="SvEditarOdontologo" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" 
                   placeholder="Dni" value="<%=odonto.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
                   placeholder="Nombre" value="<%=odonto.getNombre()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apell" name="apell" 
                   placeholder="Apellido" value="<%=odonto.getApellido()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telf" name="telf"
                   placeholder="Telefono" value="<%=odonto.getTelefono()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direc" name="direc" 
                   placeholder="Dirección" value="<%=odonto.getDireccion()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechaNac" name="fechNac" 
                   placeholder="Fecha de Nac YYYY-MM-DD" value="<%=odonto.getFechaNac()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="espec" name="espec" 
                   placeholder="Especialidad" value="<%=odonto.getEspecialidad()%>">
        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Modificar Odontologo
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>