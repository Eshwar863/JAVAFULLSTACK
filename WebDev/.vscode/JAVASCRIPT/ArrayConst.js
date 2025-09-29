
const cars = ["BMW", "Volvo", "Ford"];



// Accessing elements in an array
function accessArrayElements() {
    console.log(cars);
    console.log(cars[0]);
    console.log(cars[2]);
}

const prompt  = require('prompt-sync')();

function All(){
let input = prompt("Enter the element :");
cars.push(input);
console.log(cars);
console.log(cars.length);

console.log(cars[cars.length - 1]);


}

accessArrayElements();
All();