<%@page import="java.time.ZoneId"%>
<%@page import="java.time.LocalDate"%>
<%@page import="Logica.Paciente"%>
<%@page import="Logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Listado de Pacientes</h1>
<!-- Begin Page Content -->
<div class="container-fluid">
    <p class="mb-4">A continuación podrá visualizar la lista completa de Pacientes</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Pacientes</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Dni</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>Fecha Nac.</th>
                            <th>Tipo de Sangre</th>
                            <th>Obra Social</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Dni</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>Fecha Nac.</th>
                            <th>Tipo de Sangre</th>
                            <th>Obra Social</th>
                        </tr>
                    </tfoot>
                    <% 
                        List<Paciente>listaPaciente=(List)request.getSession().getAttribute("listaPac");
                    %>
                    
                        <% for (Paciente pac : listaPaciente){ %>
                            <%LocalDate fech= pac.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();%>
                            <td><%=pac.getId()%></td>
                            <td><%=pac.getDni()%></td>
                            <td><%=pac.getNombre()%></td>
                            <td><%=pac.getApellido()%></td>
                            <td><%=pac.getTelefono()%></td>
                            <td><%=pac.getDireccion()%></td>
                            <td><%=fech.getDayOfMonth()+"/"+fech.getMonthValue()+"/"+fech.getYear()%></td>
                            <td><%=pac.getTipoSangre()%></td>
                            <td><%=pac.isTieneOS()==true?"Si":"No"%></td>        
                            <td style="display:flex;width:230px;">
                                <form name="eliminar" action="SvElimPacient" method="POST">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: red; margin-right: 5px;">
                                        <i class="fas fa-trash-alt"></i> Eliminar   
                                    </button>
                                    <input type="hidden" name="idPacient" value="<%=pac.getId()%>">
                                </form>
                                
                                <form name="editar" action="SvEditPacient" method="GET">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: #4e73df ;margin-left: 5px;">
                                        <i class="fas fa-pencil-alt"></i> Editar   
                                    </button>
                                    <input type="hidden" name="idPacient" value="<%=pac.getId()%>">
                                </form>
                            </td>
                        
                        <% } %>
                    
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include file="components/bodyFinal.jsp" %>