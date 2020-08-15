function check(){
    var data = new Date();
    var ano = data.getFullYear();
    var fano = document.getElementById('txtano');
    var res = document.getElementById('res');
    if(fano.value.length == 0 || fano.value > ano){
        window.alert('Check the data and try again...')
    } else {
        var fsex = document.getElementsByName('radsex');
        var idade = ano - Number(fano.value);
        //res.innerHTML = `Idade calculada ${idade}`;
        var genero = '';
        var img = document.createElement('img');
        img.setAttribute('id', 'foto');
        if (fsex[0].checked){
            genero = 'Homem'
            if(idade >= 0 && idade < 10){
                //Crianca
                img.setAttribute('src', '../img/nenemH.jpg');
            } else if (idade < 21){
                // JOVEM
                img.setAttribute('src', '../img/menino.jpg');
            } else if (idade < 50) {
                //adulto
                img.setAttribute('src', '../img/homem.jpg');
            } else {
                //Idoso
                img.setAttribute('src', '../img/idoso.jpg');
            }
        } else if (fsex[1].checked){
            genero = 'Mulher'
            if(idade >= 0 && idade < 10){
                //Crianca
                img.setAttribute('src', '../img/nenemF.jpg');
            } else if (idade < 21){
                // JOVEM
                img.setAttribute('src', '../img/menina.jpg');
            } else if (idade < 50) {
                //adulto
                img.setAttribute('src', '../img/mulher.jpg');
            } else {
                //Idoso
                img.setAttribute('src', '../img/idosa.jpg');
            }    
        }
        res.style.textAlign = 'center';
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img);
    }
}