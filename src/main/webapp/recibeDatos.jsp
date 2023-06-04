<%@page import ="dao.DaoUsuario"%>
<%@page import="models.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
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
        <%
            Usuario usuario = new Usuario();
            DaoUsuario daoCliente = new dao.DaoUsuario();

            usuario.setCorreo(request.getParameter("correo"));
            usuario.setNom_usuario(request.getParameter("nom_usuario"));
            usuario.setApp_usuario(request.getParameter("app_usuario"));
            usuario.setDireccion(request.getParameter("direccion"));
            usuario.setCiudad(Integer.parseInt(request.getParameter("id_ciudad")));
            usuario.setComuna(Integer.parseInt(request.getParameter("id_comuna")));
            usuario.setPassword(request.getParameter("password"));
            usuario.setTipo_usuario(Integer.parseInt(request.getParameter("id_tipo_usuario")));
            usuario.setNum_telefono(Integer.parseInt(request.getParameter("num_telefono")));

            int resultado = daoCliente.agregar(usuario);
        %>
        <script type="text/javascript">
            alert("Se ha insertado <%= resultado%> registros <%= usuario.getTipo_usuario()%>");
            window.location.href = "crearUsuario.jsp";
        </script>
    </body>
</html>
