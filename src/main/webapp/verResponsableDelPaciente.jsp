<%@page import="Logica.Responsable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>
<% String pacDatos =(String) request.getSession().getAttribute("pacientBuscar");%>
<% Responsable resp = (Responsable) request.getSession().getAttribute("respBuscar");%>
<h1>Datos del Responsable del Paciente <%=pacDatos%></h1>
<p></p>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" 
                   placeholder="Dni" value="<%=resp.getDni()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
                   placeholder="Nombre" value="<%=resp.getNombre()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apell" name="apell" 
                   placeholder="Apellido" value="<%=resp.getApellido()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telf" name="telf"
                   placeholder="Telefono" value="<%=resp.getTelefono()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direc" name="direc" 
                   placeholder="Dirección" value="<%=resp.getDireccion()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechaNac" name="fechNac" 
                   placeholder="Fecha de Nac YYYY-MM-DD" value="<%=resp.getFechaNac()%> readonly">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="espec" name="espec" 
                   placeholder="Especialidad" value="<%=resp.getTipoResp()%> readonly">
        </div>
                   
<%@include file="components/bodyFinal.jsp" %>