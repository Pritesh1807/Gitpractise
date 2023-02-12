class A{
int id;
String name;
A(int id, String name){
this.id=id;
this.name=name;
}
}

class B extends A{
float salary;
B(int id, String name, float salary)
{
	super(id,name);    // reusing parent constructor 
	this.salary=salary;
}
void display()
{
	System.out.println(id + " "+ name + " "+ salary);
}

public static void main(String[]args){
B b1=new B(110089516, "pritesh", 50000);
b1.display();
}
}