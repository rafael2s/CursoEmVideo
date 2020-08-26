function loading() {
    var msg = document.getElementById('msg');
    var img = document.getElementById('photoMorning');
    var data = new Date();
    var hora = data.getHours();
    //var hora = 22;
    msg.innerHTML = `Now are ${hora} hours!`

    if (hora >= 0 && hora < 12) {
        // Good morning!
        img.src = '../img/morning.jpg';
        document.body.style.background = "#e2cd9f";
    } else if (hora >= 12 && hora < 18){
        // Good afternoon!
        img.src = '../img/afternoon.jpg'
        document.body.style.background = "#b9846f";
    } else {
        // Good night!
        img.src = '../img/night.jpg'
        document.body.style.background = "#515154"
        
    }

}

