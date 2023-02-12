public class Constructor{
int modelYear;
String modelName;


public Constructor(int y, String n){
modelYear=y;
modelName=n;
}

public static void main(String[]args){
Constructor car= new Constructor(1999, "Volvo xc 90");
System.out.println(car.modelYear + " " + car.modelName);
}
}