<%-- 
    Document   : matricular
    Created on : 24/09/2020, 06:10:00 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <%
            if(request.getParameter("guardar")!=null){
                System.out.println("INGRESO A MATRICULAR");
                
                Alumno alu=new Alumno();
                alu.setId(Integer.parseInt(request.getParameter("alumno")));
                System.out.println("IEl id es : "+alu.getId());
                
                List<Alumno> alumnoList2=new ArrayList<Alumno>();
                alumnoList2.add(alu);
                 
                Seccion seccion=new Seccion();
                seccion.setAlumnos(alumnoList2);
                
                //administradorDAO.matricularAlumnos(idGradoSeccion+"", seccion);

                alu.matriculado();
                //alumnoDAO.cambiarEstadoAlumno(alu);
                
                //String url="seccion.jsp?idgs="+idGradoSeccion+"&nivel=PRIMARIA";


            }
                                        
                                        
        %>  
        
        
    </body>
</html>
