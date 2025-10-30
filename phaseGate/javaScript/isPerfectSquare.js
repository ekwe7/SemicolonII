
function isPerfectSquare(number){

let result = new Array(number.length);

for(let count = 0; count < number.length; count++){

if(count ** 2 % 2 == 0){

result[count] = "True";
}else{
result[count] = "False";
}
}
return result;
}

let myNumbers = [4, 9, 25, 49];
let myResult = isPerfectSquare(myNumbers);
console.log(myResult);