<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>El paciente no se encuentra registrado en el sistema</h1>
<p>Registre el paciente y vuelva crear el turno</p>
<button class="btn" onclick="window.location.href = 'altaPaciente.jsp';" style="color: white;background-color: #4e73df ;margin-left: 5px;">
    Ir a Registrar el paciente</button>

<%@include file="components/bodyFinal.jsp" %>
