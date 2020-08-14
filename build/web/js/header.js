
var header=document.querySelector(".header-content");


//eventListener
eventListener();

function eventListener(){
    document.addEventListener("DOMContentLoaded",iniciarApp);
}

//function
function iniciarApp(e){
    
    e.preventDefault();


    var headerUsuario=``;
    
    var headerinnerHTML=`

            <div class="col-6 col-sm-5 col-md-2 pt-1 pl-4">
                <img src="img/logoSM.png" alt="" id="logoSM">
            </div>

            <nav class="col-5 col-sm-7 col-md-8  navbar navbar-expand-lg navbar-dark bg-dark ">
                <div class="col-12 col-lg-1 row  justify-content-end mx-0">
                    <button class="navbar-toggler " type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                </div>

                <div class="collapse navbar-collapse justify-content-end  " id="navbarNav">
                    <ul class="navbar-nav  justify-content-end ">
                        <li class="nav-item mx-2">
                            <a class="nav-link text-white" href="index.jsp">Home</a>
                        </li>

                
    
        `;

    let usuariosVP=obtenerLocalStorage();

    console.log("LocalStorage");
    console.log(usuariosVP);
    
    if(usuariosVP.length>0){
        var rol=usuariosVP[0].rol;
        console.log("el rol es : "+rol);
        console.log("con usuario");
        
        if(rol==="admin"){
            console.log("usuario ADMIN");
            
            headerUsuario=`
                
                <li class="nav-item dropdown">
                    <a  class="nav-link dropdown-toggle text-white" 
                        data-toggle="dropdown" 
                        href="#" role="button" 
                        aria-haspopup="true" aria-expanded="false"
                    >Maricula</a>
                    <div class="dropdown-menu" >
                        <a class="dropdown-item" href="inicial.jsp">Inicial</a>
                        <a class="dropdown-item" href="primaria.jsp"> Primaria</a>
                        <a class="dropdown-item" href="secundaria.jsp">Secundaria</a>
                    </div>
                </li>


                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="cursos.jsp">Cursos</a>
                </li>
                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="alumnos.jsp">Alumnos</a>
                </li>
                <li class="nav-item  mx-2" >
                    <a class="nav-link text-white" href="profesores.jsp">Profesores</a>
                </li>
                
            `;
            
        }else if(rol==="prof"){
            console.log("usuario PROFESOR");
            
            headerUsuario=`
                
                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="cursosProfesor.jsp">Mis Cursos</a>
                </li>
                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="actividadesProfesor.jsp">Actividades</a>
                </li>

            `;
            
        }
        else if(rol==="alumn" || rol==="user"){
            console.log("usuario USER O ALUMN");
            
            headerUsuario=`
                
                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="misCursos.jsp">Mis Cursos</a>
                </li>
                <li class="nav-item mx-2">
                    <a class="nav-link text-white" href="notas.jsp">Notas</a>
                </li>

            `;
            
        }
        
        
        
        
        headerUsuario=headerUsuario+`
        
                    <li class="nav-item  ">     
                        <a class=" nav-link " href="#"><span class="text-white">${usuariosVP[0].user}</span></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a  class="nav-link dropdown-toggle" 
                        data-toggle="dropdown" 
                        href="#" role="button" 
                        aria-haspopup="true" aria-expanded="false"
                        ><i class=" fas fa-user-circle user"></i></a>
                        <div class="dropdown-menu " id="dp">
                            <a class="dropdown-item" href="#">Perfil</a>
                            <a class="dropdown-item" href="logout.jsp">Cerra Sesion</a>
                        </div>
                    </li>
                </ul>

            </div>

        </nav>
        
        `


        headerinnerHTML=headerinnerHTML+headerUsuario;

    }
    else{

        console.log("sin usuario");

        headerinnerHTML=headerinnerHTML+`
        
                    <li class="nav-item  ">

                        <a class="btn btn-success " href="signin.jsp">Iniciar Sesion</a>
                        </li>


                </ul>

            </div>

        </nav>
            
            
        `
    }
    
    header.innerHTML=headerinnerHTML;
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
