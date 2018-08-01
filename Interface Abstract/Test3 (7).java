package mar12;

interface sayable
{  
    void say(String msg);   // abstract method  
}  

interface Doable extends sayable
{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  