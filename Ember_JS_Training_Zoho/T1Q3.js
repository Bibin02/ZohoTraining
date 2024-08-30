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
}

class BookList{
	
	constructor(){
		this._next = null
		this._curr  = null
		this._prev  = null
		this._bookarr  = []
		this._totalbooks  = this._bookarr.length
		this._readCount = 0
	}
	
	addBook(Book){
		this._bookarr = [...this._bookarr, Book]
		this._totalbooks += 1;
	}
	
	finishCurrentBook(){
		
	}
	
	
	
}
function function3(){
	console.log("From Function 3")
}