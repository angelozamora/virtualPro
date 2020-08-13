

eventListener()

function eventListener(){
    document.addEventListener("DOMContentLoaded",iniciarApp);
}

function iniciarApp(e){
    e.preventDefault();

    setTimeout(function(){
        location.href="index.html";
    },3000)

}