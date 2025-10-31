
let parkingLot = { 
slotNumber1: {carNumber: 0 }, 
slotNumber2: {carNumber: 0 }, 
slotNumber3: {carNumber: 0 }, 
slotNumber4: {carNumber: 0 }, 
slotNumber5: {carNumber: 0 }, 
slotNumber6: {carNumber: 0 }, 
slotNumber7: {carNumber: 0 }, 
slotNumber8: {carNumber: 0 }, 
slotNumber9: {carNumber: 0 }, 
slotNumber10: {carNumber: 0 }, 
slotNumber11: {carNumber: 0 }, 
slotNumber12: {carNumber: 0 }, 
slotNumber13: {carNumber: 0 }, 
slotNumber14: {carNumber: 0 }, 
slotNumber15: {carNumber: 0 }, 
slotNumber16: {carNumber: 0 }, 
slotNumber17: {carNumber: 0 }, 
slotNumber18: {carNumber: 0 }, 
slotNumber19: {carNumber: 0 }, 
slotNumber20: {carNumber: 0 }
 
  };



let carKeys = Object.keys(parkingLot);

function parkMyCar(carNumber){

for (let index = 0; index < carKeys.length; index++){

if(parkingLot[carKeys[index]].carNumber == 0){

parkingLot[carKeys[index]].carNumber = carNumber;

      return carNumber;
    }
    
  }
  
  console.log("Not Slot available Chief");
}



function leaveCarSlot(carSlotNumber){

let eachSlot = carSlotNumber;

if (parkingLot[eachSlot] && parkingLot[eachSlot].carNumber != 0){

	console.log(`Car ${parkingLot[eachSlot].carNumber} left ${eachSlot}`);
	parkingLot[eachSlot].carNumber = 0;

}else{
    return "car slot is already empty";

}
  
}


const prompt = require("prompt-sync")();

let choice = 0;


while (true){

console.log("\n==== DADDY PARKING SLOT====");

console.log("1. Enter CarPAck");
console.log("2. Remove Car From CarPack");
console.log("0. Exit");

userInput= prompt("Enter your choice: ");

switch (userInput){
    case "1":
      let carNumber = prompt("Enter car number: ");
      parkMyCar(carNumber);
      break;
      
    case "2":
      let slotNumber = prompt("Enter your slot number: ");
      leaveCarSlot(parseInt(slotNumber));
      break;
      
    case "0":
      console.log("See you later boi");
      process.exit();
      
    default:
      console.log("Invalid");
      
  }
  
}


