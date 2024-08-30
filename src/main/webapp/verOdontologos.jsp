<%@page import="Logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Listado de Odontologos</h1>
<p>Este es el apartado para listar odontologos del sistema</p>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Odontologos</h1>
    <p class="mb-4">A continuación podrá visualizar la lista completa de Odontologos</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Odontologos</h6>
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
                            <th>Especialidad</th>
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
                            <th>Especialidad</th>
                        </tr>
                    </tfoot>
                    <% 
                        List<Odontologo>listaOdontologo=(List)request.getSession().getAttribute("listaOdonto");
                    %>
                    <tbody>
                        <% for (Odontologo odonto : listaOdontologo){ %>
                        <tr>
                            <td><%=odonto.getId()%></td>
                            <td><%=odonto.getDni()%></td>
                            <td><%=odonto.getNombre()%></td>
                            <td><%=odonto.getApellido()%></td>
                            <td><%=odonto.getTelefono()%></td>
                            <td><%=odonto.getDireccion()%></td>
                            <td><%=odonto.getFechaNac()%></td>
                            <td><%=odonto.getEspecialidad()%></td>                         
                            <td style="display:flex;width:230px;">
                                <form name="eliminar" action="SvElimOdonto" method="POST">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: red; margin-right: 5px;">
                                        <i class="fas fa-trash-alt"></i> Eliminar   
                                    </button>
                                    <input type="hidden" name="idOdont" value="<%=odonto.getId()%>">
                                </form>
                                
                                <form name="editar" action="SvEditOdonto" method="GET">
                                    <button type="submit" class="btn bnt-primary btn-user btn-block"; style="color: white;background-color: #4e73df ;margin-left: 5px;">
                                        <i class="fas fa-pencil-alt"></i> Editar   
                                    </button>
                                    <input type="hidden" name="idOdont" value="<%=odonto.getId()%>">
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