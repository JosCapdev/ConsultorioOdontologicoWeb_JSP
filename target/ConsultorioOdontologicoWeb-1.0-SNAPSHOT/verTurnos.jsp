<%@page import="Logica.Turno"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Listado de Turnos</h1>
<p>Este es el apartado para listar los turnos del sistema</p>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Turnos</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Fecha Turno</th>
                            <th>Hora</th>
                            <th>Paciente</th>
                            <th>Afección</th>
                            <th>Profesional</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Fecha Turno</th>
                            <th>Hora</th>
                            <th>Paciente</th>
                            <th>Afección</th>
                            <th>Profesional</th>
                        </tr>
                    </tfoot>
                    <% 
                        List<Turno>listaTurnos=(List)request.getSession().getAttribute("listaTurn");
                    %>
                    <tbody>
                        <% for (Turno turn : listaTurnos){ %>
                        <tr>
                            <td><%=turn.getIdTurno()%></td>
                            <td><%=turn.getFechaTurno()%></td>
                            <td><%=turn.getHoraTurno()%></td>
                            <%String pacienteNAD= turn.getPacient().getNombre()+" "+
                                    turn.getPacient().getApellido()+" "+turn.getPacient().getDni();
                            %>
                            <td><%=pacienteNAD%></td>
                            <td><%=turn.getAfeccion()%></td>
                            <td><%=turn.getOdont().getApellido()%></td>
                            
                            <td style="display:flex;width:230px;">
                                <form name="eliminar" action="SvElimTurno" method="POST">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: red; margin-right: 5px;">
                                        <i class="fas fa-trash-alt"></i> Eliminar   
                                    </button>
                                    <input type="hidden" name="idTurn" value="<%=turn.getIdTurno()%>">
                                </form>
                            </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include file="components/bodyFinal.jsp" %>