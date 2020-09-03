<%-- 
    Document   : alumnos
    Created on : 12/08/2020, 11:41:23 AM
    Author     : Angelo
--%>

<%@page import="Bean.Curso"%>
<%@page import="DAO.ICursoDAO"%>
<%@page import="java.util.List"%>
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

        <title>CURSOS</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();

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
                                    <h5 class="mt-3">CURSOS :</h5>
                                </div>
                                <div class=" col-1">
                                    <button class="btn btn-success" data-toggle="modal" data-target="#modal-default">NUEVO</button>
                                </div>
                            </div>


                        </div>


                        <div class="col-12 bg-white mt-4 py-4 px-5 result-content mb-5 " id="listaRecursos">

                            <div class="row justify-content-center " id="listaCursos">

                                <%                                    ICursoDAO cursoDAO = FactoryDAO.getInstance().getCursoService();
                                    List<Curso> cursoList = cursoDAO.obtenerCursos();

                                    for (int i = 0; i < cursoList.size(); i++) {
                                        Curso cur = cursoList.get(i);

                                %>

                                <div class="col-11 curso py-2 my-1">
                                    <h4><%=cur.getNombreCurso()%></h4>
                                </div>

                                <%
                                    }
                                %>    

                            </div>





                        </div>





                    </div>

                    <div class="modal fade" id="modal-default">
                        <div class="modal-dialog ">
                            <div class="modal-content ">
                                <div class="modal-header ">
                                    <h5 class="modal-title">Nuevo Curso</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <form accion="cursos.jsp" class="form-horizontal px-3" id="frm-clases">
                                        <input type="text" class="form-control" id="id" style="display:none;">

                                        <div class="form-group row justify-content-around">
                                            <label for="curso" class="col-sm-3 control-label">Curso</label>
                                            <div class="col-sm-8">
                                                <input type="text" style="text-transform:uppercase;" class="form-control" name="curso" id="curso" placeholder="INGRESAR EL CURSO" required>
                                            </div>
                                        </div>




                                        <div class="modal-footer row justify-content-between">
                                            <button type="button" class="btn btn-warning " id="btn-cancelar" data-dismiss="modal">Cerrar</button>

                                            <button type="submit" name="guardar" class="btn btn-success" id="btn-guardar" >Guardar</button>
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
            if (request.getParameter("guardar") != null) {

                Curso curso = new Curso();

                curso.setNombreCurso(request.getParameter("curso").toUpperCase());

                cursoDAO.crearCurso(curso);

                response.sendRedirect("cursos.jsp");
            }

        %>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/header.js"></script>
    </body>
</html>
