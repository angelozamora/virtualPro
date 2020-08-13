//variables
var user=document.getElementById('usuario');


//eventListener

$('#formLogin').on('submit',function (e){
    e.preventDefault();

    console.log("logro entrar");
    
    
    var usuario={
        user : user.value
    };
            
    agregarLocalStorage(usuario);

})


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





//Function