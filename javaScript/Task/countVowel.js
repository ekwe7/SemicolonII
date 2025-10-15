

let vowel = ["a", "o", "e", "i", "u"];
let word = "welcome to Semicolon"
let counter = 0;

for(let index = 0; index < word.length; index++){
	for(let count = 0; count < vowel.length; count++){
		if(word[index].trim().toLowerCase() == vowel[count]){
		counter++
		}
	}
}

console.log(counter);



