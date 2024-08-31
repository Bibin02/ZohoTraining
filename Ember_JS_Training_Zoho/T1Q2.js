
/*
2.Write yourself a virtual cat - animals with a CLI are so much nicer than ones with fur.

Create an object that represents a cat. It should have properties for tiredness, hunger, loneliness and happiness. Next, write methods that increase and decrease those properties. Call them something that actually represents what would increase or decrease these things, like "feed", "sleep", or "pet".

Last, write a method that prints out the cat's status in each area. (Be creative e.g. Paws are really hungry, Paws is VERY happy.)

Bonus: Make the functions take arguments that increase or decrease arbitrary amounts

Bonus: Make the functions as arbitrary as cats are - sometimes make it so the cat doesn't want to be petted.
*/

let msgbox1 = document.getElementById("message-box")

class Cat{
	constructor(name){
		// _attr for private attributes.
		this._name = name;
		// tiredness, hunger, loneliness and happiness
		this._sleep = 100;
		this._food = 100;
		this._lone = 0;
		this._happy = 100;
	}
	
	catStatus(){
		let msg = "Vanakam da mapla Theni la irunthu...."
		console.log(`${this._name} says : ${msg}`)
		msgbox1.innerHTML = `${this._name} says : ${msg}`
	}
	
	feed(){
		if(!this.isFull(this._food)){
			console.log(`Feeding the ${this._name}....`)
			msgbox1.innerHTML = `Feeding the ${this._name}....`
			this._food += 10;
			this._happy += 5;
			this._sleep -= 5;
		}
		else{
			console.log("My stomach is Full..")
			msgbox1.innerHTML = "My stomach is Full.."
		}
			
	}
	
	play(){
		console.log(`Playing with the ${this._name}....`)
		msgbox1.innerHTML = `Playing with the ${this._name}....`
		this._happy += 5;
		this._sleep -= 20;
		this._food -= 10;
		this._lone -= this._lone <= 0 ? 0 : 5 ;
	}
	
	sleep(){
		if(!this.isFull(this._sleep)){
			console.log(`Now ${this._name} is sleeping....`)
			msgbox1.innerHTML = `Now ${this._name} is sleeping....`
			this._sleep = 100;
			this._lone += 20;
			this._happy += 20;
			this._food -= 5;
		}
		else {
			console.log("I'm Fresh Today..")
			msgbox1.innerHTML = "I'm Fresh Today.."
		}
	}
	
	isFull(num){
		return num >= 100;
	}
	
}

var cat1 = new Cat("POW");
	
function function2cst(){
	cat1.catStatus()
}
function function2feed(){
	cat1.feed()
}
function function2play(){
	cat1.play()
}
function function2sleep(){
	cat1.sleep()
}

function function3(){
	console.log("From Function 3")
}