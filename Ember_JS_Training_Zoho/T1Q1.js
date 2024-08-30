/*
1.Create a class called Person which accepts the name of a person as a string, and his/her age as a number.

The Person class should have a method called describe 
which returns a string with the following syntax: "name, age years old". 
So for example, if John is 19 years old then the function describe of his object will return "John, 19 years old".
*/
class Person{
	constructor(name, age){
		// _attr for private attributes.
		this._name = name;
		this._age = age;
	}
	
	display(){
		console.log(` 
		Name is ${this._name} \nAge is ${this._age}`.trim())
	}
	}
	
function function1(){
	console.log("From Function 1")
	
	let person1 = new Person("John Smith", "19");
	
	person1.display();
	
}