//overriding method 
// creating a parent/super/base class 
class Parent{
void run(){
System.out.println("This is parent class");
}
}

//creating a child/extend/subclass class
class Child extends Parent{
void run(){
System.out.println("This is child class");
}

public static void main(String[]args){
Child c1= new Child();
c1.run();   //calling method
}
}

