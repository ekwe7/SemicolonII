
let word = "Semicolon";
let userWord = word.toLowerCase();
let reversed = "";

for (let index = userWord.length - 1; index >= 0; index--) {
    reversed += userWord[index];
}
console.log(reversed);