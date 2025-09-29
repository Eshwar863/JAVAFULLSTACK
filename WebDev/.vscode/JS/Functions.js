
var a = 4561; /// global scope variable

function show(){
    var a = 100; /// local scope variable
    console.log(a); /// outer scope
    {
        var a = 1651; /// inner scope variable
        console.log(a); /// inner scope
        /// var can be redeclared in the same scope
        /// let and const cannot be redeclared in the same scope
    }

    console.log(a);
}

show();  //// 100
/// 1651
/// 1651

 console.log(a);
//  [Running] node "c:\JAVAFULLSTACK\WebDev\.vscode\JAVASCRIPT\Functions.js"
// 100
// 1651
// 1651
// 4561

// [Done] exited with code=0 in 0.271 seconds


const a = show(); /// This will not work because 'a' is already declared in the global scope

function add(g, b) {

}

// arrow function
const arrowFunction = B => {
   console.log(B);
}


/// Array functions
const numbers = [1, 2, 3, 4, 5];

/// Array.prototype.map() is used to create a new array with the results of calling a provided function on every element in the calling array.
/// It does not modify the original array and returns a new array with the transformed values.
const doubledNumbers = numbers.map(num => num * 2);

