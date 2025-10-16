let number = 123459;
let largest = 0;

let num = number.toString();

for(let index = 0; index < num.length; index++){
	
	let output = parseInt(num[index]);
	
	if(output > largest){
	largest = output
	}
	
}

console.log(largest);
