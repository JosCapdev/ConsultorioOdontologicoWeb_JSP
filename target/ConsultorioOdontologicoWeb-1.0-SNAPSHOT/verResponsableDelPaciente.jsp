<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Responsable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>
<% String pacDatos = (String) request.getSession().getAttribute("pacientBuscar");%>
<% Responsable resp = (Responsable) request.getSession().getAttribute("respBuscar");%>
<h1>Datos del Responsable del Paciente <%=pacDatos%></h1>
<p></p>
<div class="form-group col">
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="dni" name="dni" 
               placeholder="Dni" value="<%=resp.getDni()%>"disabled>
    </div>
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
               placeholder="Nombre" value="<%=resp.getNombre()%>"disabled>
    </div>
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="apell" name="apell" 
               placeholder="Apellido" value="<%=resp.getApellido()%>"disabled>
    </div>
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="telf" name="telf"
               placeholder="Telefono" value="<%=resp.getTelefono()%>"disabled>
    </div>
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="direc" name="direc" 
               placeholder="Dirección" value="<%=resp.getDireccion()%>"disabled>
    </div>
    <%
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = formato.format(resp.getFechaNac());
    %>
    <div class="col-sm-6 mb-3">
        <input type="date" class="form-control form-control" id="fechNac" name="fechNac"
               placeholder="Fecha Nacimiento" value="<%= fechaFormateada%>"disabled>
    </div>
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" id="parentesco" name="parentesco" 
               placeholder="Parentesco/Vínculo" value="<%=resp.getTipoResp()%>"disabled>
    </div>

    <form name="editar" action="SvEditResp" method="GET">
        <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: #4e73df ;margin-left: 5px;">
            <i class="fas fa-pencil-alt"></i> Editar   
        </button>
        <input type="hidden" name="idResp" value="<%=resp.getId()%>">
    </form>

    <%@include file="components/bodyFinal.jsp" %>