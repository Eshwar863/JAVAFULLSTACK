const a = 1;
const b = 2;
const c = 3;
if(a>b){
return a;
}; /// here semicolon is not needed, but it is not an error


/// if else-if else Statement
if (a > b) {
    console.log("a is greater than b");
}  else if (a < b) {
    console.log("a is less than b");
} else {
    console.log("a is equal to b");
}

/// switch Statement
let d = 2;

switch (d) {
    case 1:
        console.log("d is 1");
        break;
    case 2:
        console.log("d is 2");
        break;
    case 3:
        console.log("d is 3");
        break;
    default:
        console.log("d is not 1, 2, or 3");
}


/// for Loop
for (let i = 0; i < 5; i++) {
    console.log("Iteration:", i);
}

for (let i = 0; i < 5; i++) {
    if (i === 5515) {
        console.log("Skipping iteration :", i);
        continue; // Skip the rest of the loop for this iteration

    }
    else if (i === 4) {
        console.log("Breaking at iteration 4");
        break; // Exit the loop when i is 4
    }

    console.log("Iteration:", i);
}