<%-- 
    Document   : alumnos
    Created on : 12/08/2020, 11:41:23 AM
    Author     : Angelo
--%>

<%@page import="Bean.Usuario"%>
<%@page import="Bean.Profesor"%>
<%@page import="DAO.IProfesorDAO"%>
<%@page import="Bean.Alumno"%>
<%@page import="java.util.List"%>
<%@page import="DAO.IAlumnoDAO"%>
<%@page import="Factory.FactoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="img/escudosm.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.css" >

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/estandar.css">
    
        <title>Profesores</title>
    </head>
    <body>
        <%
            HttpSession sesion=request.getSession();
            
         %>
        <div class="container-fluid content ">
            <div class="row ">
                <header class="col-12  bg-dark row justify-content-between mx-0 header-content">

                </header>



                <main class="container bg-light main-content "> 
                    <div class="row py-3 px-3">
                        <div class="col-12  py-4 px-5 result-content bg-white">
                            <div class="row justify-content-between px-2">
                                <div class=" col-8">
                                    <h4 class="mt-3">PROFESORES :</h4>
                                </div>
                                <div class=" col-1">
                                    <button class="btn btn-success" data-toggle="modal" data-target="#modal-default">NUEVO</button>
                                </div>
                            </div>


                        </div>


                        <div class="col-12 bg-white mt-4 py-4 px-5 result-content mb-5 " id="listaRecursos">

                            <table class="table table-striped">
                                <thead  class="thead-dark">
                                  <tr>
                                    <th     scope="col">ID</th>
                                    <th  scope="col">Nombre</th>
                                    <th  scope="col">DNI</th>
                                    <th  scope="col">Correo</th>
                                    <th  scope="col">Telefono</th>
                                    <th  scope="col">Accion</th>


                                  </tr>
                                </thead>
                                <tbody>
                                    
                                <%
                                     
                                    IProfesorDAO profesorDAO = FactoryDAO.getInstance().getProfesorService();
                                    List<Profesor> profesorList=profesorDAO.obtenerProfesores();
                                        
                                     for(int i=0;i<profesorList.size();i++){
                                         
                                           Profesor prof=profesorList.get(i);
                                            
                                %>        
                                        <tr>
                                            <th scope="row"><%= prof.getId() %></th>
                                            <td><%= prof.getNombre() %></td>
                                            <td><%= prof.getDni() %></td>
                                            <td><%= prof.getEmail() %></td>
                                            <td><%= prof.getTelefono() %></td>
                                            <td>
                                                <button class="btn btn-primary">Ver</button>
                                                <button class="btn btn-warning">Modificar</button>
                                                <button class="btn btn-danger">Eliminar</button>
                                            </td>


                                          </tr>
                                            
                                            
                                    <%        
                                            
                                        
                                        }
                                    
                                    %>
                                  

                                </tbody>
                              </table>


                        </div>


                    </div>

                    <div class="modal fade" id="modal-default">
                        <div class="modal-dialog ">
                            <div class="modal-content ">
                                    <div class="modal-header ">
                                            <h5 class="modal-title">Nuevo Profesor</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="profesores.jsp" class="form-horizontal px-3" id="frm-clases">
                                            <input type="text" class="form-control" id="id" style="display:none;">

                                            <div class="form-group row justify-content-around">
                                                <label for="usuario" class="col-sm-3 control-label">Usuario</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" name="usuario" id="usuario" placeholder="INGRESAR EL USUARIO" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="password" class="col-sm-3 control-label">Password</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" name="password" id="password" placeholder="INGRESAR EL PASSWORD" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="nombre" class="col-sm-3 control-label">Nombre</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" name="nombre" id="nombre" placeholder="INGRESAR EL NOMBRE" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="dni" class="col-sm-3 control-label">DNI</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control"  name="dni" id="dni" placeholder="INGRESAR EL DNI" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="correo" class="col-sm-3 control-label">Correo</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" name="correo" id="correo" placeholder="INGRESAR EL CORREO" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="telefono" class="col-sm-3 control-label">Telefono</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" name="telefono" id="telefono" placeholder="INGRESAR EL TELEFONO" required>
                                                </div>
                                            </div>


                                            <div class="modal-footer row justify-content-between">
                                                <button type="button" class="btn btn-warning " id="btn-cancelar" data-dismiss="modal">Cerrar</button>

                                                <button type="submit"  name="guardar" class="btn btn-success" id="btn-guardar" >Guardar</button>
                                            </div>
                                        </form>

                                    </div>

                            </div>
                            <!-- /.modal-content -->
                        </div>
                    <!-- /.modal-dialog -->
                    </div>

                </main>

                <footer class="footer-content col-12 text-light ">
                    <span>&copy;2020 WorkFast</span>
                </footer>
            </div>
        </div>
        
         <%
            if(request.getParameter("guardar")!=null){

                    Profesor profesor=new Profesor();   
                    profesor.setNombre(request.getParameter("nombre"));
                    profesor.setEmail(request.getParameter("correo"));
                    profesor.setTelefono(request.getParameter("telefono"));
                    profesor.setDni(request.getParameter("dni"));

                    Usuario usuario=new Usuario();
                    usuario.setUser(request.getParameter("usuario"));
                    usuario.setPassword(request.getParameter("password"));
                    usuario.setRol("prof");

                    profesor.setUsuario(usuario);

                    profesorDAO.crearProfesor(profesor);

                    response.sendRedirect("profesores.jsp");
                
                
                
            }  
            
            
        %>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/header.js"></script>
    </body>
</html>
