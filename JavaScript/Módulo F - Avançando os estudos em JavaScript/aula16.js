//Função-01 para descobrir se o numero é par ou impar!
function parimpar(n){
    if(n%2==0){
        return "PAR"
    } else {
        return "IMPAR"
    }
}
console.log(parimpar(3));

// Função-02 para somar valores
function soma(n1=0,n2=0){ // atribuir valor 0 no paramatro... sera o valor defaut, caso na chamada da função não seja passado 2 valores.
    return n1 + n2;
}
console.log(soma(5, 7));

//Função-03 Jogar uma função dentro de uma variavel.
let v = function(x){
    return x * 2;
}
console.log(v(3));

//Função-04 - Calcular fatorial de um numero
//Exemplo - 5! = 5 x 4 x 3 x 2 x 1

// function fatorial(n){
//     let fat = 1;
//     for(let c = n; c > 1; c--){
//         fat = fat * c
//     }
//     return fat;
// }
// console.log(fatorial(5))

//Função-05 - Fatorial de maneira recursiva
function fatorial(n){
    if(n == 1){
        return 1
    } else {
        return n * fatorial(n-1)
    }
    console.log(fatorial(5))
}