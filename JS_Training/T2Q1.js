/*
1.Write a JavaScript program to implement a function closures
*/

// Define an outer function that returns an inner function
function createCounter() {
    // Define a variable that will be closed over
    let count = 0;

    // Define and return an inner function that accesses the `count` variable
    return function() {
        count += 1; // Increment the count
        return count; // Return the updated count
    };
}

// Create a counter instance
const counter1 = createCounter();

// Use the counter
console.log(counter1()); // Output: 1
console.log(counter1()); // Output: 2
console.log(counter1()); // Output: 3

// Create another counter instance
const counter2 = createCounter();

// Use the new counter
console.log(counter2()); // Output: 1
console.log(counter2()); // Output: 2
