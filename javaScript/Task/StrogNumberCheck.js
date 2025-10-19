 

let number = 6;

let sum = 0;
let temp = number;

for(; temp != 0; temp /= 10){
	let num = temp % 10;
	let factoria = 1;
	
	for(let count = 1; count <= num; count++){
		sum += factoria;
		
	}

}

if(sum == number){
console.log(number + " is strong Number");

}else
	console.log(number + " not a strong number");

