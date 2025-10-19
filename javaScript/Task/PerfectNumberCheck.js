
let number = 145;
let sum = 0;

for (let num = 1; num <= Math.floor(number / 2); num++) {
    if (number % num == 0) {
        sum += num;
    }
}
if (sum == number) {
    console.log(number + " is a perfect number");
} else {
    console.log(number + " is not a perfect number");
}