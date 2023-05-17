package com.driver;

public class Main {
    public static void main(String[] args) {
        //creating an object of B and calling the method of A in it
        B obj= new B();
        obj.meth(); //calling A class method but it got overridden already.
        obj.meth(); //calling B class Method

    }
}
 class A {
    public void meth()
    {

        System.out.println("Invoking method from class A");
    }
}
class B extends A{

    public void meth () {  //overriding the method of class A.

        System.out.println("Method is overridden in Extended class B");
    }

}

