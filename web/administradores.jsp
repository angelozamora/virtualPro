<%-- 
    Document   : administradores
    Created on : 24/09/2020, 01:11:33 AM
    Author     : Angelo
--%>

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


        <title>Administrador</title>
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
                                    <h5 class="mt-3">ADMINISTRADORES :</h5>
                                    <span>Lista de Adminsitradores</span>
                                </div>
                                <div class=" col-1">
                                    <button class="btn btn-warning" data-toggle="modal" data-target="#modal-default">NUEVO</button>
                                </div>
                            </div>


                        </div>


                        <div class="col-12 bg-white mt-2 py-4 px-5 result-content mb-5 " id="listaRecursos">

                            <table class="table table-striped table-bordered" id="tbl-administradores">
                                <thead  class="thead-dark">
                                  <tr>
                                    <th  scope="col">ID</th>
                                    <th  scope="col">Nombre</th>
                                    <th  scope="col">DNI</th>
                                    <th  scope="col">Correo</th>
                                    <th  scope="col">Telefono</th>
                                    <th  scope="col">Accion</th>


                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <th scope="row" class="text-center">1</th>
                                    <td class="text-center">Angelo</td>
                                    <td class="text-center">71718989</td>
                                    <td class="text-center">angelo@gmail.com</td>
                                    <td class="text-center">99999999</td>
                                    <td class="text-center">
                                        <button class="btn btn-primary"> <i class="far fa-eye"></i> </button>
                                        <button class="btn btn-warning"> <i class="far fa-edit"></i> </button>
                                        <button class="btn btn-danger"> <i class="far fa-trash-alt"></i> </button>
                                    </td>


                                  </tr>

                                </tbody>
                              </table>



                        </div>


                    </div>

                    <div class="modal fade" id="modal-default">
                        <div class="modal-dialog ">
                            <div class="modal-content ">
                                    <div class="modal-header ">
                                            <h5 class="modal-title">Nuevo Administrador</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                    </div>
                                    <div class="modal-body">
                                        <form class="form-horizontal px-3" id="frm-clases">
                                            <input type="text" class="form-control" id="id" style="display:none;">

                                            <div class="form-group row justify-content-around">
                                                <label for="usuario" class="col-sm-3 control-label">Usuario</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="usuario" placeholder="INGRESAR EL USUARIO" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="Password" class="col-sm-3 control-label">Password</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="password" placeholder="INGRESAR EL PASSWORD" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="nombre" class="col-sm-3 control-label">Nombre</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" id="nombre" placeholder="INGRESAR EL NOMBRE" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="dni" class="col-sm-3 control-label">DNI</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" id="dni" placeholder="INGRESAR EL DNI" required>
                                                </div>
                                            </div>


                                            <div class="form-group row justify-content-around">
                                                <label for="correo" class="col-sm-3 control-label">Correo</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" id="correo" placeholder="INGRESAR EL CORREO" required>
                                                </div>
                                            </div>

                                            <div class="form-group row justify-content-around">
                                                <label for="telefono" class="col-sm-3 control-label">Telefono</label>
                                                <div class="col-sm-8">
                                                    <input type="text" style="text-transform:uppercase;"class="form-control" id="telefono" placeholder="INGRESAR EL TELEFONO" required>
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
