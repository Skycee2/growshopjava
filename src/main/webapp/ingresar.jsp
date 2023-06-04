<%-- 
    Document   : ingresar
    Created on : 13-05-2023, 21:07:13
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar</title>
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
    </head>
    <body>
        <link rel="stylesheet" href="css/style.css">
        <header>
            <nav>
                <img src="img/logogrowshop.png" width="100px" >
                <h1>Growshop</h1>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="ingresar.jsp">Ingresar</a></li>
                    <li><a href="registrar.jsp">Registrar</a></li>
                    <li><a href="crearUsuario.jsp">Crear Usuario</a></li>
                </ul>
                <form method="post" action="buscar.jsp">
                    <input type="text" name="consulta" id="consulta">
                    <input type="submit" value="Buscar">
                </form>
                <img src="img/carrito.png" width="50px">
                <a href="#">Carrito</a>
            </nav>
        </header>
        <form action="#" method="post">
            <label for="username">Nombre:</label>
            <input type="text" id="username" name="username"><br>
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password"><br>
            <input type="submit" value="Ingresar">
        </form>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
        %>
        <footer  >
            <p >todos los derechos reservados a Skyce</p>
        </footer>
    </body>
</html>
