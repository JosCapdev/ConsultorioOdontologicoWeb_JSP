<%@page import="Logica.Controladora"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<%@include file="components/header.jsp"%>
<% HttpSession misesion = request.getSession();
       Controladora control = new Controladora();
       Usuario user = (Usuario) request.getSession().getAttribute("usuario");
       if(control.EsAdmin(user.getNombreUsuario(), user.getContrasenia())){ %>
            <%@include file="components/bodyPrimeraParteAdmin.jsp" %>
        <%}else{ %>
            <%@include file="components/bodyPrimeraParte.jsp" %>
        <%}%>   
<p>Ubicado en etc etc....</p>
<img src="https://i.pinimg.com/originals/d7/9e/74/d79e746e06b9298be186a7797318b8d4.jpg" alt="alt" height="400" width="500"/>
<%@include file="components/bodyFinal.jsp" %>

</html>