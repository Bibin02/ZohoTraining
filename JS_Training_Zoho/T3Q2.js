/*
2.The objective of this fun game is to code a game where the user must guess a randomly generated number 
between 1 and 100. You, too, can build this game.
*/

flag = false;

function inputreturner(){
    return Number(document.getElementById("guess").value)
}

function numberGen() {
    return Math.floor(Math.random()*100)
}

function guess(input, randomnumber){
    if (input == randomnumber) {
        console.log("Match Found")
        document.getElementById("result6").innerHTML = "Found the Match"
        flag = false;

    } else if(input > randomnumber){
        console.log("Guess is too High")
        document.getElementById("result6").innerHTML = "Guess is too High"
    }
    else{
        console.log("Guess too Low")
        document.getElementById("result6").innerHTML = "Guess is too Low"
    }
}

let randomnumber = numberGen()

function callguess(){

    if (flag) {
        console.log(randomnumber)
        guess(inputreturner(), randomnumber)

    } else {
        randomnumber = numberGen()
        guess(inputreturner(), randomnumber)
        flag = true;
    }
}