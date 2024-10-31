<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Paciente"%>
<%@page import="Logica.Controladora"%>
<%@page import="Logica.Responsable"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Listado de Responables de Pacientes</h1>
<!-- Begin Page Content -->
<div class="container-fluid">
    <p class="mb-4">A continuación podrá visualizar la lista completa de Responsables a cargo de un Paciente</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Responsable</h6>
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
                            <th>Parentesco/Vinculo</th>
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
                            <th>Parentesco/Vinculo</th>
                        </tr>
                    </tfoot>
                    <%                        
                        List<Responsable> listaResp = (List) request.getSession().getAttribute("listaResp");
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                    %>
                    <tbody>
                        <% for (Responsable resp : listaResp) {%>
                        <tr>
                            <td><%=resp.getId()%></td>
                            <td><%=resp.getDni()%></td>
                            <td><%=resp.getNombre()%></td>
                            <td><%=resp.getApellido()%></td>
                            <td><%=resp.getTelefono()%></td>
                            <td><%=resp.getDireccion()%></td>
                            <td><%=formato.format(resp.getFechaNac())%></td>
                            <td><%=resp.getTipoResp()%></td> 
                            <td style="display:flex;width:230px;">

                                <form name="editar" action="SvEditResp" method="GET">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: #4e73df ;margin-left: 5px;">
                                        <i class="fas fa-pencil-alt"></i> Editar   
                                    </button>
                                    <input type="hidden" name="idResp" value="<%=resp.getId()%>">
                                </form>
                            </td>
                        </tr>
                        <% }%>
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