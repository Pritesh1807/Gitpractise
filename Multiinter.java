interface printable{
void print();
}

interface showable extends printable{
void show();
}

interface writable extends showable{
void write();
}

public class Multiinter implements printable,showable,writable{
public void print(){
	System.out.println("I can print the numbers");
}

public void write(){
	System.out.println("I can write for you.");
}

public void show(){
	System.out.println("I can show you");
}


public static void main(String[]args){
Multiinter obj= new Multiinter();
obj.print();
obj.write();
obj.show();
}
}
