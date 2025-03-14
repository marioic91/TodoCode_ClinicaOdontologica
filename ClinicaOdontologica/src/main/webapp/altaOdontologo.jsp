<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="componentesJSP/header.jsp"%>
<%@include file="componentesJSP/body1.jsp"%>

<form class="user">
    <div class="form-group row">
        <div class="col-sm-2 mb-0 mb-sm-1">
            <input type="text" class="form-control form-control-user" id="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-4 mb-0 mb-sm-1">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="NOMBRE">
        </div>
        <div class="col-sm-4">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="APELLIDO">
        </div>
    </div>
    <div class="form-group">
        <input type="email" class="form-control form-control-user" id="exampleInputEmail"
               placeholder="Email Address">
    </div>
    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <input type="password" class="form-control form-control-user"
                   id="exampleInputPassword" placeholder="Password">
        </div>
        <div class="col-sm-6">
            <input type="password" class="form-control form-control-user"
                   id="exampleRepeatPassword" placeholder="Repeat Password">
        </div>
    </div>
    <a href="login.html" class="btn btn-primary btn-user btn-block">
        Register Account
    </a>
    <hr>
    <a href="index.html" class="btn btn-google btn-user btn-block">
        <i class="fab fa-google fa-fw"></i> Register with Google
    </a>
    <a href="index.html" class="btn btn-facebook btn-user btn-block">
        <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
    </a>
</form>

<%@include file="componentesJSP/footer.jsp"%>

