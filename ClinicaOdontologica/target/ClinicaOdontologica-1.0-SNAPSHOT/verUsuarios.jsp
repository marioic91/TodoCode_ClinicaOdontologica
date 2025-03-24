<%@page import="com.mycompany.clinicaodontologica.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="componentesJSP/header.jsp"%>
<%@include file="componentesJSP/body1.jsp"%>

<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">TABLA</h1>
    <p class="mb-4">USUARIOS</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista de Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ROL</th>
                        <th style="width: 300px">ACCION</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ROL</th>
                        <th style="width: 300px">ACCION</th>
                        </tr>
                    </tfoot>
                    <% List <Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios"); %>
                    <tbody>
                        <% for(Usuario i:listaUsuarios){ %>
                        <tr>
                        <td><%=i.getId() %></td>
                        <td><%=i.getNombre() %></td>
                        <td><%=i.getRol() %></td>
                        <td style="display: flex" width="300px">
                            <form name="eliminar" action="SvEliminarUsuario" method="POST">
                                <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:10px">
                                <i class="fas fa-trash"> ELIMINAR</i>
                                </button>
                                <input type="hidden" name="id" value="<%=i.getId() %>">
                            </form>
                            <form name="editar" action="SvEditarUsuario" method="GET">
                                <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:blue; margin-left:10px">
                                <i class="fas fa-pencil"> EDITAR</i>
                                </button>
                                <input type="hidden" name="id" value="<%= i.getId() %>">
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

<%@include file="componentesJSP/footer.jsp"%>