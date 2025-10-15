
let word = "hello welcome to Semicolon";
let count = 0;

for(let counter = 0; counter < word.length; counter++){
	if(word[counter].trim().toLowerCase() == "c"){
	count += 1;
	}
	
}
console.log(count)

