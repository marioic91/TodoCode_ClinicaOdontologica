<%@page import="com.mycompany.clinicaodontologica.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="componentesJSP/header.jsp"%>
<%@include file="componentesJSP/body1.jsp"%>

<h1>EDITAR USUARIO</h1>
<h2>FORMULARIO</h2>

<% Usuario usuario = (Usuario) request.getSession().getAttribute("usuario"); %>

<form class="user" action="SvEditarUsuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-2 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                   placeholder="NOMBRE" value="<%=usuario.getNombre()%>">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="CONTRASEÑA" value="<%=usuario.getContrasenia()%>">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="ROL" value="<%=usuario.getRol()%>">
        </div>

    </div>
    
    <button class="btn btn-primary btn-user btn-block" type="submit">
        MODIFICAR
    </button>
</form>

<%@include file="componentesJSP/footer.jsp"%>