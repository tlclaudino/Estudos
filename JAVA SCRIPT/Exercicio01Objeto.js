let pessoas = [];

let pessoa = {
              nome:'Marcelo'
              idade: 44
             }

pessoas.push(pessoa)

 

alturas.push(1.80); //0
alturas.push(1.60); //1
alturas.push(1.50); //2
alturas.push(1.90); //3
alturas.push(2.90); //3

 

sexos.push('M'); //0
sexos.push('M'); //1
sexos.push('F'); //2
sexos.push('F'); //3
sexos.push('M'); //1

 

let maior = alturas[0]; //1.80
let menor = alturas[0]; //1.80
let nrM = 0;
let nrF = 0;
let alturaF = 0;
for(let i=0; i < alturas.length; i++ ){
    //1 questao
    if (maior < alturas[i]) 
       maior = alturas[i];

 

    if (menor > alturas[i])   
       menor = alturas[i];

 

    //2 questao
    if (sexos[i] == 'F'){
        nrF++;
        alturaF += alturas[i];
    }   

 

    //3 questao
    if (sexos[i] == 'M')
      nrM++;
}

 

console.log("Maior Altura: "+maior);
console.log("Menor Altura: "+menor);
console.log("Media Mulheres: "+(alturaF/nrF));
console.log("Numero de Homens: "+nrM);