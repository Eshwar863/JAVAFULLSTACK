package org.example.OOPS.Polymorphism;

 class O {
     void show(){
         System.out.println("O");
     }
}

class A extends O{
  void show(){
      System.out.println("A");
  }


    public static void main(String[] args) {
        O o = new A();
        o.show(); /// here the memory is allocated to O class first and the to chlild class
        /// so the method with same name and same accessmodifiers then the method in child will override
        ///  here the obj is created at runtime so this is Runtimme Polymorphism3
    }
}
