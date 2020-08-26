function count(){
    let start = document.getElementById('txtstart');
    let end = document.getElementById('txtend');
    let step = document.querySelector('#txtstep');
    let res = document.querySelector('#res')

    if(start.value.length == 0 || end.value.length == 0 || step.value.length == 0){
        res.innerHTML = 'Impossivel contar... preencha os campos'
        //alert('Erro! falta dados!!')
    } else {
        res.innerHTML = 'Contando: <br>'
        let i = Number(start.value);
        let f = Number(end.value);
        let p = Number(step.value);

        if(p <= 0){
            alert('invalid step, considering step 1');
            p = 1;
        }

        if(i < f){
            // Contagem crescente
            for(var c = i; c <= f; c += p) {
                res.innerHTML += ` ${c} \u{1F449}`
            }
            // Contagem decrescente
        } else {
            for(var c = i; c > f; c -= p) {
                res.innerHTML += ` ${c} \u{1F449}`
            }
        }
        res.innerHTML += ` \u{1F3C1}`;

    }
}