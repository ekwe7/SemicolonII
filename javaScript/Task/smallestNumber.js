
let number = 123459;
let smallest = 1;

let num = number.toString();

for(let index = 1; index < num.length; index++){
	
	let output = parseInt(num[index]);
	
	if(output < smallest){
	smallest= output
	}
	
}

console.log(smallest);