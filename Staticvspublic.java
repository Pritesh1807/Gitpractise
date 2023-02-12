public class Staticvspublic{
// static method
static void mystaticmethod(){
	System.out.println("Hi, I am pritesh patel");
}

//public method 
public void mypublicmethod(){
	System.out.println("I am Umang usdadiya");
}

//main method 

public static void main (String[]args){
mystaticmethod();   // call the static method 
Staticvspublic object1= new Staticvspublic();
object1.mypublicmethod();    // calling the public method by creating an object1

}
}