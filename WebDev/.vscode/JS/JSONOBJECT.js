

const person = {
    name : "max",
    age : 13515,
    marks :{
        maths :484,
        science : 454,
        english : 4545  
    }
}

const person2 = person; // This will create a reference to the same object

// To create a deep copy of the object, you can use JSON methods
const person3 = JSON.parse(JSON.stringify(person));

// Modifying person2 will affect person since they reference the same object
person2.name = "John";

// Modifying person3 will not affect person or person2 since it's a deep copy
person3.name = "Doe";
console.log(person.name); // Output: John
console.log(person2.name); // Output: John