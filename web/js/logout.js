

eventListener();

function eventListener(){
    document.addEventListener('DOMContentLoaded',iniciarApp);
}

function iniciarApp(){
    localStorage.removeItem('usuarioPZ');
    location.href="index.html";
}