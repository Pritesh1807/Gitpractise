// creating a abstract class with absctract method and constructor 

abstract class Bike{
Bike(){
	System.out.println("This is bike constructor");
}
abstract void run();
void gear(){
	System.out.println("Gear is changed");
}
}

// creating a child class 

class Honda extends Bike{
void run(){
	System.out.println(" This is Honda Amaze");
}
}

class Testing{
public static void main(String[]args){
	Bike b1= new Honda();
	b1.run();
	b1.gear();
}
}