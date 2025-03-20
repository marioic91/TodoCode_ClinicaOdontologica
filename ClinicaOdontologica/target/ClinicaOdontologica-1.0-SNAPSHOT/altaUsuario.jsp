<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="componentesJSP/header.jsp"%>
<%@include file="componentesJSP/body1.jsp"%>

<h1>ALTA USUARIO</h1>
<h2>FORMULARIO</h2>

<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-2 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                   placeholder="NOMBRE">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="CONTRASEÑA">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="ROL">
        </div>

    </div>
    
    <button class="btn btn-primary btn-user btn-block" type="submit">
        REGISTRAR USUARIO
    </button>
</form>

<%@include file="componentesJSP/footer.jsp"%>