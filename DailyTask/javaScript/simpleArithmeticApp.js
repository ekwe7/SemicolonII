

const prompt = require('prompt-sync')();


let userName = prompt('Enter your name: ');

let start = Date.now();
let score = 0;

for (let index = 0; index < 10; index++) {
  let number1 = Math.floor(Math.random() * 101);
  let number2 = Math.floor(Math.random() * (number1 + 1));
  let rightAnswer = number1 - number2;
  let numberOfTries = 2;

  console.log('\nWhat is: ' + number1 + ' - ' + number2);

  while (numberOfTries > 0) {
    let input = prompt('Enter your answer: ');
    try {
      let answer = parseInt(input);
      if (answer === rightAnswer) {
        console.log('Correct answer');
        score++;
        break;
      } else {
        numberOfTries--;
        console.log('Incorrect answer you have ' + numberOfTries + ' left');
      }
    } catch (e) {
      numberOfTries--;
      console.log('you have ' + numberOfTries + ' left');
    }
  }

  if (numberOfTries === 0) {
    console.log('Answer was ' + rightAnswer);
  }
}


console.log('\nYour score is: ' + score + ' / 10');
