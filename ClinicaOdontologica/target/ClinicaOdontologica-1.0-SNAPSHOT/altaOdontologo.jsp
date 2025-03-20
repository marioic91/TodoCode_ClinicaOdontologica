<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="componentesJSP/header.jsp"%>
<%@include file="componentesJSP/body1.jsp"%>

<h1>ALTA ODONTOLOGO</h1>
<h2>FORMULARIO</h2>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-2 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="NOMBRE">
        </div>
        <div class="col-sm-4 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="APELLIDO">
        </div>
        <div class="col-sm-2 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="matricula"
                   placeholder="MATRICULA">
        </div>
        <div class="col-sm-3 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="especialidad"
                   placeholder="ESPECIALIDAD">
        </div>
        <div class="col-sm-2 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="fechaNacimiento"
                   placeholder="FECHA DE NACIMIENTO">
        </div>
        <div class="col-sm-6 mb-1 mb-sm-2">
            <input type="text" class="form-control form-control-user" id="fechaNacimiento"
                   placeholder="DIRECCION">
        </div>
    </div>
    
    <a href="" class="btn btn-primary btn-user btn-block">
        REGISTRAR ODONTOLOGO
    </a>
</form>

<%@include file="componentesJSP/footer.jsp"%>

