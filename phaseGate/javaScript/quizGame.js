
function questionGame(){
let userquestion = [
    {
      myQuestion: "What is the capital of France",
      myOptions: ["paris", "London", "Berlin", "Rome"],
      userAnwser: "paris"
      
	},
	
	{
	myQuestion: "WHat is the capital of Nigeria",
	myOptions: ["Lagos", "Semicolon", "Abuja"],
	userAnwser: "Abuja"
	},
	
	{
	myQuestion: "what is the capital of lagos",
	myOptions: ["yaba", "Abagana", "Lagos", "warry"],
	userAnwser: "Lagos"
	},
	
	{
	myQuestion: "what is the name of Semicolon Chief",
	myOptions: ["Mr Sikiru", "Mr Femi", "Mr Sam", "I am"],
	userAnwser: "Mr Sam"
	}
	
	
];

return questions;
};

const prompt = require("prompt-sync")();

const myList = [
questionHistory = [],
incorrectAnswers = []

]


function quizGame(){

let gameQuiz = questionGame();

 
let counter = 0;
for(let count = 0; count < userquestion.length(); count++){
let mainGame = userquestion[count];

let result = mainGame.myQuestion;
console.log(result);

let useResponse = prompt("What is the anwser: ");

if (userResponse === mainGame.userAnwser){
	console.log("Correct Anwaers");
	questionHistory.anwser.push(userquestion.userAnwser);
	
}


}



}