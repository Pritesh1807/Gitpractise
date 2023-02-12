
//create a main class
public class Main2{


//create a static method 

static int myMethod(){
int x=5;
return x;
}

//create a fullThrottle() method 
public void fullThrottle(){
	System.out.println("The car is going as fast as it can!");
}

//create a another method speed()method 

public void speed(int maxspeed){
	System.out.println("the car is gone the speed at:" +" "+ maxspeed);
}


//create a main and call all the methods

public static void main(String[]args){
	int result=myMethod();
	System.out.println(result);
	Main2 car=new Main2();
	car.fullThrottle();
	car.speed(100);
}
}