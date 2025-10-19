

let number1 = 43;
let number2 = 6;

let gcd = 1;
let total;

if(number1 > number2){
	total = number1;
}else{
	total = number2;
}

for(let count = 1; count <= total; count++){
	if(number1 % count == 0 && number2 % count ==0){
	gcd = count;
	}

}
console.log(gcd);
	