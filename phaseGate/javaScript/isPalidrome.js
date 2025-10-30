function isPalindrome(words){

let result = new Array(words.length);

for(let index = 0; index < words.length; index++){
let word = words[index];
let reversed = "";

for(let count = word.length - 1; count >= 0; count--){
reversed += word[count];
}

if(word === reversed){
	result[index] = "True";
}else{

	result[index] = "False";
}


}

return result;
}


let myList = ["madem", "racecar", "hello", "noon"];

let output = isPalindrome(myList);
console.log(output)