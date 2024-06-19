<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Usuario</h1>
<p>Este es el apartado para dar de alta usuarios en el sistema</p>
<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUser" name="nombreUser" 
                   placeholder="Usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="pass" name="pass"
                   placeholder="Contraseña">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol">
        </div>
        
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Usuario
        </button>
</form>

<%@include file="components/bodyFinal.jsp" %>