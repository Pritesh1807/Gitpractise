//public class Main{
//static void myMethod(String fname, int age){
//System.out.println(fname + " Patel " + " is " + age + " older ");
//}
//public static void main(String[]args){
//myMethod("Pritesh", 23);
//myMethod("Umang", 22);
//myMethod("Roshan", 26);
//}
//}


// method overloading we can use the same method for two multiple parameters and arguments. 
public class Main{
static int myMethod(int x, int y){
    return x+y;
    }    
static float myMethod(float x, float y){
    return x+y;
    }
public static void main(String[]args){
    int z= myMethod(10,20);
    float y=myMethod(10,20);
        System.out.println("int:" + z);
        System.out.println("float:" + y);
    }
}