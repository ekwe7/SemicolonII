

let number = 1234569;
let reversedNumber = 0;


for (; number > 0; number = Math.floor(number / 10)){

    reversedNumber = reversedNumber * 10 + number % 10;
}


console.log(reversedNumber);