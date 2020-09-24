<%-- 
    Document   : grado
    Created on : 24/09/2020, 12:51:31 AM
    Author     : Angelo
--%>

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
    </head>
    <body>
        <div class="container-fluid content ">
            <div class="row ">
                <header class="col-12  bg-dark row justify-content-between mx-0 header-content">

                </header>



                <main class="container  main-content "> 
                    <div class="row py-3 px-3">
                        <div class="col-12  py-3 px-5 result-content bg-white">
                            <div class="row justify-content-between px-2">
                                <div class=" col-8">
                                    <h5 class="mt-3">GRADOS :</h5>
                                    <span>Lista de Grados</span>
                                </div>
                                <div class=" col-1">
                                    <button class="btn btn-warning" data-toggle="modal" data-target="#modal-default">NUEVO</button>
                                </div>
                            </div>


                        </div>


                        <div class="col-12 bg-white mt-2 py-4 px-5 result-content mb-5 " id="listaRecursos">

                            <table class="table table-striped table-bordered" id="tbl-alumnos">
                                <thead  class="thead-dark">
                                  <tr>
                                    <th  scope="col" class="text-center">ID</th>
                                    <th  scope="col" class="text-center">GRADO</th>
                                    <th  scope="col" class="text-center">NIVEL</th>
                                    <th  scope="col" class="text-center">Accion</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <%

                                        IGradoDAO gradoDAO = FactoryImpl.getInstance().getGradoService();
                                        List<Grado> gradoList=gradoDAO.obtenerGrados();

                                         for(int i=0;i<gradoList.size();i++){

                                               Grado grado=gradoList.get(i);

                                    %>  
                                  <tr>
                                    <th scope="row" class="text-center"><%=grado.getId() %></th>
                                    <td class="text-center"><%=grado.getNombreGrado() %></td>
                                    <td class="text-center"><%=grado.getNivel() %></td>
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
                                        <form class="form-horizontal px-3" id="frm-clases">


                                            <div class="form-group row justify-content-around">
                                                <label for="grado" class="col-sm-3 control-label">Grado</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" name="grado" id="grado" placeholder="INGRESAR EL GRADO" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="nivel" class="col-sm-3 control-label">Nivel</label>
                                                <div class="col-sm-8">
                                                    <select name="nivel" id="nivel" class="form-control">
                                                        <option value="" disabled selected>SELECCIONAR</option>
                                                        <option value="INICIAL">INICIAL</option>
                                                        <option value="PRIMARIA">PRIMARIA</option>
                                                        <option value="SECUNDARIA">SECUANDARIA</option>
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

                     Grado grado=new Grado();
                    grado.setNombreGrado(request.getParameter("grado").toUpperCase());
                    grado.setNivel(request.getParameter("nivel"));
                    
                   
                    gradoDAO.crearGrado(grado);

                    response.sendRedirect("grado.jsp");
       
            }  
            
            
        %>




        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/header.js"></script>
        <script src="js/table.js"></script>
        <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js"></script>
    </body>
</html>
