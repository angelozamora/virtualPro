<%-- 
    Document   : signin
    Created on : 01/07/2020, 03:14:07 AM
    Author     : Angelo
--%>




<%@page import="Utils.ConexionBD"%>
<%@page import="Utils.Encriptar"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="img/escudosm.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.css" >

        <link rel="stylesheet" href="css/signin.css">
        <link rel="stylesheet" href="css/animation.css">

        <title>Sign In</title>
    </head>
    <body>
        <%
            Connection con;
            Statement st=null;
            ResultSet rs=null;
            
            Encriptar enc=new Encriptar();
        %>
        
        <div class="container-fluid  content">

                <div class="row content-row">
                    <div class="col-lg-7  index fadeInOut">
                        <div class="row  index-content ">
                            <div class="col-12 text-light pl-5 py-2 index-titulo fadeInDown">
                                <h1 class="titulo2">Virtual Pro</h1>
                            </div>

                        </div>
                    </div>


                    <div class=" col-12 col-lg-5  content-sub">
                    
                        <div class="row  py-4 justify-content-center">
                            <div class="col-10  col-sm-8 col-md-6 col-lg-8 login-content fadeInOpacity" > 
                                <div class="col-12 logo-content">
                                    <div class="form-logo ">
                                        <img src="img/unmsm.jpg" alt="" class="logo-img">
                                        <h1 class="logo-titulo text-white">Sign In</h1>
                                    </div>
                                    
                                </div>
                                
                                <form action="#" id="" class=" col-12  text-white px-4">
                                    <div class="form-group ">
                                        <label for="usuario">USUARIO</label>
                                        <input type="text" id="usuario" name="usuario" class="form-input">
                                    </div>
                                    <div class="form-group">
                                        <label for="password">PASSWORD</label>
                                        <input type="text" id="password" name="password" class="form-input">
                                    </div>
                                    <div class="form-group row justify-content-center mt-4">
                                        
                                            <button type="submit" class=" btn btn-success mx-auto" name="login">INGRESAR</button>

                                        <div class="row col-12 mt-3 text-center">
                                            <span class="col-12 col-md-6  col-lg-12 my-2">
                                                <a href="#">Registrarme</a>
                                            </span>
                                            <span class="col-12 col-md-6  col-lg-12 my-2">
                                                <a href="#">¿Olvidaste tu Contraseña?</a>
                                            </span>
                                            <span class="col-12 col-lg-12 my-2">
                                                <a href="index.jsp">Cancelar</a>
                                            </span>
                                            
                                        </div>
                                    </div>
                
                                </form>

                            </div>
                            
                        </div>
                        
                    </div>

                    <footer class="footer-content col-12 text-light ">
                        <span>&copy;2020 UNMSM</span>
                    </footer>  
                </div>


                
            
        </div>
        
        
        
        
        <%
            
            
            if(request.getParameter("login")!=null){
                
                con=ConexionBD.getInstance().getConnection();

                
                String user=request.getParameter("usuario");
                String password = request.getParameter("password");
                //enc.getMD5(password)
                try{
                    st=con.createStatement();
                    rs=st.executeQuery("CALL SP_validarUsuario('"+user+"','"+password+"');");
                    while(rs.next()){     
                                
                        System.out.println("se logeo un Usuario");
                        session.setAttribute("logueado", "1");
                        session.setAttribute("user", rs.getString("user")); 
                        session.setAttribute("rol", rs.getString("rol"));
                        session.setAttribute("id", rs.getInt("idPersona"));
                                
                       
                    }
                    
                    String url="login.jsp?user="+session.getAttribute("user")+"&&rol="+session.getAttribute("rol");
                   
                       
                    response.sendRedirect(url);

                }
                catch(Exception e){
                       e.getMessage();
                       e.printStackTrace();
                }
            }
 
        
            
         %>





        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>

    </body>
</html>

