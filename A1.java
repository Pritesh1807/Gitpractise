interface printable{
void print();
}

class A1 implements printable{
public void print(){
	System.out.println("this is pritesh");
}

public static void main(String[]args){
A1 object= new A1();
object.print();
}
}
