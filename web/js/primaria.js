

eventListener();

function eventListener(){
    document.addEventListener('click', iniciarApp);
}

function iniciarApp(e){
    e.preventDefault();

    if(e.target.classList.contains('grado')){

        var gradoLi=e.target;
        var seccionUl=e.target.childNodes[1];

        if(gradoLi.classList.contains("gradoActivo")){

            gradoLi.classList.remove('gradoActivo');

            seccionUl.classList.remove('activo');
            seccionUl.classList.add('desactivo');
        }else{

            gradoLi.classList.add('gradoActivo');
            
            seccionUl.classList.remove('desactivo');
            seccionUl.classList.add('activo');
        }

        

    }
    else{
        console.log("otro");
    }
}
