<%-- 
    Document   : crearUsuario
    Created on : 30-05-2023, 23:50:12
    Author     : sebas
--%>
<%@page import="models.TipoUsuario" %>
<%@page import="dao.DaoTipoUsuario" %>
<%@page import="models.Comuna" %>
<%@page import="dao.DaoComuna" %>
<%@page import="models.Ciudad" %>
<%@page import="dao.DaoCiudad" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script> 
        <link rel="stylesheet" href="css/style.css"> 
        <link rel="stylesheet" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <nav>
                <img src="img/logogrowshop.png" width="100px" style="padding-left: 5px">
                <h1>Growshop</h1>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="ingresar.jsp">Ingresar</a></li>
                </ul>
                <form method="post" action="buscar.jsp">
                    <input type="text" name="consulta" id="consulta">
                    <input type="submit" value="Buscar">
                </form>
                <img src="" width="50px">
                <a href="carrito.jsp">Carrito</a>
            </nav>
        </header>


        <div class="container">
            <%
                DaoCiudad daoCi = new DaoCiudad();
                DaoComuna daoCo = new DaoComuna();
                DaoTipoUsuario daoTU = new DaoTipoUsuario();
            %>
            <form class="form-control-chocolate" method="POST" action="recibeDatos.jsp" autocomplete="off">
                <h2>Agregar Usuario</h2>
                <label for="correo">correo</label>
                <input type="email" placeholder="correo@example.com" name="correo">
                <label for="nom_usuario">Nombre:</label>
                <input type="text" placeholder="Nombre" name="nom_usuario">
                <label for="ap_usuario">Apellido:</label>
                <input type="text" placeholder="apellido" name="app_usuario">
                <label for="direccion">Direccion:</label>
                <input type="text" placeholder="direccion" name="direccion">
                <label for="">Ciudad:</label>

                <select class="" aria-label="Default select example" name="id_ciudad">
                    <option disabled selected hidden>seleccionar...</option>
                    <%
                        for (Ciudad c : daoCi.seleccionar()) {
                    %>
                    <option value="<%= c.getId_ciudad()%>"><%= c.getDesc_ciudad()%></option>
                    <%
                        }
                    %>
                </select>
                <label for="">comuna</label>
                <select class="" aria-label="Default select example" name="id_comuna">
                    <option disabled selected hidden>seleccionar...</option>
                    <%
                        for (Comuna c : daoCo.seleccionar()) {
                    %>
                    <option value="<%= c.getId_comuna()%>"><%= c.getDesc_comuna()%></option>
                    <%
                        }
                    %>
                </select>
                <label for="password">contraseña</label>
                <input type="password" placeholder="password" name="password">

                <label for="">tipo usuario</label>
                <select class="" aria-label="Default select example" name="id_tipo_usuario">
                    <option disabled selected hidden>seleccionar...</option>
                    <%
                        for (TipoUsuario tu : daoTU.seleccionar()) {

                    %>
                    <option value="<%= tu.getId_tipo_usuario()%>"><%= tu.getDesc_tipo_usuario()%></option>
                    <%
                        }
                    %>
                </select>
                <label for="num_telefono">telefono</label>
                <input type="number" name="num_telefono">
                <input type="submit" value="crear usuario">
            </form>
        </div>
        <footer >
            <p>todos los derechos reservados a Skyce</p>
        </footer>

    </body>
</html>
