
let number = 23415;
let original = number;
let reversed = 0;

for(; number > 0; number = Math.floor(number / 10)){
    let digit = number % 10;
    reversed = reversed * 10 + digit;
}
if(original == reversed){
    console.log(original + " number is palindrome");
    
} else{

    console.log(original + " not palindrome");
}