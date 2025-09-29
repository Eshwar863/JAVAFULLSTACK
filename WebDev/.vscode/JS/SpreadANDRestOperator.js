

//// spread operator used to spread up the elements of an array or object
// and rest operator used to collect the elements of an array or object into a single variable
const numbers = [1, 2, 3, 4, 5];
const newArray  =[...numbers,1,2,3]; // Spread operator to merge arrays
console.log(newArray); // Output: [1, 2, 3, 4, 5, 1, 2, 3]


// [Running] node "c:\JAVAFULLSTACK\WebDev\.vscode\JS\SpreadANDRestOperator.js"
// [ [ 1, 2, 3, 4, 5 ], 1, 2, 3 ]
// /
// [Done] exited with code=0 in 0.259 seconds


const old ={
     name : "max",
    age : 13515
}

const newObj = {
    ...old, // Spread operator to merge objects
    marks :{
        maths :484,
        science : 454,
        english : 4545  
    }
}

console.log([old, newObj]); // Output: [ { name: 'max', age: 13515 }, { name: 'max', age: 13515, marks: { maths: 484, science: 454, english: 4545 } } ]

// [Running] node "c:\JAVAFULLSTACK\WebDev\.vscode\JS\SpreadANDRestOperator.js"
// [
//   1, 2, 3, 4,
//   5, 1, 2, 3
// ]
// [
//   { name: 'max', age: 13515 },
//   {
//     name: 'max',
//     age: 13515,
//     marks: { maths: 484, science: 454, english: 4545 }
//   }
// ]

// [Done] exited with code=0 in 0.263 seconds

// Rest operator used to collect the elements of an array or object into a single variable
function sum(...args) { // Rest operator to collect arguments into an array
    return args.reduce((acc, curr) => acc + curr, 0);
}