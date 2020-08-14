

eventListener();

function eventListener(){
    document.addEventListener('DOMContentLoaded',iniciarApp);
}

function iniciarApp(){
    localStorage.removeItem('usuarioVP');
    location.href="index.jsp";
}