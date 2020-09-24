

eventListener();

function eventListener(){
    
}



$('.grado').on("click", function(e){
    e.preventDefault();
    console.log(e.target)
    if(e.target.classList.contains('grado')){

        var grado=e.target;
        var gradoLi=grado.parentElement;
        var seccionUl=gradoLi.childNodes[3];

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
    
})

$('.seccion-plus').on("click", function(e){
    
    var gradoLi=e.target;
    
    var id=gradoLi.getAttribute("data-id");

    
    $('#grado-Id').val(id);
})