
class Calculator { 
  a = 10;
  result = 0;
  constructor() {
    this.result = 0; // Initialize result
  }

  add() {
    return this.a + 12;
  }

  get name() {
    return this.constructor.name;
  }
}

const calc = new Calculator();
console.log(calc.add()); // Output: 22
console.log(calc.name); // Output: Calculator
console.log(calc.result); // Output: 0