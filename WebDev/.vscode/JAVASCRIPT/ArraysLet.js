/// Storing in single variable
let car1 = "BMW";
let car2 = "Volvo";
let car3 = "Ford";


/// Creating Array using Literal
/// Empty Array

function createArray() {
let a = [];
console.log(a);
}


/// Creating an Array and Initializing with Values
function ArrayInitialization() {
let b = [12,23,45,56,478];

console.log(b);
console.log(b[0]);
console.log(b[6]);
}

//// Strings
function StringArray() {
let x = ["BMW","Volvo","Ford"];
console.log(x);
console.log(x[6515]);
}


/// modify an array
function modifyArray(w,x,y,z) {
    console.log("Enter the two index values and then values to be replaced");
    let w = prompt("Enter the first index value");
    let x = prompt("Enter the second index value");
    let y = prompt("Enter the value to be replaced at the",w,"index");
    let z = prompt("Enter the value to be replaced at the",x,"index");
    
x[w] = y;
console.log(x);
x[x] = z;
console.log(x);
}


/// Adding an element to the end of the array
function addElementToEnd() {
    let b = prompt("Enter the Element to be added to the end of the array");
x.push(b);
console.log(x);
}

/// Adding an element to the beginning of the array
function addElementToBeginning(b) {
    let b = prompt("Enter the Element to be added to the beginning of the array");
console.log("Before",x);
x.unshift(b);
console.log("After",x);
}
/// Removing the last element of the array
function removeLastElement() {
    console.log("Removing the last element of the array");
x.pop();
console.log(x);
}

function removeElementAtIndex() {
let index = prompt("Enter the index of the element to be removed");
x.pop(1);
console.log(x);
}
/// Removing the first element of the array
function removeFirstElement() {
console.log("Removing the first element of the array");
    x.shift();
    console.log(x);
}

/// Finding the length of the array
function findLength() {
    console.log("Length of the array is", x.length);
}

/// Finding the index of an element in the array
function findIndexOfElement() {
    let element = prompt("Enter the element to find its index");
    let index = x.indexOf(element); 
}

function spliceArray() {
    let start = prompt("Enter the index to start splicing");
    let deleteCount = prompt("Enter the number of elements to delete");
    // let newElement = prompt("Enter the new element to be added"); 
    // x.splice(start, deleteCount, /*newElement*/ );  
    x.splice(start, deleteCount);
    console.log(x);
}   