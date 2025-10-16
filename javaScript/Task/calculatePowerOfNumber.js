let numberBase = 2;
let number = 5;
let result = 1;

for (let index = 0; index < Math.abs(number); index++) {
    result *= numberBase;
}
if (number < 0) {
    result = 1 / result;
}
console.log(numberBase + " raised to " + number + " is " + result);