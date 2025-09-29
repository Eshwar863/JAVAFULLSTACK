
/// This is a Comment
console.log("Hello World");
// To run this code, use the command:
// node hello.js

/// Variables in JS

/// var is function-scoped or globally-scoped and can be reassigned
var x = 10;
var y = 20;
console.log("x:", x, "y:", y);

 x = 30; // Reassigning x is allowed
 var y = 50; // Re-declaring y is allowed in the same scope 
console.log("Reassigned x:", x);

/// Introduced in ES6 let and const
let z = 40; // let is block-scoped and can not be re declared in same scope.
z = 50; // Reassigning z is allowed
/// let z = 60; // This will throw an error: Identifier 'z' has already been declared
console.log("z:", z);

const a = 100; // const is block-scoped and cannot be reassigned
// a = 200; // This will throw an error: Assignment to constant variable
console.log("a:", a);

/// Data Types in JS    
/// JavaScript has dynamic typing, meaning variables can hold any type of data
let number = 42; // Number
let string = "Hello"; // String
let boolean = true; // Boolean
let object = { key: "value" }; // Object
let array = [1, 2, 3]; // Array
let nullValue = null; // Null
let undefinedValue; // Undefined
let symbolValue = Symbol("unique"); // Symbol (ES6)
console.log("Data Types:");
console.log("Number:", number);
console.log("String:", string);
console.log("Boolean:", boolean);
console.log("Object:", object);
console.log("Array:", array);
console.log("Null:", nullValue);
console.log("Undefined:", undefinedValue);
console.log("Symbol:", symbolValue);


