
const [a, b, c] = [1, 2, 3]; // a = 1, b = 2, c = 3
const [x, y, z] = [4, 5]; // x = 4, y = 5, z = undefined

const [first, ...rest] = [1, 2, 3, 4]; // first = 1, rest = [2, 3, 4]
const [head, ...tail] = [10, 20, 30]; // head = 10, tail = [20, 30]
const [one, two, three] = [1]; // one = 1, two = undefined, three = undefined

const person = {name: 'Alice', age: 30, city: 'Wonderland'};

console.log(a); // 1
    
