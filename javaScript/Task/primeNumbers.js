

for (let index = 2; index <= 100; index++){

let isPrime = true;

for (let count = 2; count <= Math.sqrt(index); count++) {

if (index % count == 0) {
isPrime = false;
break;
    }

}

    if (isPrime) console.log(index);
}