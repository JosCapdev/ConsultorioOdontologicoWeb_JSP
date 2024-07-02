<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Edición de Usuario</h1>
<p>Este es el apartado para editar un usuario en el sistema</p>
<% Usuario usu =(Usuario)request.getSession().getAttribute("usuEditar"); %>
<form class="user" action="SvEditUsuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUser" name="nombreUser" 
                   placeholder="Usuario" value="<%=usu.getNombreUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="pass" name="pass"
                   placeholder="Contraseña" value="<%=usu.getContrasenia()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol" value="<%=usu.getRol()%>">
        </div>
        
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Modificar Usuario
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>