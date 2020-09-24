<%-- 
    Document   : seccion
    Created on : 24/09/2020, 01:14:33 AM
    Author     : Angelo
--%>

<%@page import="Bean.Seccion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.IAdministradorDAO"%>
<%@page import="Bean.Alumno"%>
<%@page import="java.util.List"%>
<%@page import="DAO.IAlumnoDAO"%>
<%@page import="Bean.Grado"%>
<%@page import="DAO.IGradoDAO"%>
<%@page import="FactoryImpl.FactoryImpl"%>
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



        <title>Seccion</title>
    </head>
    <body>
        <%
            int idGradoSeccion = Integer.parseInt(request.getParameter("idgs")+"");
            String nivel = request.getParameter("nivel");
     
        %>
        <div class="container-fluid content ">
        <div class="row ">
            <header class="col-12  bg-dark row justify-content-between mx-0 header-content">
                
            </header>



            <main class="container  main-content "> 
                
                                       
                        <div class="box py-3 px-3  mt-3 result-content bg-white ">
                            
                            <div class="box-header row justify-content-between px-3 " id="box-header-prestamos">
                               <%
                                        
            
                                    IGradoDAO gradoDAO=FactoryImpl.getInstance().getGradoService();
                                    IAdministradorDAO administradorDAO=FactoryImpl.getInstance().getAdministradorService();
                                    Grado grado=gradoDAO.obtenerGradoySeccion(idGradoSeccion);
                                %>
                                <div class=" col-8">
                                    <h5 class="mt-3"><%=grado.getNombreGrado() %> -SECCION <%=grado.getSeccionesList().get(0).getNombreSeccion() %>:</h5>
                                    <span>Lista de Alumnos de la Seccion</span>
                                </div>
                                <div class="col-12 col-lg-2">
                                    <button type="button" class="btn btn-warning" style="font-weight: 400;color: white;"  id="btn-nuevo" data-toggle="modal" data-target="#modal-default">MATRICULAR</button>
                                </div>
                                
                            </div>
                        


                            <div class="box-body  table-responsive  mt-1 py-3 px-3  "
                            id="box-header-prestamos">
                                     
                                <table class="table table-striped table-bordered " id="tbl-seccion" cellspacing="0" width="100%">
                                    <thead  class="thead-dark">
                                        <tr>
                                            <th  class="text-center">ID</th>
                                            <th  class="text-center">NOMBRE</th>
                                            <th  class="text-center">DNI</th>
                                            <th  class="text-center">CORREO</th>
                                            <th  class="text-center">TELEFONO</th>
                                            <th  class="text-center">ACCION</th>
        
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%         
                                                   
  
                                                IAlumnoDAO alumnoDAO= FactoryImpl.getInstance().getAlumnoService();
                                                List<Alumno> alumnoList = alumnoDAO.obtenerAlumnosxGradoxSeccion(idGradoSeccion);
                                                
                                                for(int i=0;i<alumnoList.size();i++){
                                                    Alumno alu=alumnoList.get(i);
                                                   
                                            %>
                                        
                                        <tr>
                                            <th scope="row" class="text-center"><%=alu.getId() %></th>
                                            <td class="text-center"><%=alu.getNombre() %></td>
                                            <td class="text-center"><%=alu.getDni() %></td>
                                            <td class="text-center"><%=alu.getEmail() %></td>
                                                    <td class="text-center"><%=alu.getTelefono() %></td>
                                            <td class="text-center">
                                                <button class="btn btn-primary"> <i class="far fa-eye"></i> </button>
                                                <button class="btn btn-warning"> <i class="far fa-edit"></i> </button>
                                                <button class="btn btn-danger"> <i class="far fa-trash-alt"></i> </button>
                                            </td>
                    
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>

                        
                </div>

                

                <!-- Modal para la Matricula -->
                <div class="modal fade" id="modal-default">
                    <div class="modal-dialog ">
                        <div class="modal-content ">
                                <div class="modal-header ">
                                        <h5 class="modal-title">Nueva Matricula</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                </div>
                                <div class="modal-body">
                                    <form action="" method="POST" class="form-horizontal px-3" id="frm-clases">

                                        <div class="form-group row justify-content-around">
                                            <label for="alumno" class="col-sm-3 control-label">Alumno</label>
                                            <div class="col-sm-8">
                                                
                                                <select name="alumno" id="alumno" class="form-control">
                                                    
                                                    <option value="" disabled selected>SELECCIONAR</option>
                                                    
                                                    <%
                                                         List<Alumno> alumnoList1=alumnoDAO.obtenerAlumnosxNivel(nivel);
                                                            for(int i=0;i<alumnoList1.size();i++){
                                                                Alumno alu2=alumnoList1.get(i);
                                                               
                                                        %>
                                                    <option value="<%=alu2.getId() %>"><%=alu2.getNombre() %></option>
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
            
            //String url="matricular.jsp?idgs="+idGradoSeccion+"&idAlu="+request.getParameter("alumno")+"";
            
            //response.sendRedirect(url);
            
            
                System.out.println("INGRESO A MATRICULAR");
                
                Alumno alu=new Alumno();
                alu.setId(Integer.parseInt(request.getParameter("alumno")));
                
                List<Alumno> alumnoList2=new ArrayList<Alumno>();
                alumnoList2.add(alu);
                 
                Seccion seccion=new Seccion();
                seccion.setAlumnos(alumnoList2);
                
                administradorDAO.matricularAlumnos(idGradoSeccion+"", seccion);

                alu.matriculado();
                alumnoDAO.cambiarEstadoAlumno(alu);
                
                String url="seccion.jsp?idgs="+idGradoSeccion+"&nivel=PRIMARIA";
         
                response.sendRedirect(url);
        }                                       
                                                    
    %>    

                                                        
        
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/table.js"></script>
        <script src="js/header.js"></script>
        <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
    </body>
</html>
