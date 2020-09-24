
var id=getParameterByName("idgs");
var nivel=getParameterByName("nivel");
var sol=getParameterByName("sol");

eventListener()

function eventListener(){
    document.addEventListener("DOMContentLoaded",iniciarApp);
}

function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
    results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}


function iniciarApp(e){
    e.preventDefault();
    console.log("Llego a confirmacion");

    setTimeout(function(){
        if(sol==="1"){
            location.href="alumnos.jsp";
        }
        else if(sol==="2"){
            location.href="profesores.jsp";
        }else{
            location.href="seccion.jsp?idgs="+id+"&nivel="+nivel+"";
        }
        
    },3000);

}