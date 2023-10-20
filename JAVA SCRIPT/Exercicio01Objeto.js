let pessoas = [];

pessoas.push({ altura: 1.80, sexo: 'M'});
pessoas.push({ altura: 1.90, sexo: 'M'});
pessoas.push({ altura: 1.50, sexo: 'F'});
pessoas.push({ altura: 1.99, sexo: 'F'});
pessoas.push({ altura: 2.80, sexo: 'M'});
pessoas.push({ altura: 1.30, sexo: 'M'});

let maior = pessoas[0].altura; 
let menor = pessoas[0].altura; 
let nrM = 0;
let nrF = 0;
let alturaF = 0;
for(let i=0; i < pessoas.length; i++ ){
    //1 questao
    if (maior < pessoas[i].altura) 
       maior = pessoas[i].altura;

    if (menor > pessoas[i].altura)   
       menor = pessoas[i].altura;

    //2 questao
    if (pessoas[i].sexo == 'F'){
        nrF++;
        alturaF += pessoas[i].altura;
    }   

    //3 questao
    if (pessoas[i].sexo == 'M')
      nrM++;
}

console.log("Maior Altura: "+maior);
console.log("Menor Altura: "+menor);
console.log("Media Mulheres: "+(alturaF/nrF));
console.log("Numero de Homens: "+nrM);


