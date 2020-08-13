<%-- 
    Document   : registro
    Created on : 01/07/2020, 04:12:06 AM
    Author     : Angelo
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Utils.Encriptar"%>
<%@page import="Utils.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="icon" href="img/icon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap/bootstrap.css" >

    <link rel="stylesheet" href="css/registro.css">
    <link rel="stylesheet" href="css/animation.css">

    <title>Registro</title>
  </head>
  <body>
     
    <%
         ConexionBD conBD=new ConexionBD();
         Connection con=conBD.getConnection();
         Statement st=null;
         ResultSet rs=null;
        
        Encriptar enc=new Encriptar();
    %>
    <div class="container-fluid content  pt-2">
        <div class="row  justify-content-center mt-3" >

            <div class="col-12 col-sm-10 col-md-5 row justify-content-center py-3" >
                <div class="col-10  py-2 fadeInDown2">
                    <img src="img/logoWK.png" alt=""  id="logoWK">
                </div>
                <form action="registro.jsp" class="form  col-11   mt-3  ">
                    <div class="row header-form  mb-2"></div>
                    
                    
        
                    <div class="form-group row justify-content-center">
                        <label for="user" class="col-3  col-form-label">USUARIO</label>
                        <div class="col-8">
                            <input type="text" id="user" name="user" class="form-control" required>
                        </div>
                    </div>
                    <div class="form-group row justify-content-center">
                        <label for="password" class="col-3  col-form-label">PASSWORD</label>
                        <div class="col-8">
                            <input type="password" id="password" name="password" class="form-control" required>
                        </div>
                    </div>
                    
                    <%
                        if("per".equals(request.getParameter("tipo"))){
                            
                     %>
                    
                    <div class="form-group row justify-content-center ">
                        <label for="dni" class="col-3  col-form-label">DNI</label>
                        <div class="col-8">
                            <input type="text" name="dni"  id="dni" class="form-control" required>
                        </div>
                        
                    </div>
                    <div class="form-group row justify-content-center ">
                        <label for="nombre" class="col-3  col-form-label">NOMBRE</label>
                        <div class="col-8">
                            <input type="text" id="nombre" name="nombre" class="form-control" required>
                        </div>
                        
                    </div>
                    
                    
                    
                    <div class="form-group row justify-content-center">
                        <label for="telefono" class="col-3  col-form-label">TELEFONO</label>
                        <div class="col-8">
                            <input type="text" id="telefono" name="telefono" class="form-control" required>
                        </div>
                    </div>

                    <div class="form-group row justify-content-center">
                        <label for="puesto" class="col-3  col-form-label">PUESTO</label>
                        <div class="col-8">
                            <select name="puesto" class=" form-control" required>
                                <option value="" selected disabled>Elige un puesto</option>
                                
                                <%
                                    try{
                                        st=con.createStatement();
                                        rs=st.executeQuery("SELECT * FROM puesto_trabajo");
                                        while(rs.next()){
                                            
                                   %>
                                <option  value="<%=rs.getInt("idpuesto")%>"><%=rs.getString("puesto")%></option>
                                <%     }
                                    }catch(Exception e){
                                          e.getMessage();
                                          e.printStackTrace();
                                    }
                                %>
                                
                            </select>
                        </div>
                    </div>
                    
                    <div class="form-group row  justify-content-around  pt-3">
                        <a class="btn btn-danger text-light" href="signin.jsp">CANCELAR</a>
                        <button type="submit" name="registrar" class="btn btn-success">REGISTRAR</button>
                    </div>
                                
                    <%
                       }
                        else{
                    %>
                        
                        <div class="form-group row justify-content-center ">
                            <label for="ruc" class="col-3  col-form-label">RUC</label>
                            <div class="col-8">
                                <input type="text" name="ruc"  id="ruc" class="form-control" required>
                            </div>
                        
                        </div>
                        <div class="form-group row justify-content-center ">
                            <label for="razonSocial" class="col-3  col-form-label">RAZON SOCIAL</label>
                            <div class="col-8">
                                <input type="text" id="razonSocial" name="razonSocial" class="form-control" required>
                            </div>

                        </div>

                        <div class="form-group row justify-content-center">
                            <label for="telefonoOrg" class="col-3  col-form-label">TELEFONO</label>
                            <div class="col-8">
                                <input type="text" id="telefonoOrg" name="telefonoOrg" class="form-control" required>
                            </div>
                        </div>
                        
                        <div class="form-group row justify-content-center">
                            <label for="direccion" class="col-3  col-form-label">DIRECCION</label>
                            <div class="col-8">
                                <input type="text" id="direccion" name="direccion" class="form-control" required>
                            </div>
                        </div>

      
                    
                    <div class="form-group row  justify-content-around  pt-3">
                        <a class="btn btn-danger text-light" href="signin.jsp">CANCELAR</a>
                        <button type="submit" name="registrarOrg" class="btn btn-success">REGISTRAR</button>
                    </div>
                    
                    
                    
                    <%
                        }
                    %>            
                                
                </form>

            </div>


            <%
              
            if(request.getParameter("registrar")!=null){
                
                String dni=request.getParameter("dni");
                String nombre=request.getParameter("nombre");
                String user=request.getParameter("user");
                String password=request.getParameter("password");
                String telefono=request.getParameter("telefono");
                String puesto=request.getParameter("puesto");
                
                st=con.createStatement();
                st.executeUpdate("INSERT INTO persona (dni, nombre, sexo, fechaNac, telefono, puntaje, idpuesto) "
                        +"VALUES ('"+dni+"','"+nombre+"','none','0000-00-00','"+telefono+"', '0', '"+puesto+"');");
                
                
                
                st.executeUpdate("INSERT INTO usuario (user, password, dni, idorganizacion, tipo) "
                +"VALUES ('"+user+"', '"+enc.getMD5(password)+"', '"+dni+"', '5', 'per');");
                
                response.sendRedirect("confirmacion2.jsp");
                   
                
            }
            


            if(request.getParameter("registrarOrg")!=null){
                
                String ruc=request.getParameter("ruc");
                String razonSocial=request.getParameter("razonSocial");
                String user=request.getParameter("user");
                String password=request.getParameter("password");
                String telefonoOrg=request.getParameter("telefonoOrg");
                String direccion=request.getParameter("direccion");
                 String idorganizacion="";
                
                st=con.createStatement();
                st.executeUpdate("INSERT INTO organizacion (ruc, razonSocial, telefono, direccion) "
                        +"VALUES ('"+ruc+"','"+razonSocial+"','"+telefonoOrg+"','"+direccion+"');");
                                
                rs=st.executeQuery("SELECT * FROM organizacion WHERE ruc="+ruc);
                while(rs.next()){
                   idorganizacion=rs.getInt("idorganizacion")+"";
                }
                

                st.executeUpdate("INSERT INTO usuario (user, password, dni, idorganizacion, tipo) "
                +"VALUES ('"+user+"', '"+enc.getMD5(password)+"', '0','"+idorganizacion+"', 'org');");
                
               
                
                response.sendRedirect("confirmacion2.jsp");
                   
                
            }
                
            %>




            <footer class="footer-content col-12 text-light ">
                <span>&copy;2020 WorkFast</span>
            </footer>
        </div>

    </div>
   


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
  </body>
</html>
