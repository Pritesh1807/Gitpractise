class Employee{
float salary=40000;
}
class Programmer extends Employee{
int bonus=10000;
public static void main(String[]args){
Programmer e1=new Programmer();
System.out.println(e1.salary);
System.out.println(e1.bonus);
}
}


