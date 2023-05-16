package com.driver;

public class Main {
    public static void main(String[] args) {
        //creating an object of B and calling the method of A in it
        B obj= new B();
        String class1=obj.meth(); //calling A class method but it got overridden already.
        String class2=obj.meth(); //calling B class Method
        System.out.println(class1);
        System.out.println(class2);
    }
}
 class A {
    public String meth()
    {
        return "Invoking method from class A";
    }
}
class B extends A{

    public String meth () {  //overriding the method of class A.

        return "Method is overridden in Extended class B";
    }

}

