
let number = 12;
let count = 0;

for (let index = 1; index <= number; index++) {
    if (number % index == 0) {
        count++;
    }
}
console.log("Number of divisors is " + count);
