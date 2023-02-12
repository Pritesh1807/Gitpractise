//Object and Class Example: Initialization through method

class Student{
int id;
String name;
void insertrecord(int i, String n){
id=i;
name=n;
}
void displayinformation(){System.out.println(id+" "+name);}
}
class TestStudent{
public static void main(String[]args){
Student s1=new Student();
Student s2=new Student();
s1.insertrecord(111,"Pritesh");
s2.insertrecord(222,"Mayank");
s1.displayinformation();
s2.displayinformation();
}
}