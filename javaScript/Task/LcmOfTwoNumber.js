
let number1 = 56;

let number2 = 3;

let lcmNumber;

if (number1 > number2){
	lcmNumber = number1;
}else{
	lcmNumber = number2;
}


for(; lcmNumber <= number1 * number2; lcmNumber++){
	if(lcmNumber % number1 ==0 && lcmNumber %number2 == 0){
	}
}
console.log(lcmNumber);

