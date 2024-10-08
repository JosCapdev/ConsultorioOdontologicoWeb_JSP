<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Paciente"%>
<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Editar datos del Paciente</h1>
<p>Este es el apartado para editar datos de un paciente en el sistema</p>
<% Paciente pac = (Paciente) request.getSession().getAttribute("pacientEditar");%>
<form class="user" action="SvEditPacient" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni" 
                   placeholder="Dni" value="<%=pac.getDni()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre" 
                   placeholder="Nombre" value="<%=pac.getNombre()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apell" name="apell" 
                   placeholder="Apellido" value="<%=pac.getApellido()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telf" name="telf"
                   placeholder="Telefono" value="<%=pac.getTelefono()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direc" name="direc" 
                   placeholder="Dirección" value="<%=pac.getDireccion()%>">
        </div>
        <%
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = formato.format(pac.getFechaNac());
        %>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control" id="fechNac" name="fechNac"
                   placeholder="Fecha Nacimiento" value="<%= fechaFormateada%>">
        </div>
        <div class="col-sm-6 mb-3">
            <select class="form-control form-control" name="tipoSangre" id="tipoSangre" value="<%=pac.getTipoSangre()%>">
                <option value="" disabled <%= pac.getTipoSangre() == null ? "selected" : ""%>>Tipo de Sangre</option>
                <option value="A+" <%= "A+".equals(pac.getTipoSangre()) ? "selected" : ""%>>A+</option>
                <option value="A-" <%= "A-".equals(pac.getTipoSangre()) ? "selected" : ""%>>A-</option>
                <option value="B+" <%= "B+".equals(pac.getTipoSangre()) ? "selected" : ""%>>B+</option>
                <option value="B-" <%= "B-".equals(pac.getTipoSangre()) ? "selected" : ""%>>B-</option>
                <option value="AB+" <%= "AB+".equals(pac.getTipoSangre()) ? "selected" : ""%>>AB+</option>
                <option value="AB-" <%= "AB-".equals(pac.getTipoSangre()) ? "selected" : ""%>>AB-</option>
                <option value="O+" <%= "O+".equals(pac.getTipoSangre()) ? "selected" : ""%>>O+</option>
                <option value="O-" <%= "O-".equals(pac.getTipoSangre()) ? "selected" : ""%>>O-</option>
            </select>
        </div>
        <div class="col-sm-6 mb-3">
            <label>Posee Obra Social</label>
            <br>
            &nbsp&nbsp
            <input type="radio" name="option" value="si" onclick="uncheckOthers(this)" <%= pac.isTieneOS() == true ? "checked" : ""%>> Si
            &nbsp&nbsp
            <input type="radio" name="option" value="no" onclick="uncheckOthers(this)" <%= pac.isTieneOS() == false ? "checked" : ""%>> No
        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Modificar Paciente
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>