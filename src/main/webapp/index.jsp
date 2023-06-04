<%-- 
    Document   : index
    Created on : 24-04-2023, 16:56:45
    Author     : javie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <title>GrowShop</title>
    </head>
    <body>
        <header>
            <nav>
                <img src="img/logogrowshop.png" width="100px">
                <h1>Growshop</h1>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="ingresar.jsp">Ingresar</a></li>
                    <li><a href="crearUsuario.jsp">Crear Usuario</a></li>
                    <li><a href="MostrarUsuarios.jsp">Listar usuarios</a></li>
                </ul>
                <form method="post" action="buscar.jsp">
                    <input type="text" name="consulta" id="consulta">
                    <input type="submit" value="Buscar">
                </form>
                <img src="img/carrito.png" width="50px">
                <a href="carrito.jsp">Carrito</a>
            </nav>
        </header>

        <div class="card">
            <h3>Productos nuevos</h3>
            <img src="" alt="Imagen 1">

            <p> </p>
        </div>

        <div class="card">
            <h3>Más vendido</h3>
            <img src="" alt="Imagen 2">

            <p></p>
        </div>

        <div class="card">
            <h3>aaaaaaaa</h3>
            <img src="" alt="Imagen 3">
            <p></p>
        </div>

        <footer>
            <p>todos los derechos reservados a Skyce</p>
        </footer>

    </body>
</html>
