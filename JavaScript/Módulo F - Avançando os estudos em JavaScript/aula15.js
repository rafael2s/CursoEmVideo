let num = [2,5,8,1,6];

console.log(`O vetor é ${num}`);
console.log(`O vetor em ordem crescente ${num.sort()}`)
console.log(`O vetor tem ${num.length} posições`);

for(let pos = 0; pos < num.length; pos++){
    console.log(`A posição ${pos}, tem o valor ${num[pos]}`)
}

// Escrista somente para arrays e objects
for(let pos in num){
    console.log(num[pos])
}