
let start = 1900;
let end = 2025;
let sum = 0;

for(let count = start; count <= end; count++){
	if((count %  400 == 0)||(count % 100 != 0) && (count % 4 == 0)){
	sum += count;
	
	}
}
console.log(sum);