
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="models.Usuario"%>
<%@page import="dao.DaoUsuario"%>
<%@ page import="java.util.*" %>
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
        <title>Plataforma de arriendos</title>
        <link rel="stylesheet" href="style.css">
        
    </head>
    <body>
        <header>
            <nav>
                <img src="img/logogrowshop.png" width="100px" >
                <h1>Growshop</h1>
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="ingresar.jsp">Ingresar</a></li>
                    <li><a href="crearUsuario.jsp">Crear usuario</a></li>
                </ul>
                <form method="post" action="buscar.jsp">
                    <input type="text" name="consulta" id="consulta">
                    <input type="submit" value="Buscar">
                </form>
                <img src="img/carrito.png" width="50px">
                <a href="#">Carrito</a>
            </nav>
        </header>
        <main>
            <h2>Listado de Usuario</h2>
            <%
                DaoUsuario daoUsuario = new DaoUsuario();
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            %>
            <table>
                <thead>
                    <tr>
                        <th>ID USUARIO</th>
                        <th>CORREO</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO PATERNO</th>
                        <th>DIRECCION</th>
                        <th>CIUDAD</th>
                        <th>COMUNA</th>
                        <th>TIPO USUARIO</th>
                        <th>TELEFONO</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Usuario usuario : daoUsuario.seleccionar()) {
                    %>
                    <tr>
                        <td><%= usuario.getId_usuario()%></td>
                        <td><%= usuario.getCorreo()%></td>
                        <td><%= usuario.getNom_usuario()%></td>
                        <td><%= usuario.getApp_usuario()%></td>
                        <td><%= usuario.getDireccion()%></td>
                        <td><%= usuario.getCiudad()%></td>
                        <td><%= usuario.getComuna()%></td>
                        <td><%= usuario.getTipo_usuario()%></td>>
                        <td><%= usuario.getNum_telefono()%></td>>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </main>

        <footer>
            <p>&copy; 2023 Plataforma de arriendos. Todos los derechos reservados.</p>
        </footer>
    </body>
</html>
