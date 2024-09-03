/*

3.The Reading List  

An object-oriented book-list!

Create a class BookList

Create another class called Book

BookLists should have the following properties:

Number of books marked as read

Number of books marked not read yet

A reference to the next book to read (book object)

A reference to the current book being read (book object)

A reference to the last book read (book object)

An array of all the Books

Each book should have several properties:

Title

Genre

Author

Read (true or false)

Read date, can be blank, otherwise needs to be a JS Date() object

Every book list should have a few methods:

.add(book)

should add a book to the books list.

.finishCurrentBook()

should mark the book that is currently being read as "read"

Give it a read date of new Date (Date.now())

Change the last book read to be the book that has just finished

Change the current book to be the next book read

Change the next book to be read property to be the first unread book you find in the list of books

*/

class Book{
	constructor(title, genre){
		this._title = title
		this._genre = genre
		this._read  = false
		this._date  = null
	}
	
	set read(bool){
		this._read = bool
	}
	
	set date(date){
		this._date = date
	}
	
	get date(){
		return this._date;
	}
	get read(){
		return this._read;
	}
	get title(){
		return this._title;
	}
	get genre(){
		return this._genre;
	}
}

let msgbox2 = document.getElementById("t3-log")

class BookList{
	
	constructor(){
		this._next = 1
		this._curr  = 0
		this._prev  = -1
		this._bookarr  = []
		this._totalbooks  = 0
		this._readCount = 0
	}
	
	addBook(Book){
		msgbox2.innerHTML = ""
		Book._date = new Date()
		this._bookarr.push(Book)
		this._totalbooks += 1;
		msgbox2.innerHTML = "Book "+Book.title+" Added Successfully"
	}
	
	finishCurrentBook(){
		msgbox2.innerHTML = ""
		if(this._next <= this._totalbooks){
			let currentBook = this._bookarr[this._curr];
            currentBook.read = true;
            currentBook.date = new Date();
			msgbox2.innerHTML = `Successfully Read (Book Name): ${currentBook.title}`
			this._prev += 1
			this._curr += 1
			this._next += 1
		}
		else{
			msgbox2.innerHTML = "Completed All Books"
		}
	}

	displayBooks(){
		msgbox2.innerHTML = "<ul>"
		for (let index = 0; index < this._totalbooks; index++) {
			msgbox2.innerHTML += "<li>"+" Book Name : "+this._bookarr[index].title+" Book Genre : "+
				this._bookarr[index].genre+" Read Status : "+((index <= this._prev) ? "True" : "False")+"</li>"
		}
		msgbox2.innerHTML += "</ul>"
	}

	displayReadBooks(){
		msgbox2.innerHTML = "<ul>"
		for (let index = 0; index <= this._prev; index++) {
			msgbox2.innerHTML += "<li>"+" Book Name : "+this._bookarr[index].title+" Book Genre :"+this._bookarr[index].genre+ "</li>"
		}
		msgbox2.innerHTML += "</ul>"
	}
}

var booklist = new BookList();

document.getElementById("t3-f1").addEventListener("click", ()=>{
	let bkname = prompt("Enter Book Name: ")
	let bkgenre = prompt("Enter Book Genre: ")
	booklist.addBook(new Book(bkname, bkgenre))
})

document.getElementById("t3-f2").addEventListener("click", ()=>booklist.displayBooks())
document.getElementById("t3-f3").addEventListener("click", ()=>booklist.displayReadBooks())
document.getElementById("t3-f4").addEventListener("click", ()=>booklist.finishCurrentBook())