<%-- 
    Document   : primaria
    Created on : 24/09/2020, 01:09:30 AM
    Author     : Angelo
--%>

<%@page import="Bean.Curso"%>
<%@page import="DAO.ICursoDAO"%>
<%@page import="Bean.Seccion"%>
<%@page import="DAO.ISeccionDAO"%>
<%@page import="Bean.Grado"%>
<%@page import="java.util.List"%>
<%@page import="FactoryImpl.FactoryImpl"%>
<%@page import="DAO.IGradoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="img/escudosm.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap/bootstrap.css" >
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/estandar.css">
        <link rel="stylesheet" href="css/primaria.css">


        <title>Primaria</title>
    </head>
    <body>
        <%
            HttpSession sesion=request.getSession();
            
         %>
        <div class="container-fluid content ">
            <div class="row ">
                <header class="col-12  bg-dark row justify-content-between mx-0 header-content">

                </header>



                <main class="container  main-content "> 
                    <div class="row py-3 px-3">
                        <div class="col-12  py-4 px-5 result-content bg-white">
                            <div class="row justify-content-between px-2">
                                <div class=" col-8">
                                    <h5 class="mt-3">PRIMARIA :</h5>
                                    <span>Lista de Grados de Primaria</span>
                                </div>
                                <div class=" col-2">
                                    <button class="btn btn-warning" data-toggle="modal" data-target="#modal-default">NUEVO GRADO</button>
                                </div>
                            </div>


                        </div>


                        <div class="col-12 bg-white mt-2 py-4 px-2 result-content mb-5 " id="listaRecursos">

                            <ul>
                                <%
                                    IGradoDAO gradoDAO=FactoryImpl.getInstance().getGradoService();
                                    ISeccionDAO seccionDAO = FactoryImpl.getInstance().getSeccionService();
                                    List<Grado> gradoList=gradoDAO.obtenerGradosxNivel("PRIMARIA");
                                    
                                        for(int i=0;i<gradoList.size();i++){
                                            Grado grado=gradoList.get(i);
                                
                                %>
                                <li class="mt-2">
                                    <span class="grado">
                                        <i class="fas fa-graduation-cap mr-2 grado-icon"></i><%=grado.getNombreGrado() %><i class="fas fa-angle-down ml-2 grado-icon"></i>
                                    </span>

                                    <ul class="seccion desactivo">
                                        
                                        <%
                                        
                                            grado.setSeccionesList(seccionDAO.obtenerSeccionesxGrado(grado.getId()));
                                            
                                            for(int j=0;j<grado.getSeccionesList().size();j++){
                                                Seccion seccion=grado.getSeccionesList().get(j);
                                            
                                        
                                        %>
                                        <li>
                                            <a href="seccion.jsp?idgs=<%=seccion.getId() %>&nivel=PRIMARIA"  class="seccion">
                                                <i class="fas fa-layer-group mr-1"></i>SECCION  <%=seccion.getNombreSeccion() %>
                                            </a>
                                        </li>
                                        
                                        <%
                                            }
                                        %>
                                        
                                        <li >
                                            <a class="seccion seccion-plus" href="" data-id="<%=grado.getId() %>" data-toggle="modal" data-target="#modal-seccion-default">
                                                <i class="fas fa-plus-circle mr-1"></i>Nueva Seccion ...
                                            </a>
                                        </li>
                                    </ul>

                                </li>
                                
                                
                                <%
                                    }
                                %>
                                
                                
                            </ul>



                        </div>


                    </div>

                    <div class="modal fade" id="modal-default">
                        <div class="modal-dialog ">
                            <div class="modal-content ">
                                    <div class="modal-header ">
                                            <h5 class="modal-title">Nuevo Grado</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                    </div>
                                    <div class="modal-body">
                                        
                                        <form action="primaria.jsp?asd=1" method="POST" class="form-horizontal px-3" id="frm-clases">
                                            

                                            
                                            <div class="form-group row justify-content-around">
                                                <label for="grado" class="col-sm-3 control-label">Grado</label>
                                                <div class="col-sm-8">    
                                                    <select name="" id="" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                           List<Grado> gradoList2=gradoDAO.obtenerGradosxNivel("PRIMARIA");
                                                           for(int i=0;i<gradoList2.size();i++){
                                                               Grado grado2=gradoList2.get(i);
                                                        %>
                                                        <option value="<%=grado2.getId() %>"><%=grado2.getNombreGrado() %></option>
                                                        
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>
                                                    
                                            <%
                                                ICursoDAO cursoDAO=FactoryImpl.getInstance().getCursoService();
                                                List<Curso> cursoLisrt=cursoDAO.obtenerCursos();
                                            
                                            %>

                                            <div class="form-group row justify-content-around">
                                                <label for="curso1" class="col-sm-3 control-label">Curso 1</label>
                                                <div class="col-sm-8">
                                                    <select name="curso1" id="" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        %>
                                                        
                                                        <option value="<%=curso.getId() %>"><%=curso.getNombreCurso() %></option>
                                                      
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="curso2" class="col-sm-3 control-label">Curso 2</label>
                                                <div class="col-sm-8">
                                                    <select name="curso2" id="" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        %>
                                                        
                                                        <option value="<%=curso.getId() %>"><%=curso.getNombreCurso() %></option>
                                                      
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="curso3" class="col-sm-3 control-label">Curso 3</label>
                                                <div class="col-sm-8">
                                                    <select name="curso3" id="" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        %>
                                                        
                                                        <option value="<%=curso.getId() %>"><%=curso.getNombreCurso() %></option>
                                                      
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="curso4" class="col-sm-3 control-label">Curso 4</label>
                                                <div class="col-sm-8">
                                                    <select name="curso4" id="" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        %>
                                                        
                                                        <option value="<%=curso.getId() %>"><%=curso.getNombreCurso() %></option>
                                                      
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>




                                            <div class="modal-footer row justify-content-between">
                                                <button type="button" class="btn btn-warning " id="btn-cancelar" data-dismiss="modal">Cerrar</button>

                                                <button type="submit" class="btn btn-success" name="guardar-grado" id="btn-guardar-grado" >Guardar</button>
                                            </div>
                                        </form>

                                    </div>

                            </div>
                            <!-- /.modal-content -->
                        </div>
                    <!-- /.modal-dialog -->
                    </div>

                    <!-- Modal para la Seccion -->
                    <div class="modal fade" id="modal-seccion-default">
                        <div class="modal-dialog ">
                            <div class="modal-content ">
                                    <div class="modal-header ">
                                            <h5 class="modal-title">Nueva Seccion</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                    </div>
                                    <div class="modal-body">
                                        <form  action=""  class="form-horizontal px-3" id="frm-clases">
                                            
                                            <div class="form-group row justify-content-around">
                                                <label for="grado-Id" class="col-sm-3 control-label">Grado Id</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" name="grado-Id" id="grado-Id" readonly  required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="seccion-add" class="col-sm-3 control-label">Seccion</label>
                                                <div class="col-sm-8">
                                                    <select name="seccion-add" id="seccion-add" class="form-control" required="">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <%
                                                            List<Seccion> seccionList1=seccionDAO.obtenerSecciones();
                                                            for(int i=0;i<seccionList1.size();i++){
                                                                Seccion seccion1=seccionList1.get(i);
                                                            
                                                        %>
                                       
                                                        <option value="<%=seccion1.getId() %>"><%=seccion1.getNombreSeccion() %></option>
                                                      
                                                        <%
                                                            }
                                                        %>
                                                    </select>
                                                </div>
                                            </div>


                                            <div class="modal-footer row justify-content-between">
                                                <button type="button" class="btn btn-warning " id="btn-cancelar" data-dismiss="modal">Cerrar</button>

                                                <button type="submit" class="btn btn-success" name="guardar" id="btn-guardar" >Guardar</button>
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
                
                
                int idGrado=Integer.parseInt(request.getParameter("grado-Id")+"");
                int idSeccion=Integer.parseInt(request.getParameter("seccion-add")+"");

                    
                gradoDAO.agregarSeccionaGrado(idGrado, idSeccion);
                gradoDAO.obtenerGrados();
           
                
                
            }  
            
            
        %>
        
        <%
            if(request.getParameter("guardar-grado")!=null){
                
                
                response.sendRedirect("profesores.jsp");
           
                
                
            }  
        
        %>
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/header.js"></script>
        <script src="js/primaria.js"></script>
        
        
        
    </body>
</html>
