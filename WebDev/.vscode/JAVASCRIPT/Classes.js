 class A{
    constructor(car){
        this.car = car;
    }   
    present(){
    return "i have " + this.car;
    }
    }

 class B extends A{

    constructor(car, model){
        super(car);
        this.model = model;
    }

    show(){

       return this.present() + " it is a " + this.model;
    }
    }

    let mycar = new B("ford", "Ecosport");
    console.log(mycar.show());
    