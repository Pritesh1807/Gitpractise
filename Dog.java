public class Dog{

String name;
String breed; 
int age;
String color;

public Dog(String name, String breed, int age, String color){
this.name=name;
this.breed=breed;
this.age=age;
this.color=color;
}

public String getName()
{
return name;
}

public String getBreed()
{
return breed;
}

public int getAge()
{
return age;
}
public String getColor()
{
return color;
}

public String toString()
{
return ("Hi my name is:"+this.getName()+"my breed, age and color are:"+ this.getBreed()+" "+this.getAge()+ " "+this.getColor());
}


public static void main(String[]args){
Dog d1=new Dog("Hency", "husky", 5, "white");
System.out.println(d1.toString());
}
}