//variables
var user=getParameterByName("user");
var rol=getParameterByName("rol");


eventListener();

//eventListener
function eventListener(){
    document.addEventListener('DOMContentLoaded',iniciarApp);
}

function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
    results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}


function iniciarApp(e){
     e.preventDefault();

    console.log("logro entrar");
    
    
    var usuario={
        user : user,
        rol : rol
    };
            
    agregarLocalStorage(usuario);
    
    location.href="index.jsp";
}



function obtenerLocalStorage(){
    let usuariosVP;

    if(localStorage.getItem('usuarioVP')==null){
        usuariosVP=[];
    }
    else{
        usuariosVP=JSON.parse(localStorage.getItem('usuarioVP'));
    }

    return usuariosVP;
}

function agregarLocalStorage(usuarioVP){
    var usuarios=obtenerLocalStorage();
    usuarios.push(usuarioVP);

    localStorage.setItem('usuarioVP',JSON.stringify(usuarios));
}

