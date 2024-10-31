<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Responsable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Editar datos del Responsable del Paciente </h1>
<p>Este es el apartado para editar datos de un Responsable de un paciente en el sistema</p>
<% Responsable resp = (Responsable) request.getSession().getAttribute("respEditar");%>
<form class="user" action="SvEditResp" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" 
                   placeholder="Dni" value="<%=resp.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
                   placeholder="Nombre" value="<%=resp.getNombre()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apell" name="apell" 
                   placeholder="Apellido" value="<%=resp.getApellido()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telf" name="telf"
                   placeholder="Telefono" value="<%=resp.getTelefono()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direc" name="direc" 
                   placeholder="Dirección" value="<%=resp.getDireccion()%>">
        </div>
        <%
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = formato.format(resp.getFechaNac());
        %>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control" id="fechNac" name="fechNac"
                   placeholder="Fecha Nacimiento" value="<%= fechaFormateada%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="parentesco" name="parentesco" 
                   placeholder="Parentesco/Vínculo" value="<%=resp.getTipoResp()%>">
        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Editar
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>