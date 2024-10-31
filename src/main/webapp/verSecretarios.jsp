<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Secretario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Listado de Secretarios</h1>
<!-- Begin Page Content -->
<div class="container-fluid">
    <p class="mb-4">A continuación podrá visualizar la lista completa de Secretarios</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Secretarios</h6>
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
                            <th>Sector</th>
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
                            <th>Sector</th>
                        </tr>
                    </tfoot>
                    <% 
                        List<Secretario>listaSecretario=(List)request.getSession().getAttribute("listaSec");
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                    %>
                    <tbody>
                        <% for (Secretario sec : listaSecretario){ %>
                        <tr>
                            <td><%=sec.getId()%></td>
                            <td><%=sec.getDni()%></td>
                            <td><%=sec.getNombre()%></td>
                            <td><%=sec.getApellido()%></td>
                            <td><%=sec.getTelefono()%></td>
                            <td><%=sec.getDireccion()%></td>
                            <td><%=formato.format(sec.getFechaNac())%></td>
                            <td><%=sec.getSector()%></td>                         
                            <td style="display:flex;width:230px;">
                                <form name="eliminar" action="SvElimOdonto" method="POST">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: red; margin-right: 5px;">
                                        <i class="fas fa-trash-alt"></i> Eliminar   
                                    </button>
                                    <input type="hidden" name="idSec" value="<%=sec.getId()%>">
                                </form>
                                
                                <form name="editar" action="SvEditSec" method="GET">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: #4e73df ;margin-left: 5px;">
                                        <i class="fas fa-pencil-alt"></i> Editar   
                                    </button>
                                    <input type="hidden" name="idSec" value="<%=sec.getId()%>">
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